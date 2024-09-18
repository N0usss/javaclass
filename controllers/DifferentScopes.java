package controllers;

    public class DifferentScopes {

        int instanceVariable = 10;
        double instanceVariableDouble = 10.8;
        String instanceVariableString = "hello";

        static int instanceVariableStatic = 20;

        public void showLocalVariable() {
            String localStringVariable = "finish!";
            int localVariable = 30;
            System.out.println("My local variable is " + localVariable + " "+ localStringVariable);
        }

        public void showName() {
            String name1 = "Muhammad";
            String name2 = "Anas";
            System.out.println("My name is: " + name1 + " " + name2);

        }

        public void calculate() {
            int no1 = 10;
            double no2 = 9.7;
            double result = no1 * no2;

            if (result <100)
                System.out.println("Result: " + result);
            else
                System.out.println("no result given");

        }

        public static void main(String[] args) {

            DifferentScopes example= new DifferentScopes();
            example.showLocalVariable();
            example.showName();
            example.calculate();
            System.out.println("My local variable is: " + example.instanceVariable + " " + example.instanceVariableString);
        }
}
