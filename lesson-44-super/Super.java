public class Super {

    public static void main(String[] args){

        // super = refers to the parent class (subclass <- superclass)
        // used in constructors and method overriding
        // calls the parent constructor to initialize attributes

        SuperPerson person = new SuperPerson("Claudia", "Pacheco");
        SuperStudent student = new SuperStudent("Matheus", "Vinci", 1.0);
        SuperEmployee employee = new SuperEmployee("Joana", "Dias", 9000);

        person.showName();
        student.showName();
        student.showGpa();
        employee.showSalary();

    }
}
