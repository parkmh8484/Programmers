class NLCM {
	public long nlcm(int[] num) {
		long answer = num[0];
		int number =0;
		long big =0;
		long small =0;
		
		for(int i =1; i< num.length; i++) {
			number = num[i];
			big = answer > number ? answer : number;
			System.out.println("big : " + big);
			small = answer < number ? answer :number;
			System.out.println("small : " + small);
			
			answer = big*small /gcd(big,small);
		}
		
		return answer;
	}
	
	public long gcd(long a, long b) {
		if(b ==0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
	
	
	
	public static void main(String[] args) {
		NLCM c = new NLCM();
		int[] ex = { 2, 6, 8, 14 };
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
}