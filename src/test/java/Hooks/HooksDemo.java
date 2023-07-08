package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class HooksDemo {
	
	
	
	
	@BeforeStep
	public void beforeStep(Scenario sc)
	{
	sc.write("Start: Vishnu");	
	String name = sc.getName();
	System.out.println(name);
	}
	@AfterStep
	public void afterStep(Scenario sc)
	{
		sc.write("End : Vishnu");	
	}
	
	@Before
	public void beforeScenario(Scenario sc)
	
	{
		String name = sc.getName();
		System.out.println(name);
	}
	
	@After
	public void aterScenario(Scenario sc )
	{
		boolean failed = sc.isFailed();
		System.out.println(failed);
	}

}
