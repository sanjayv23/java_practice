package sample;
import java.util.*;

public class Demo {
	
	// modify the array in-place
	static void array_modifier(int[] nums) {
		for(int i=0;i<nums.length;i++) 
			nums[i]*=2;
		
	}
	// display the array 
	static void array_display(int[] nums) {
		System.out.println(Arrays.toString(nums));
	}
	
	// add even ele and mul odd ele
	static int[] task1(int[] nums) {
		//int[] arr=new int[2];
		int even_add=0;
		int odd_mul=1;
		for(int x:nums) {
			if(x%2==0) {
				even_add+=x;
			}
			else odd_mul*=x;
		}
		//arr[0]=even_add;
		//arr[1]=odd_mul;
		
		return new int[] {even_add,odd_mul};
		
	}
	public static void main(String[] args) {
		int[] nums=new int[5];
		int[] nums1= {1,2,3,4,5};
		int[] nums2=new int[] {1,2,3};
		
		//array_modifier(nums1);
		//array_display(nums1);
		
//		int[] arr=task1(nums1);
//		array_display(arr);
		
		System.out.println(Arrays.toString(task1(nums1)));
		
		
	}
	
}
