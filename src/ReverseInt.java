import java.util.Arrays;
public class ReverseInt {
	public int reverseInt(int n){
		
    String tmp = n + "";
    char[] arr = tmp.toCharArray();
    Arrays.sort(arr);
    tmp = "";
    for(int i = arr.length-1; i >=0; i--){
    	tmp += arr[i];
    }
    
    
		return Integer.parseInt(tmp);
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}