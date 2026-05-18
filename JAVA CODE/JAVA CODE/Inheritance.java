//package Inheritance;
public class Inheritance {
public void heart()
{
System.out.println("We have heart");
}}
class Mammal extends Inheritance {
public void MammaryGlands()
{
System.out.println("We have Mammary glands!");
}}
class Reptile extends Inheritance {
public void Hiss()
{
System.out.println("Hiss Hiss!!");
}}
 class dog extends Mammal
{
public void bark()
{
System.out.println("Dogs bark Bow Bow!");
}
public static void main(String[] args)
{

dog d = new dog();
d.bark();
d.MammaryGlands();
d.heart();
}}
 
