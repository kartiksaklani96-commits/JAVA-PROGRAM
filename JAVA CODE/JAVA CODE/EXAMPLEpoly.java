// class Calculation{
// void sum(int a,int b){System.out.println(a+b);}
// void sum(int a,int b,int c){System.out.println(a+b+c);}
// public static void main(String args[]){
// Calculation obj=new Calculation();
// obj.sum(10,10,10);
// obj.sum(20,20);
// }
// // 



class Vehicle{
void run(){System.out.println("Vehicle is running");}
}
class Bike2 extends Vehicle{
void run(){System.out.println("Bike is running safely");}
public static void main(String args[]){
Bike2 obj = new Bike2();
obj.run();
}
}