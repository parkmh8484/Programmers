
public class GetMinMaxString {
    public String getMinMaxString(String str) {
    	String[] arr = str.split(" ");
    	for(int i =0; i < arr.length; i++) {
    		for(int j=i+1; j<arr.length; j ++) {
    			if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])) {
    				String tmp = arr[j];
    				arr[j] = arr[i];
    				arr[i] = tmp;
    			}
    		}
    	}
    	
    	
        return arr[0] + " " + arr[arr.length-1];
    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        String str1 = "1 2 7 3 8 19 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str1));
    }
}