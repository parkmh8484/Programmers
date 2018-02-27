import java.util.Arrays;

class ProductMatrix {
	public int[][] productMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][B[0].length];

		for(int i = 0; i < A.length; i++) {
			for(int j =0; j< B[i].length; j++) {
				for(int k =0; k<A[i].length; k++) {
					
					answer[i][j] += A[i][k] * B[k][j];
				}
				System.out.print(answer[i][j] + " ");
			}
			System.out.println("");
		}
		//System.out.println(Arrays.deepToString(answer));
		return answer;
	}

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 }, { 2, 3 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };
		
      System.out.println("Çà·ÄÀÇ °ö¼À : " + c.productMatrix(a, b));
	}
}
