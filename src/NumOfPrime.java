class NumOfPrime {
	int numberOfPrime(int n) {
		int result = 0;
		// 함수를 완성하세요.
		int cnt = 0;
		boolean flg = false;
		for(int i = 2; i <= n; i++) {
			flg = true;
			for(int j = i-1; j>1; j--) {
				System.out.println("i : " + i + ", j : " + j);
				System.out.println("i%j : " + i%j );
				if(i != j && i%j==0) {
					flg =false;
					break;
				}
			}
			System.out.println("flg : " + flg + ", result : " + result);
			if(flg) result++;
			
		}
			
		return result;
	}

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println( prime.numberOfPrime(241) );
	}

}