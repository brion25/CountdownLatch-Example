import java.util.concurrent.*;

public class TourGuy implements Runnable{

	private final CountDownLatch latch;
	
	TourGuy(CountDownLatch latch){
		this.latch=latch;
	}
	
	@Override
	public void run() {
		try{
			System.out.println("GUIA : Diablos! todavia no llega la Gente");
			this.latch.await();
			System.out.println("GUIA : Genial! Ya llego la gente ya podemos empezar...");
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
