public class WaterMelon {
	public String watermelon(int n){
		String str = "";
		if(n%2 == 0) {
			for(int i=0;i < n/2; i++) {
				str += "����";
			}
		}
		else {
			for(int i=0;i < n/2; i++) {
				str += "����";
			}
			str += "��";
			
		}
		return str;
	}

	// ������ ���� �׽�Ʈ�ڵ��Դϴ�.
	public static void  main(String[] args){
		WaterMelon wm = new WaterMelon();
		System.out.println("n�� 3�� ���: " + wm.watermelon(3));
		System.out.println("n�� 4�� ���: " + wm.watermelon(4));
	}
}