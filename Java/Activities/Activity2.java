package activities;

public class Activity2 {

	public static void main(String[] args) {
		int arr[] = {10, 77, 10, 54, -11, 10,10};
		boolean ans = check(arr);
		System.out.println(ans);

	}
	
	public static boolean check(int[] arr) {
		int temp=0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 10) {
				temp=temp+arr[i];
			}
		}
		
		if(temp == 30) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	

}
