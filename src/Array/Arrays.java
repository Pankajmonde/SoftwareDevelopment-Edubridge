package Array;


public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "sam";
		name = "Jhon";
		System.out.println("Name:"+ name);
		
		//type of array arrayname[]=()
		
		String names[]= {"sam","John","Anjali","Ankita","Aditi"};
		System.out.println("Name:"+names);
		
		for(String x:names) {
			System.out.println("Name:"+x);
			}
		//type of data arrayname[] = new typeofarray[size];
		
		int a[]= new int[5];
		a[0]=100;
		a[1]=300;
		
		// a[5] = 400;
		
		System.out.println("--------------------");
		for(int x:a) {
			System.out.println("value "+x);
		}

	}

}
