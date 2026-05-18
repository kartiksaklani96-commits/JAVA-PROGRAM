// class Student{
//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }

//     public void printInfo(int age){
//         System.out.println(age);
//     }

//     public void printInfo(String name, int age){
//         System.out.println(name + " " + age );
//     }
// }


// public class PolymorphismEx {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "Shivam";
//         s1.age = 19;

//         s1.printInfo(s1.name, s1.age);
//     }
// }


class Calculation2{
void sum(int a,int b){System.out.println(a+b);}
void sum(double a,double b){System.out.println(a+b);}
public static void main(String args[]){
Calculation2 obj=new Calculation2();
obj.sum(10,10);
obj.sum(20,20);
}
}