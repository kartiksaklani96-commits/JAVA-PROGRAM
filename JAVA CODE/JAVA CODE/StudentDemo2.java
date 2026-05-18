// Student class demonstrating encapsulation
class Student {
    // Private data members (hidden from outside)
    private int rollNo;
    private String name;
    private double marks;

    // Getter methods (to access private data)
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods (to modify private data)
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

// Main class to test encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student();

        // Set values using setters
        s1.setRollNo(101);
        s1.setName("Saksham");
        s1.setMarks(92.5);

        // Access values using getters
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Name: " + s1.getName());
        System.out.println("Marks: " + s1.getMarks());
    }
}
