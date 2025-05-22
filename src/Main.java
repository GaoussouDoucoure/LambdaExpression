/*
LAMBDA only works with Functional Interface/SAM type
which are interface with only one method
 */

@FunctionalInterface
interface A
{
    //	void show();
    void show(int i);
//	void show(int i,int j);


}


public class Main {
    public static void main(String[] args) {

        //   	A obj=() -> System.out.println("in Show");
        //   	obj.show();

//    	A obj=new A()
//    	{
//    		public void show(int i)
//    		{
//    			System.out.println("in show"+i);
//    		}
//    	};
//    	obj.show(5);

//    	A obj=(int i) ->System.out.println("in show "+i);
//    	obj.show(5);

//    	A obj=(int i,int j) ->System.out.println("in show "+i);
//    	obj.show(5,8);

        A obj= i -> System.out.println("in show "+i);
        obj.show(5);

        /*
        we only need curly brackets after the lambda expression ->, if there is more than one statement
        like above we don't need it because we only have SOUT as statement
        Also we don't need to say the data type of i after obj creation, its optional, and we don't need
        parentheses as well since we are dealing with only one parameter and not saying its type too
         */
    }
}