import java.util.Arrays;

class Hopscotch {
    int hopscotch(int[][] board, int size) {
        int result = 0;
        int result2 = 0;
        // 함수를 완성하세요.
        int preIdx=0;
        int idx=0;
        int[] arrR = new int[size];
        int[] arr = new int[size];
       
        for(int i =0; i < size; i++) {
        
        	for(int j=0; j< board[i].length; j++) {
        		if(i != 0 && preIdx == j) {
        			continue;
        		}
        		if(arr[i] < board[i][j]) {
        			arr[i] = board[i][j];
        			idx = j;
        		}
        		else if(arr[i] == board[i][j] ) {
        			idx = board[i+1][idx] < board[i+1][j] ? idx : j; 
        		}
        	}
        	preIdx = idx;
        	System.out.println(i + " : " + preIdx);
        }
        preIdx=0;
        for(int i =size-1; i >= 0; i--) {
            
        	for(int j=0; j <board[i].length; j++) {
        		if(i != size-1 && preIdx == j) {
        			continue;
        		}
        		if(arrR[i] < board[i][j]) {
        			arrR[i] = board[i][j];
        			idx = j;
        		}
        		else if(arrR[i] == board[i][j] ) {
        			if(i-1 >= 0) {
        				idx = board[i-1][idx] < board[i-1][j] ? idx : j; 
        			}
        		}
        	}
        	preIdx = idx;
        	System.out.println(i + " : " + preIdx);
        }
    
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrR));
        for(int i =0; i< size; i++) {
        	
        	result += arr[i]; 
        	result2 += arrR[i];
        }
        System.out.println(result);
        System.out.println(result2);
        return result > result2 ? result: result2;
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { {7, 6, 10, 5}, {10, 9, 10, 9}, {2, 4, 9, 7}, {4, 1, 6, 4}, {2, 7, 2, 1}, {1, 8, 5, 1}, {10, 3, 1, 1}, {1, 5, 10, 9}, {5, 2, 9, 9}, {7, 4, 5, 3} };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 10));
    }

}