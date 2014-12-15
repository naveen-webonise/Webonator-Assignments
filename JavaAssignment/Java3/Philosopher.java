class ThreadImplementerInterface extends Thread{
	private Fork left,right;

	
	public ThreadImplementerInterface(Fork left, Fork right){
		this.left = left;
		this.right= right;

	}
	@Override
	public void run(){
		

		
			
				
			while(true){
				if(left.forkUse==0 && right.forkUse==0){
					this.eat(left,right);
				}
				else
					this.think();
			}
			
	}
	public void eat(Fork left,Fork right){
		synchronized(left){	
			synchronized(right){
			try {
				
				System.out.println("Philosopher "+Thread.currentThread().getName()+"is eating");
				left.forkUse=1;
				right.forkUse=1;
				Thread.sleep(50);
				
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		}
	}
	public void think(){
		try {
			
			
			Thread.currentThread().sleep(50);
			left.forkUse=0;
			right.forkUse=0;
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
class Fork{
	int forkUse=0;
	
}
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
        thread5.setName("Five");
	        	
	    		thread1.start();
	    		thread2.start();
	    		thread3.start();
	    		thread4.start();

	    		thread5.start();
	    }
		
		
		
	}


