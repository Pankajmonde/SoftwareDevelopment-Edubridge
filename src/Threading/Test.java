package Threading;


public class Test  extends Thread {
      public void run() {
	
    	  for(int i=1;i<=10;i++) {
    		  System.out.println(i);
    	  }
    	  
}
	
	public static void main(String[] args) {
		
		Test t1=new Test();
		Test t2=new Test();
		t1.start();
	
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Thread1 Id:"+t1.getId()+" Thread1 Name:"+t1.getName());
		t1.setName("Anjana");
		System.out.println("Updated Thread1 Name:"+t1.getName());
		System.out.println("Thread2 Id:"+t2.getId()+" Thread2 Name:"+t2.getName());
        t2.setName("Archana");
        System.out.println("Updated Thread2 Name:"+t2.getName());
	}

}