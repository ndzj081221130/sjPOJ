package t1006;import java.util.Scanner;public class Main {	/**	 * @param args	 */	public static void main(String[] args) {		Scanner scanner = new Scanner(System.in);		int n = scanner.nextInt();		if (n < 1) {			System.out.println("n must > 0");			return;		}		int[] nums = new int[n];		for (int i = 0; i < n; i++) {			nums[i] = scanner.nextInt();		}		int sum = MaxSum(nums);		if (sum > 0)			System.out.println(sum);		else			System.out.println("Game Over");	}	static int max(int[] array) {		int max = array[0];		int b = 0;		for (int i = 0; i < array.length; i++) {			if (b < 0) {				b = array[i];			} else {				b += array[i];			}			if (max < b)				max = b;			// if(array[i] > max)			// max = array[i];		}		// for(int i = 0 ; i < array.length ; i++){		// int sum = 0;		// for(int j=i;j<array.length;j++){		// sum += array[j];		// if(sum < 0)		// {		// sum = array[j];		// }		// if(sum > max)		// max = sum;		//		// }		// if(sum > max)		// max = sum;		// }		//		return max;	}	static int MaxSum(int[] A) {		int n = A.length;		int maximum = -1;		int sum = 0;		for (int i = 0; i < n; i++) {			for (int j = i; j < n; j++) {				for (int k = i; k <= j; k++) {					sum += A[k];				}				if (sum > maximum)					maximum = sum;				sum = 0; // 这里要记得清零，否则的话sum最终存放的是所有子数组的和。也就是编程之美上所说的bug。多谢苍狼。			}		}		return maximum;	}}