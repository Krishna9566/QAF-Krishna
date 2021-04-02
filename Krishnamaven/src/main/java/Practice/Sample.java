package Practice;

public class Sample {
	
	public void a()
	{
		String nameofCurrMethod = new Throwable() 
                .getStackTrace()[0] 
                .getMethodName(); 

System.out.println("Name of current method: "
+ nameofCurrMethod);
	}

	public static void main(String[] args) {
		Sample sample=new Sample();
		sample.a();

	}

}
