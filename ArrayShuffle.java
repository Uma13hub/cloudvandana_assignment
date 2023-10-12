import java.util.*;
public class ArrayShuffle{
     public static void  shuffle(int[] nums){
        Random random=new Random();
        int temp;
        for(int i=0;i<nums.length;i++){
        int j=random.nextInt(i+1);
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        }
    }
    public static void main(String[] args){
        int[] array={1,2,3,4,5,6,7};
        shuffle(array);
        for(int i=0 ;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }           
   
}