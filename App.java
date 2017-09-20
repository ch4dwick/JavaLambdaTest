public class App 
{
    public static void main( String[] args )
    {
    	// Inline anonymous class declaration
        LambdaTest inlineTest = (var1, var2) -> { return var1 < var2 ? true : false;};
        boolean test = inlineTest.test(300, 20);
        System.out.println(test);
        
        // Pass by reference method. Assuming if a method matches the signature in the interface.
        LambdaTest lambdaTestSum = LambdaStaticReference::sum;
    	test = lambdaTestSum.test(20,  300);
        System.out.println(test);
        
        LambdaTest lambdaTest = LambdaStaticReference::test;
        test = lambdaTest.test(2, 6);
        System.out.println(test);
        
        // Lambda Thread test
        new Thread(()-> {
              System.out.println("A thread created and running ...");
          }).start();
    }
    
}
