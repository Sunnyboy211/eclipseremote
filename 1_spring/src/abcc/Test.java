package abcc;

public class Test{
	   public static void main(String args[]){
	      String Str = new String("123456789ABCDEF");
	      
	      System.out.print("Return Value :" );
	      System.out.println(Str.subSequence(1, 10) );

	      System.out.print("Return Value :" );
	      System.out.println(Str.subSequence(10, 15) );
	   }
	}
