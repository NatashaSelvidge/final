//Show the altitude and distance travel of the following objects in 5 minute interval, for the first 30 minutes
//Bird:  10 MPH, 3 FPM
//
//Airplane:  450 MPH, 50 FPM
//
//JetPlane:  1000 MPH, 120 FPM
//
//Missile: 2500 MPH,  800 FPM
//
//Superman: 3500 MPH,  500 FPM
public class FlyTest {
	public static void main(String[] args){
		Flyer Bird = new Flyer(10, 3);
		Flyer Airplane = new Flyer(450, 50);
		Flyer JetPlane = new Flyer(1000, 120);
		Flyer Missile = new Flyer(2500, 800);
		Flyer Superman = new Flyer(3500, 500);
			
		Runnable BirdThread = new FlyThread(Bird);
		Runnable AirplaneThread = new FlyThread(Airplane);
		Runnable JetPlaneThread = new FlyThread(JetPlane);
		Runnable MissileThread = new FlyThread(Missile);
		Runnable SupermanThread = new FlyThread(Superman);
		
		Thread BirdWorker = new Thread(BirdThread);
		Thread AirplaneWorker = new Thread(AirplaneThread);
		Thread JetPlaneWorker = new Thread(JetPlaneThread);
		Thread MissileWorker = new Thread(MissileThread);
		Thread SupermanWorker = new Thread(SupermanThread);
		
		BirdWorker.setName("Bird");
		AirplaneWorker.setName("Airplane");
		JetPlaneWorker.setName("JetPlane");
		MissileWorker.setName("Missile");
		SupermanWorker.setName("Superman");
		
		BirdWorker.start();
		AirplaneWorker.start();
		JetPlaneWorker.start();
		MissileWorker.start();
		SupermanWorker.start();
		
	}
}
