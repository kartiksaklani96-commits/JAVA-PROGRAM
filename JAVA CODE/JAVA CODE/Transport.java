public class Transport{
String move;
String fuel;

void SETMOVE(String mv){
move = mv;
}
void SETFUEL(String fl){
fuel = fl;
}

void DisplayInfo(){
    System.out.println(move+ "and " + fuel);
}

public static void main(String args[]){
Transport Bus = new Transport();
Transport Train = new Transport();
Transport Aeroplane = new Transport();


Bus.SETMOVE("Bus move on Road ");
Bus.SETFUEL("Bus uses Fuel");
Train.SETMOVE("Train move on Tracks ");
Train.SETFUEL("Train uses Electricity ");
Aeroplane.SETMOVE("Aeroplane fly in sky ");
Aeroplane.SETFUEL("Aeroplane uses Aviation Fuel ");

Bus.DisplayInfo();
Train.DisplayInfo();
Aeroplane.DisplayInfo();

}
}

