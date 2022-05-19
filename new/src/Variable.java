public class Variable {
       public static void display() { // line 2
             System.out.print(" Employee ");
       }
}

class Trainee extends Variable {
       public static void display() { // line 5
             System.out.print(" Trainee ");
       }
       public static void main(String[] args) {
             Variable employee = new Trainee();
             employee.display(); // line 9
       }
}