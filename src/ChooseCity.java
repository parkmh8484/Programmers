import java.util.Arrays;

public class ChooseCity {
	public int chooseCity(int n, int [][]city)
    {
        int answer = 0;
        long minMove =0;
    	int move =0;
    	int idx = 0;
    	System.out.println(Arrays.deepToString(city));
        for(int i =0; i< city.length; i++) {
        	for(int j =0; j<city.length; j++) {
        		if(i==j) continue;
        		move += Math.abs(city[i][0]-city[j][0])*city[j][1];
        		
        	}
        	if(i==0) {
        		minMove = move;
        		answer = city[i][0];
        		idx = i;
        	}
        	else {
        		if(minMove > move) {
        			minMove = move;
        			answer = city[i][0];
        			idx = i;
        		}
        		else if(minMove == move) {
        			answer = city[idx][0] < city[i][0] ? city[idx][0] : city[i][0];
        		}
        	}
        	move = 0;
        }
    	
        
        
        return answer;
    }
    public static void main(String[] args)
    {
    	ChooseCity test = new ChooseCity();
        int tn = 3;
        int [][]tcity = {{2,2},{3,3},{1,5}};
        System.out.println(test.chooseCity(tn,tcity));
    }
}
