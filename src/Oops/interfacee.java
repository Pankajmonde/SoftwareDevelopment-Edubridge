package Oops;

interface Post{
	void addPhoto() ;
}

interface LinkedIn{
	void searchJob(String jobType);
}
//multiple inheriance
interface Instagram extends Post,LinkedIn{
	void doMarketing();
}

class Test implements Instagram{

	@Override
	public void addPhoto() {
		System.out.println("Photo Loading........");
		
	}

	@Override
	public void searchJob(String jobType) {
		System.out.println("Looking For "+ jobType);
		
	}

	@Override
	public void doMarketing() {
		System.out.println("Post Add");
		
	}
	
}
public class interfacee {

	public static void main(String[] args) {
		Test t=new Test();
		
		t.addPhoto(); 
		t.searchJob("Developer");
		t.doMarketing();

	}

}