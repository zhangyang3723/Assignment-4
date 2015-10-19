package assignment4_yangzhang;

public class FindZero {

	// this function is not quite correct, if the input starts with [0, 0, ...], it can not find the first ones.
	public void countZeroNum(int[] arr){
		for(int i=1; i<= arr.length-1;i++){
			if (arr[i-1]==1 && arr[i]==0 && arr[i+1]==0){
				//System.out.println(i+": "+arr[i]);  
				StringBuilder sb = new StringBuilder();
				for (int j = i; j <= arr.length-1; j++){
					if( arr[j]!=0){
						System.out.println(sb.toString() + " at index " + i);
						break;
					} 
					if(j==arr.length-1){
						sb.append(0);
						System.out.println(sb.toString() + " at index " + i);
					}
					else {
						sb.append(0);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		FindZero test = new FindZero();
		int[] b =  {1,0,0,1,0,1,1,0,0,0,0,0,0,1,0,0,0};
		test.countZeroNum(b);

	}

}
