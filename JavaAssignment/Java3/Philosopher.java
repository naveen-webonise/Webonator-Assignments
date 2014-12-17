
public class Philosopher {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		
		Fork[] fork = new Fork[5];
        for (int i = 0; i <5; i++) {
                fork[i] = new Fork();
        }
       
        
        Thread thread1 = new Thread(new ThreadImplementerInterface(fork[4], fork[0]));
        Thread thread2 = new Thread(new ThreadImplementerInterface(fork[0], fork[1]));
        Thread thread3 = new Thread(new ThreadImplementerInterface(fork[1], fork[2]));
        Thread thread4 = new Thread(new ThreadImplementerInterface(fork[2], fork[3]));
        Thread thread5 = new Thread(new ThreadImplementerInterface(fork[3], fork[4]));
	    
        thread1.setName("one");
        thread2.setName("two");
        thread3.setName("three");
        thread4.setName("four");
        thread5.setName("five");
	        	
	    		thread1.start();
	    		thread2.start();
	    		thread3.start();
	    		thread4.start();

	    		thread5.start();
	    }
		

}
class ThreadImplementerInterface extends Thread{
	private Fork left,right;

	
	public ThreadImplementerInterface(Fork left, Fork right){
		this.left = left;
		this.right= right;
		

	}
	@Override
	public void run(){
		

		
			
				
			while(true){
				
					eat(left,right);
					
					think();
				
			}
	}
	public synchronized void eat(Fork left,Fork right){
		
			if(left.forkUse==0 && right.forkUse==0){
			try {
				
				
				left.forkUse=1;
				right.forkUse=1;
				sleep(50);
				
				
				System.out.println("Philosopher "+Thread.currentThread().getName()+"is eating");
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			notify();
		
	}
	public synchronized void think(){
		
			
			
		
		left.forkUse=0;
		right.forkUse=0;
			System.out.println("Philosopher"+Thread.currentThread().getName()+"is thinking");
			
			try {
				while(left.forkUse==1 && right.forkUse==1){
				wait();
				}
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
	}
	}
class Fork{
	int forkUse;
	
	Fork(){
		forkUse=0;
		
	}
}
