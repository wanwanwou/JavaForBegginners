import java.util.Vector;
public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> Vehicles=new Vector<Vehicle>();
	    Vehicles.add(new car(10,30,3,0));
		Vehicles.add(new car(10,100,-3,0));
		Vehicles.add(new Train(10,150,7,0));
		Vehicles.add(new Train(10,200,-3,0));
		Vehicles.add(new Truck(10,230,5,0));
		Vehicles.add(new Truck(10,300,7,0));
			
		for (int i=0; i<30; i++) {
			 clear();
			 for(int j=0; j<Vehicles.size(); j++) {
				Vehicles.get(j).draw(this);
				Vehicles.get(j).move();
				}
				sleep(0.1);
			}
		}
	}