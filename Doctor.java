import java.util.ArrayList;
public class Doctor {
    private String doctorName;
    private int doctorAge;
    private String doctorGender;
    private String doctorSpecialization;

    public Doctor(String doctorName, int doctorAge, String doctorGender, String doctorSpecialization) {
        this.doctorName = doctorName;
        this.doctorAge = doctorAge;
        this.doctorGender = doctorGender;
        this.doctorSpecialization = doctorSpecialization;
    }

   public static void viewAllDoctors(ArrayList<Doctor> doctors) {
    if (doctors.isEmpty()) {
        System.out.println("\n          No doctor records. The list is empty.");
    } else {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                List of All Doctors");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < doctors.size(); i++) {
            Doctor doctor = doctors.get(i);
            System.out.println("\nDoctor Name: " + doctor.doctorName+ "    Age: " + doctor.doctorAge+ "    Gender: " + doctor.doctorGender+ "    Specialization: " + doctor.doctorSpecialization);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
}
