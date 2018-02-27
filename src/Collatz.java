class Collatz {
	public int collatz(long num) {
		int answer = 0;
		while(num != 1) {
			
			if(num%2 == 0) {
				num = num /2;
			}
			else{
				num = (num*3) +1;
			}
			
			answer++;
			if(answer >500) {
				answer = -1;
				break;
			}
			System.out.println(answer +" : "  +num);
		}
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Collatz c = new Collatz();
		int ex =1252663;
		System.out.println(c.collatz(ex));
	}
}