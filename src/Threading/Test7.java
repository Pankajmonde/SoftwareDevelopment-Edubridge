package Threading;


class RedBus{
	int seats=5;
	public void bookTc(int ts) {
		
		synchronized(this) {
			System.out.println(Thread.currentThread().getName());
			if(seats>=ts) {
				seats-=ts;
				System.out.println("Bookinng succesfully done");
			}
			else {
				System.out.println("Seats not available");
			}
		}
		
	}
}
class PS1 extends Thread{
	RedBus rb;
	int tc;
	PS1(RedBus rb, int tc){
		this.rb=rb;
		this.tc=tc;
	}
	public void run() {
		rb.bookTc(tc);
	}
}
class PS2 extends Thread{
	RedBus rb;
	int tc;
	PS2(RedBus rb, int tc){
		this.rb=rb;
		this.tc=tc;
	}
	public void run() {
		rb.bookTc(tc);
	}
}
public class Test7 {

	public static void main(String[] args) {
		RedBus b1=new RedBus();
		PS1 p1=new PS1(b1,1);
		PS2 p2=new PS2(b1,6);
		p1.setName("Akash");
		p2.setName("ritu");
		
		p1.start();
		try {
			p1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p2.start();

	}

}