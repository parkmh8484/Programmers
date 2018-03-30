import java.util.Arrays; //�׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer = null;
        
        if(n<=0 || n>s) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }
        
        answer = new int[n];
        
        int tmp1 = s/n;
        int tmp2  = s%n;
        for(int i =0; i< answer.length; i++) {
        	answer[i] = tmp1;
        }
        int idx =0 ;
        while(tmp2 > 0) {
        	answer[idx]++;
        	idx++;
        	tmp2--;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
   
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}