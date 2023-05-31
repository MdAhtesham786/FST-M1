package Activitys;

public class Activity2 {

    public static void main(String[] args) {
        int [] carArray = {10, 77, 10, 54, -11, 10};

        int num=10;
        int temp=0;
        for(int i=0;i<carArray.length;i++ )
        {
            if(carArray[i]==num)
            {
                temp=temp+carArray[i];
            }
        }

        System.out.println(temp);

    }
}
