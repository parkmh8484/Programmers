class JumpCase {

    public long jumpCase(int num) {
    	long answer = 0;
        
    /*	if(num==1) {
    		answer = 1;
    	}else if( num == 2) {
    		answer = 2;
    	}else {
    		answer = jumpCase(num-1) + jumpCase(num-2);
    	}
    	*/
    	
        for(int i =0; 2*i< num  ; i++) {
        	System.out.println("2�� ���� : " + i);
        	//1�� ����
        	int cnt1 = num -(2*i);
        	System.out.println("1�� ���� : " + cnt1);
        	
        	//1�� 2�� �� ����
        	int tmp = i+cnt1;
        	System.out.println("1�� 2�� �� ���� : " + tmp);
        	
        	
        	long fac1=1;
        	for(int j=tmp; j>0; j--) {
        		fac1 = j*fac1;
        	}
        	System.out.println("fac1 : " + fac1);
        	long fac2 =1;
           	for(int j=i; j>0; j--) {
        		fac2 = j*fac2;
        	}
           	System.out.println("fac2:" + fac2);
           	
           	long fac3 =1;
          	for(int j=cnt1; j>0; j--) {
        		fac3 = j*fac3;
        	}
          	System.out.println("fac3:"+fac3);
        	
        	answer += fac1 / (fac2*fac3);
        	System.out.println("2�� ����  " + i + "���϶� : " + answer);
        }
        
        
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 17;
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.jumpCase(testCase));
    }
}

