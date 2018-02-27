import java.util.Arrays;

class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret�� array�� ���Ե� ������, divisor�� ������ �������� ���ڸ� ������� ��������.
		int cnt =0;
		int[] tmp = new int[array.length];
		for(int i = 0; i < array.length; i ++) {
			if(array[i] % divisor ==0) {
				tmp[cnt] = array[i];
				cnt ++;
			}
		}
		int[] ret = new int[cnt];
		for(int i =0; i< ret.length; i++) {
			ret[i] = tmp[i];
		}
		return ret;
	}
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}
}