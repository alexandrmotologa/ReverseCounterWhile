
public class ReverseCounterWhile {

	public static void main(String[] args) {
		
		int i = 1;
        int count = 10;
        
        while(i<=count){
          if(count == 10) {
            System.out.println(++count - i);
            i++;
          }else{
            System.out.println(count - i);
            i++;
          }
          
        }
		
	}

}
