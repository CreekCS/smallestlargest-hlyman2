//put your name here
public class SmallestLargest{
    public static void main(String[] args){
		int[] numbers = new int[10];
		for(int i=0; i<10; i++) {
			int n = 1 + (int) (Math.random() * 100);
			numbers[i] = n;
			System.out.print(n + " ");
		}
		System.out.println("");
		System.out.println("smallest: " + smallestValue(numbers));
		System.out.println("biggest: " + largestValue(numbers));
    }
    public static int smallestValue(int[] nums){
		int min = nums[0];
		for( int k : nums ) {
		    if (k < min)
			    min = k;
		}

		return min;
    }
    public static int largestValue(int[] nums){
      	int max = nums[0];
		for( int k : nums ) {
	    	if (k > max)
		    	max = k;
		}

		return max;
    }
}
