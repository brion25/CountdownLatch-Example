import java.util.concurrent.*;

public class Setup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(15);
		
		TourGuy tour= new TourGuy(latch);
		Person person = new Person(latch);
		
		new Thread(tour).start();
		new Thread(person).start();
		
	}

}
