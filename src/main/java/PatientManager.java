import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> createPatientBatch(){
        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new Patient(1,"Andrey","Korol","Anayolevich","Aviatsionnaya 13","12345",12345,"sinusit"));
        patients.add(new Patient(2,"Dima","Aliseenko","Anayolevich","Aviatsionnaya 10","45678",11112,"yachmen"));
        patients.add(new Patient(3,"Kostya","Rijikov","Anayolevich","Aviatsionnaya 1","87962",11122,"sinusit"));
        patients.add(new Patient(4,"Kostya","Korol","Anayolevich","Aviatsionnaya 19","87963",11123,"loh"));

        return patients;
    }

    public void sortByDiagnosis(ArrayList<Patient>  patients, String diagnosis){
        ArrayList<Patient> sortedPatients = new ArrayList<>();

        for(Patient patient : patients){
            String patientDiagnosis = patient.getDiagnosis();
            if(patientDiagnosis.equals(diagnosis)) sortedPatients.add(patient);
        }

        for(Patient patient : sortedPatients){
            System.out.println(patient.toString());
        }
    }

    public void sortByRangeOfMedicalCardNumber(ArrayList<Patient>  patients, int startRange, int endRange){
        ArrayList<Patient> sortedPatients = new ArrayList<>();

        for(Patient patient : patients){
            int patientMedicalCardNumber = patient.getMedicalCardNumber();

            if(patientMedicalCardNumber > startRange && patientMedicalCardNumber < endRange){
                sortedPatients.add(patient);
            }
        }

        for (Patient patient : sortedPatients){
            System.out.println(patient.toString());
        }
    }
}
