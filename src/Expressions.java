public class Expressions {

	public int expressions(int num) {
		int answer = 0;
		int tmpSum = 0;
		for(int i = num; i > 0; i--) {
			tmpSum =0;
			for(int j = i; j > 0; j--) {
				
				tmpSum += j;

				if(tmpSum == num) {
					answer++;
					break;
				}
				else if(tmpSum > num) {
					break;
				}
				else {}
			}
			
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
	}
}