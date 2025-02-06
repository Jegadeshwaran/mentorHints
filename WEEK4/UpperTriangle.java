package WEEK4;

public class UpperTriangle {

	public static void main(String[] args) {
		int[][] array = {{1,1,1},{2,2,2},{3,3,3}};
		int n=array[0].length;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum);
	}

}
