public class GPA {

    private double gpa1;
    private double gpa2;
    private double gpa3;


    public GPA(double gpa1, double gpa2, double gpa3){

        this.gpa1 = gpa1;
        this.gpa2 = gpa2;
        this.gpa3 = gpa3;
    }

    public void displayGPA(){

        double gpaSum = gpa1 + gpa2 + gpa3;
        double avgGpa = gpaSum / 3;
        System.out.println("Total gpa this semester: " + avgGpa);
    }


    public static void main(String[] args){

        GPA gpa = new GPA(2.8, 3.0, 3.5);
        gpa.displayGPA();
    }
}
