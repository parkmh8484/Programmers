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

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}
}