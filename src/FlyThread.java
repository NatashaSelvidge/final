
public class FlyThread implements Runnable {
	private Flyer flyer;
	public FlyThread(Flyer flyer) {
		this.flyer = flyer;
	}
	@Override
	public void run() {
		int i = 0;
		while(i < 30){
			this.flyer.Fly();
			if(i % 5 == 0){
				System.out.println(Thread.currentThread().getName() + ": " + this.flyer.toString());
			}
			i++;
		}
	}
	
}
