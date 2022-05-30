import java.util.ArrayList;

public class AbiturientManager {
    public ArrayList<Abiturient> createAbiturients(){
        ArrayList<Abiturient> abiturients = new ArrayList<>();

        abiturients.add(new Abiturient(1,"Andrey","Korol","Anayolevich","Aviatsionnaya 13","12345",new int[]{4,5,7,8,7,8,9,9,10,6}));
        abiturients.add(new Abiturient(2,"Dima","Aliseenko","Anayolevich","Aviatsionnaya 10","45678",new int[]{9,9,9,9,9,9,9,9,10,9}));
        abiturients.add(new Abiturient(3,"Kostya","Rijikov","Anayolevich","Aviatsionnaya 1","87962",new int[]{6,8,7,8,7,8,9,9,10,6}));
        abiturients.add(new Abiturient(4,"Kostya","Korol","Anayolevich","Aviatsionnaya 19","87963",new int[]{7,5,7,8,7,8,9,7,10,6}));

        return abiturients;

    }

    public void sortByBadGrades(ArrayList<Abiturient> abiturients,int topBadGrade){
        ArrayList<Abiturient> sortedAbiturients = new ArrayList<>();

        for(Abiturient abiturient : abiturients){
            for(int grade: abiturient.getGrades()){
                if(grade <= topBadGrade){
                    sortedAbiturients.add(abiturient);
                    break;
                }
            }
        }

        for(Abiturient abiturient : sortedAbiturients){
            System.out.println(abiturient.toString());
        }
    }

    public void sortByGradesSum(ArrayList<Abiturient> abiturients, int gradesSum){
        ArrayList<Abiturient> sortedAbiturients = new ArrayList<>();
        int abiturientGradesSum = 0;

        for(Abiturient abiturient : abiturients){
            for(int grade : abiturient.getGrades()){
                abiturientGradesSum+=grade;
            }
            if(abiturientGradesSum >= gradesSum) sortedAbiturients.add(abiturient);
            abiturientGradesSum = 0;
        }

        for(Abiturient abiturient : sortedAbiturients){
            System.out.println(abiturient.toString());
        }
    }

    public void sortByMaxSumOfGrades(ArrayList<Abiturient> abiturients,int maxSumAbiturientAmount, int halfAccessSum){
        ArrayList<Abiturient> sortedByMaxSumAbiturientAmount = new ArrayList<>();
        ArrayList<Abiturient> sortedByHalfAccessSum = new ArrayList<>();

        boolean isSorted = false;
        Abiturient temp = null;

        while (!isSorted){
            isSorted = true;
            for(int i = 0; i < abiturients.size() - 1; i++){
                int iSum = sumOfIntArrayElements(abiturients.get(i).getGrades());
                int iNextSum = sumOfIntArrayElements(abiturients.get(i+1).getGrades());

                if(iSum < iNextSum){
                    isSorted=false;
                    temp = abiturients.get(i+1);
                    abiturients.set(i+1,abiturients.get(i));
                    abiturients.set(i,temp);
                }
            }
        }

        System.out.println(String.format("This is %s students with max sum of grades:",maxSumAbiturientAmount));
        for (int i = 0;i < maxSumAbiturientAmount; i++){
            System.out.println(abiturients.get(i).toString());
        }

        System.out.println("Abiturients which have average grades value and more: ");
        for(int i = 0; i < abiturients.size(); i++){
            int sum = sumOfIntArrayElements(abiturients.get(i).getGrades());
            if(sum >= halfAccessSum) System.out.println(abiturients.get(i).toString());
        }

    }

    public int sumOfIntArrayElements(int[] array){
        int sum = 0;
        for(int el : array){
            sum+=el;
        }

        return sum;
    }
}
