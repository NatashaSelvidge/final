//Each flying object need to support the following methods:
//SetAirSpeed(int airSpeedMPH) --- Where airSpeedMPH is the distance traveled per hour by the flying object
//
//SetAltimeter(int elevationPerMinute) --- Where elevationPerMinute is the elevation gain  per minute measure by feet (Feed Per Minute FPM) – by the flying object
//
//Fly() – to indicate 1 minute of fly
public class Flyer {
	private int airSpeedMilesPerMinute;
	private int elevationPerMinute;
	private int totalAltitude = 0;
	private int totalDistance = 0;
	
	public Flyer(){
		this.airSpeedMilesPerMinute = 0;
		this.elevationPerMinute = 0;
	}
	public Flyer(int airSpeedMPH, int elevationPerMinute){
		this.airSpeedMilesPerMinute = airSpeedMPH / 60;
		this.elevationPerMinute = elevationPerMinute;
	}
	public void SetAirSpeed(int airSpeedMPH){
		this.airSpeedMilesPerMinute = airSpeedMPH / 60;
	}
	public void SetAltimeter(int elevationPerMinute){
		this.elevationPerMinute = elevationPerMinute;
	}
	public void Fly(){
		this.totalAltitude = this.totalAltitude + this.elevationPerMinute;
		this.totalDistance = this.totalDistance + this.airSpeedMilesPerMinute;
	}
	public String toString(){
		return "Distance Flown: " + this.totalDistance + "; Current Altitude: " + this.totalAltitude;
	}
}
