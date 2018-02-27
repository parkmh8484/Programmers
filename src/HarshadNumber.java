public class HarshadNumber{
	public boolean isHarshad(int num){
		
		int sum =0;
		int tmp = num;
		
		while(tmp > 0) {
			sum += tmp%10;
			tmp = tmp/10;
		}
		
		
		
		return (num%sum ==0);
	}
  
       // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(11));
		System.out.println(sn.isHarshad(13));
		System.out.println(sn.isHarshad(10));
		System.out.println(sn.isHarshad(12));
		System.out.println(sn.isHarshad(11));
	}
}