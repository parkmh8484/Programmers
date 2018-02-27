import java.util.Date;

class years
{
	public String getDayName(int a, int b)
    {
        String answer = "";

        Date date = new Date();
       
        date.setYear(116);	//1900 + int 
        date.setMonth(a-1);	//0부터 시작
        date.setDate(b);
        
        int day = date.getDay();
        switch (day){
        case 0:
        	answer = "SUN";
        	break;
        case 1:
        	answer = "MON";
        	break;
        case 2:
        	answer = "TUE";
        	break;
        case 3:
        	answer = "WED";
        	break;
        case 4:
        	answer = "THU";
        	break;
        case 5:
        	answer = "FRI";
        	break;
        case 6:
        	answer = "SAT";
        	break;
        	
        }
        
        return answer;
    }
    public static void main(String[] args)
    {
    	years test = new years();
        int a=5, b=24;
        System.out.println(test.getDayName(a,b));
    }
}