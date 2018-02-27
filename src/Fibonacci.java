class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;

		long a =0;
		long b =1;
		for(int i =0; i<num; i++) {
			if(i!=0) {
				answer = a+b;
				a= b;
				b= answer;
				
			}
		}
		
		
		return answer;
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
