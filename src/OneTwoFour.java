class OneTwoFour {
	public String change124(int n) {
		String answer = "";
		
		String[] arr = {"4","1","2"};
		
		while(n>0) {
			answer = arr[n%3] + answer;
			
			n = n%3 ==0 ? n/3 -1 : n/3;
		}

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		OneTwoFour oneTwoFour = new OneTwoFour();
		System.out.println(oneTwoFour.change124(1));
		System.out.println(oneTwoFour.change124(2));
		System.out.println(oneTwoFour.change124(3));
		System.out.println(oneTwoFour.change124(4));
		System.out.println(oneTwoFour.change124(5));
		System.out.println(oneTwoFour.change124(6));
		System.out.println(oneTwoFour.change124(7));
		System.out.println(oneTwoFour.change124(8));
		System.out.println(oneTwoFour.change124(9));
		System.out.println(oneTwoFour.change124(10));
		System.out.println(oneTwoFour.change124(2988));
		System.out.println(oneTwoFour.change124(1686754783));
	}
}
