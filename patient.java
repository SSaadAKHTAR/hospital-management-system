import java.util.ArrayList;
public class patient {
    private String name;
    private int age;
    private String gender;
    private String phoneNumber;
    private String bloodGroup;
    private String disease;

    public patient(String name, int age, String gender, String phoneNumber, String bloodGroup, String disease) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
        this.disease = disease;
    }
    public static void patientdetail(ArrayList<patient> patients){
        for (int i = 0; i < patients.size(); i++) {
            patient patient = patients.get(i);
            System.out.println("\nPatient Name: " + patient.name + "    Age: " + patient.age+ "  Gender: " + patient.gender + "  Phone Number: " + patient.phoneNumber+"  Blood Group: " + patient.bloodGroup +"  Disease: " + patient.disease);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
 public static void viewAllPatients(ArrayList<patient> patients) {
    if (patients.isEmpty()) {
        System.out.println();
        System.out.println("            No patient records. The list is empty.");
    } else {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t    List of All Patients");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < patients.size(); i++) {
            patient patient = patients.get(i);
            System.out.println("\nPatient Name: " + patient.name + "    Age: " + patient.age+ "  Gender: " + patient.gender + "  Phone Number: " + patient.phoneNumber+"  Blood Group: " + patient.bloodGroup +"  Disease: " + patient.disease);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}

    // SORT PATIENTS insertion sort
    public static void sortByName(ArrayList<patient> patients) {
        int n = patients.size();
        for (int i = 1; i < n; i++) {
            patient key = patients.get(i);
            int j = i - 1;
            while (j >= 0 && compareNames(patients.get(j).name, key.name) > 0) {
                patients.set(j + 1, patients.get(j));
                j--;
            }
            patients.set(j + 1, key);
        }
    }
     //print sorted patients by name
    public static void printSortedPatientsByName(ArrayList<patient> patients) {
        sortByName(patients);
        patientdetail(patients);
    }
    // Method to compare patient names
   private static int compareNames(String name1, String name2) {
    // Convert both names to lowercase to make the comparison case-insensitive
    String lowercaseName1 = name1.toLowerCase();
    String lowercaseName2 = name2.toLowerCase();

    // Compare the lowercase names character by character
    for (int i = 0; i < lowercaseName1.length() && i < lowercaseName2.length(); i++) {
        char char1 = lowercaseName1.charAt(i);
        char char2 = lowercaseName2.charAt(i);

        if (char1 < char2) {
            return -1; // name1 should come before name2
        } else if (char1 > char2) {
            return 1; // name1 should come after name2
        }
    }
    // If both names have common characters up to the length of the shorter name,
    // the shorter name should come before the longer name
    if (lowercaseName1.length() < lowercaseName2.length()) {
        return -1;
    } else if (lowercaseName1.length() > lowercaseName2.length()) {
        return 1;
    }
    return 0; // Both names are equal
}
    //sort patients by age using insertion sort
public static void sortPatientsByAge(ArrayList<patient> patients) {
    int n = patients.size();
    for (int i = 1; i < n; i++) {
        patient key = patients.get(i);
        int j = i - 1;
        while (j >= 0 && patients.get(j).age > key.age) {
            patients.set(j + 1, patients.get(j));
            j--;
        }
        patients.set(j + 1, key);
    }
    
    System.out.println("\nPatients sorted by age:");
    patientdetail(patients);

}

//sort patients by gender using insertion sort
public static void sortPatientsByGender(ArrayList<patient> patients) {
    int n = patients.size();
    for (int i = 1; i < n; i++) {
        patient key = patients.get(i);
        int j = i - 1;
        while (j >= 0 && compareNames(patients.get(j).gender, key.gender) > 0) {
            patients.set(j + 1, patients.get(j));
            j--;
        }
        patients.set(j + 1, key);
    }
    
    System.out.println("\nPatients sorted by gender:");
    patientdetail(patients);
}
    // Sort patients by blood group using insertion sort
    public static void sortPatientsByBloodGroup(ArrayList<patient> patients) {
        int n = patients.size();
        for (int i = 1; i < n; i++) {
            patient key = patients.get(i);
            int j = i - 1;
            while (j >= 0 && compareBloodGroups(patients.get(j).bloodGroup, key.bloodGroup) > 0) {
                patients.set(j + 1, patients.get(j));
                j--;
            }
            patients.set(j + 1, key);
        }
        patientdetail(patients);
    }
private static int compareBloodGroups(String bloodGroup1, String bloodGroup2) {
        return bloodGroup1.compareTo(bloodGroup2);
    }

    public static void searchPatientByName(ArrayList<patient> patients, String name) {
    ArrayList<patient> matchingPatients = new ArrayList<>();
    for (int i = 0; i < patients.size(); i++) {
        patient p = patients.get(i);
        if (p.name.equalsIgnoreCase(name)) {
            matchingPatients.add(p);
        }
    }
    if (matchingPatients.isEmpty()) {
        System.out.println("No matching patients found.");
    } else {
        System.out.println("Matching patients:");
        patientdetail(matchingPatients);
    }
}

}