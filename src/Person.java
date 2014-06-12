import java.util.Random;
import java.util.concurrent.*;

public class Person implements Runnable{

	private final CountDownLatch latch;
	
	Person(CountDownLatch latch){
		this.latch=latch;
	}
	
	@Override
	public void run() {
		try{
			String excuse[]={
					"Perdon le estaba ayudando a mi mama",
					"Una disculpa estaba alimentando a mi perro",
					"Mas vale tarde que nunca, no?",
					"Ahora si que empieze el recorrido!",
					"Perdon! el trafico estaba horrible",
					"Acaso soy el ultimo en llegar?"
					};
			for(int i=0;i<15;i++){
				Random rnd=new Random();
				int rand=rnd.nextInt(6);
				Thread.sleep(rand*1000);
				this.latch.countDown();
				System.out.println("PERSONA "+(i+1)+" : "+excuse[rand]);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
