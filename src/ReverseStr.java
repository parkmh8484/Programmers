import java.util.Arrays;

public class ReverseStr {
	public String reverseStr(String str){
		String rStr ="";
		char[] chrArr = str.toCharArray();
		Arrays.sort(chrArr);
		for(int i =chrArr.length-1; i>=0; i--) {
			rStr += chrArr[i];
		}
		
		return rStr;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}