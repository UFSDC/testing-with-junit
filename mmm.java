import java.util.*;

public class mmm {
	public static double getMedian(int[] arr){
		boolean evenCount = arr.length % 2 == 0 ? true : false;
		
		Arrays.sort(arr);

		if(evenCount) return (arr[(int)Math.ceil(arr.length/2)] + arr[(int)Math.floor(arr.length/2)])/2;
		else return arr[(int)arr.length/2];
	}

	public static String getMode(int[] arr){
		int[] counts = new int[getMax(arr) + 1];
		for(int num : arr){
			counts[num]++;
		}

		int mode = counts[arr[0]];
		String modes = arr[0]+" ";
		for(int i = 1; i < arr.length; i++){
			if(counts[arr[i]] == mode && modes.indexOf(arr[i]+"") == -1){
				modes += arr[i] + " ";
			}
			else if(counts[arr[i]] > mode){
				modes = "";
				mode = counts[arr[i]];
				modes += arr[i] + " ";
			}
		}

		return modes.trim();
	}

	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 1; i < arr.length; i++){
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}

	public static double getMean(int[] arr){
		int sum = 0;
		for(int num : arr){
			sum += num;
		}
		return (double)(sum)/arr.length;
	}

	public static int[] getIntArray(String[] arr){
		int[] list = new int[arr.length];

		for(int i = 0; i < arr.length; i++) {
			list[i] = Integer.parseInt(arr[i]);
		}

		return list;
	}

	public static void main(String... args){
		try {
			int[] arr = getIntArray(args);

			System.out.println( String.format( "The median is %f", getMedian(arr) ) );
			System.out.println( String.format( "The mode is %s", getMode(arr) ) );
			System.out.println( String.format( "The mean is %f", getMean(arr) ) );
		}
		catch(NumberFormatException nfe){
			System.err.println( "Uh-oh. Something you passed in was not a number.");
		}
	}
}