public class WaterMelon {
	public String watermelon(int n){
		String str = "";
		if(n%2 == 0) {
			for(int i=0;i < n/2; i++) {
				str += "수박";
			}
		}
		else {
			for(int i=0;i < n/2; i++) {
				str += "수박";
			}
			str += "수";
			
		}
		return str;
	}

	// 실행을 위한 테스트코드입니다.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n이 3인 경우: " + wm.watermelon(3));
		System.out.println("n이 4인 경우: " + wm.watermelon(4));
	}
}