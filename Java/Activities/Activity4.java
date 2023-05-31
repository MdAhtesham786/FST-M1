package Activitys;

public class Activity4 {
    public static void main(String[] args) {
        int[] arr={3,1,6,4,2,8,5,9,5};

        System.out.println("Array before sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Array After sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
