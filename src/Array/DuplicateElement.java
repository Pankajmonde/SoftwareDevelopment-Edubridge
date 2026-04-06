package Array;

public class DuplicateElement {
	public static void main(String args[]) {
	
	int arr[]= {10,2,3,10,4,6,7,10,4,5,4,5};
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("Duplicate element: "+arr[j]);
			}
		}
	}

}
}