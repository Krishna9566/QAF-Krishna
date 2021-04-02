package Hookscucumber;

import cucumber.api.java.After;
//import cucumber.api.java.After;
import cucumber.api.java.Before;

//An important thing to note about the after hook is that even in case of test fail, after hook will execute for sure.
public class Hooks {
	@Before
	public void a() {
		System.out.println("Before Element one");	    
		}
	@Before("@Logininsta")
	public void c() {
		System.out.println("Before Element Logininsta");	    
		}
	@After
	public void a_after() {
		System.out.println("After Element one");	    
		}
	@After("@Logininsta")
	public void c_after() {
		System.out.println("After Element Logininsta");	    
		}
}
