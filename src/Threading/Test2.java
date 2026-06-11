package Threading;
class Calci {
	synchronized void print(int n) {
	
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(n+"X"+i+"="+(n*i));
		}
	}
}
class MT1 extends Thread{
	
	Calci c1;
	MT1(Calci c1){
		this.c1=c1;
	}
	public void run() {
		c1.print(4);
	}
	
}
class MT2 extends Thread{
	
	Calci c2;
	MT2(Calci c2){
		this.c2=c2;
	}
	public void run() {
		c2.print(19);
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		Calci cc=new Calci();
		
		MT1 m=new MT1(cc);
		MT2 mm=new MT2(cc);
		
		m.start();
		mm.start();
	
		

	}

}