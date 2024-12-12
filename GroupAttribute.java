/* <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
  <!-- here we are running group of software company and automobile company -->
  <groups>
  <run>
 <include name="Software Company"></include> 
 <!-- <include name="AutoMobile Company"></include> -->
  </run>
  </groups>
    <classes>
      <class name="TESTNG.TESTNG.GroupAttribute"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
  */




package TESTNG.TESTNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class GroupAttribute {
	// here wipro and infosys are software company 
	// and maruti and tata are automobile
	// so we are now making group's of the company 
	@Test(groups = "Software Company")
	public void infosys() {
		
		System.out.println("Infosys");
	}

	
	@Test(groups = "Software Company")
	public void wipro() {
		
		System.out.println("wipro");
	}

	@Test(groups = "AutoMobile Company")
	public void Maruti() {
		
		System.out.println("Maruti");
	}

	@Test(groups = "AutoMobile Company")
	public void Tata() {
		
		System.out.println("Tata");
	}

	
}


