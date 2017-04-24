
public class CarDrive {
public static void main ( String[]args){
	CarClass Mycar = new CarClass();
	CarClass Hiscar = new CarClass("Honda","Black",3.5,400);
	CarClass Hercar = new CarClass("Volks", "Pink",2.5,300);
	System.out.println("My car'a detail: "+"\n"+Mycar.toString());
	System.out.println("\nHis car'a detail: "+"\n"+Hiscar.toString());
	System.out.println("\nHer car'a detail: "+"\n"+Hercar.toString());
	
	Mycar.setMake("Ferrari");
	Mycar.setColor("Blue");
	Mycar.setEngineSize(6.5);
	Mycar.setHorsePower(650);
	
	
	Hiscar.setMake("Ferrari");
	Hiscar.setColor("Blue");
	Hiscar.setEngineSize(6.5);
	Hiscar.setHorsePower(650);
	
	Hercar.setMake("Ferrari");
	Hercar.setColor("Blue");
	Hercar.setEngineSize(6.5);
	Hercar.setHorsePower(650);
	
	System.out.println("My car's details after setting vlues"+ "\nName: " + Mycar.getmake()+ "\ncolor: "+ Mycar.getColor()+ "\nHorsePower: " + Mycar.getHorsePower()+ "\nEngineSize: "+ Mycar.getEngineSize());
	System.out.println("\nHis car's details after setting vlues"+ "\nName: " + Hiscar.getmake()+ "\ncolor: "+ Hiscar.getColor()+ "\nHorsePower: " + Hiscar.getHorsePower()+ "\nEngineSize: "+ Hiscar.getEngineSize());
	System.out.println("\nHer car's details after setting vlues"+ "\nName: " + Hercar.getmake()+ "\ncolor: "+ Hercar.getColor()+ "\nHorsePower: " + Hercar.getHorsePower()+ "\nEngineSize: "+ Hercar.getEngineSize());

}
}
