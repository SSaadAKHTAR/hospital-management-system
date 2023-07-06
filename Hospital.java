            // Syed saad akhtar 22sp-029-cs
            // Kinza Fatima     22sp-032-cs

import java.util.Scanner;
import java.util.ArrayList;

class Hospital {
    public static void main(String[] args) {
        boolean exit = false;
        boolean running = true;
        ArrayList<patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();

        Scanner input = new Scanner(System.in); // object of scanner to take inputs
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t    *WELCOME TO HOSPITAL MANAGEMENT SYSTEM*  ");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        
        while (!exit) {
            System.out.println("\n                    1.   Add New Doctor");
            System.out.println("                    2.   Add New Patient");
            System.out.println("                    3.   View All Doctors");
            System.out.println("                    4.   View All Patients");
            System.out.println("                    5.   Search Patient by Name");
            System.out.println("                    6.   Sort Patients by Names");
            System.out.println("                    7.   Sort Patients by Age");
            System.out.println("                    8.   Sort Patients by Gender");
            System.out.println("                    9.   Sort Patients by Blood Group");
            System.out.println("                    10.  Exit");

            System.out.print("\n                Please Enter your choice: ");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    // Add new Doctor
                    do {
                        System.out.print("\nEnter Doctor's Name: ");
                        String doctorName = input.next();
                        System.out.print("Enter Doctor's Age: ");
                        int doctorAge = input.nextInt();
                        System.out.print("Enter Doctor's Gender (M/F): ");
                        String doctorGender = input.next();
                        System.out.print("Enter Doctor's Specialization: ");
                        String doctorSpecialization = input.next();
                        Doctor newDoctor = new Doctor(doctorName, doctorAge, doctorGender, doctorSpecialization);
                        doctors.add(newDoctor);
                        System.out.println("\nDoctor added successfully!");

                        System.out.print("\nDo you want to add more doctors? (yes/no): ");
                        String continueChoice = input.next();
                        if (continueChoice.equalsIgnoreCase("no")) {
                            System.out.println("\nReturning to the main menu.");
                            break; // Exit the loop if the user chooses not to add more doctors
                        } else {
                            System.out.println("Continuing to add new doctors.");
                        }
                    } while (true);
                    break;

                case 2:
                    // Add new Patient
                    do {
                        System.out.print("\nEnter Patient's Name: ");
                        String name = input.next();
                        System.out.print("Enter Patient's Age: ");
                        int age = input.nextInt();
                        System.out.print("Enter Patient's Gender (M/F): ");
                        String gender = input.next();
                        System.out.print("Enter Patient's Phone Number: ");
                        String phoneNumber = input.next();
                        System.out.print("Enter Patient's Blood Group: ");
                        String bloodGroup = input.next();
                        System.out.print("Enter Patient's Disease: ");
                        String disease = input.next();

                        patient newPatient = new patient(name, age, gender, phoneNumber, bloodGroup, disease);
                        patients.add(newPatient);
                        System.out.println("\nPatient added successfully!");

                        System.out.print("\nDo you want to add more patients? (yes/no): ");
                        String ch = input.next();
                        if (ch.equalsIgnoreCase("no")) {
                            running = false;
                            System.out.println("\nReturning to the main menu.");
                            break; // Exit the loop if the user chooses not to add more patients
                        } else {
                            System.out.println("Continuing to add new patients.");
                        }
                    } while (running);
                    break;

                case 3:
                    // View all Doctors
                    Doctor.viewAllDoctors(doctors);
                    break;

                case 4:
                    // List all Patients
                    patient.viewAllPatients(patients);
                    break;

                case 5:
                    // Search Patient by Name
                    System.out.print("\nEnter the name of the patient to search: ");
                    String searchName = input.next();
                    patient.searchPatientByName(patients, searchName);
                    break;

                case 6:
                    // Sort Patients by Names
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t    List of Patients Sorted by Names");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    patient.printSortedPatientsByName(patients);
                    break;

                case 7:
                    // Sort Patients by Age
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t    List of Patients Sorted by Age");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    patient.sortPatientsByAge(patients);
                    break;

                case 8:
                    // Sort Patients by Gender
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t    List of Patients Sorted by Gender");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    patient.sortPatientsByGender(patients);
                    break;

                case 9:
                    // Sort Patients by Blood Group
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\t\t\t\t\t\t    List of Patients Sorted by Blood Group");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
                    patient.sortPatientsByBloodGroup(patients);
                    break;

                case 10:
                    // Exit
                    System.out.println("\nExiting...");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
