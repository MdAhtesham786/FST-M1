package activities;

public class Activity4 {

	public static void main(String[] args) {

		int arr[]= {2,4,5,6,8,7,4,2,3};

		int temp[]=arr;

		for(int i=0;i<temp.length;i++) {
			for(int j=i+1;j<temp.length;j++) {

				if(temp[i]>temp[j])
				{
					int swap=temp[j];
					temp[j]=temp[i];
					temp[i]=swap;

				}
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
			
		}
		
	}

}
