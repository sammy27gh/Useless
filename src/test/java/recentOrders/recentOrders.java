
package recentOrders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class recentOrders {
	

	
	
	@Given("^Update Recent Order CreditCardDetails$")
	public void update_Recent_Order_CreditCardDetails() throws Throwable {
		
		System.out.println("wow intervals");
		
	}

	@When("^Edit you Email Address\\.$")
	public void edit_you_Email_Address() throws Throwable {
	  
	}

	@When("^Change the Password$")
	public void change_the_Password() throws Throwable {
	   
	}

	@Then("^Close the Browser\\.$")
	public void close_the_Browser() throws Throwable {
	   
	}


	   
            
            
            /*
            // method to connect to the database 
            
            public void  Database() throws ClassNotFoundException, SQLException{
          	  
          		String userName = "sa";
          		String password = "Sk@456321";

          		String url = "jdbc:sqlserver://104.37.189.218\\SQLEXPRESS;databaseName=Books";

          		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          		Connection conn = DriverManager.getConnection(url, userName, password);
          		Statement sta =  conn.createStatement();
          		String Sql = "SELECT * FROM cELEBRITY.[dbo].[Celebrity]";
          		ResultSet rs = sta.executeQuery(Sql);
          		while (rs.next()) {
          			System.out.println(rs.getString(1)); 
          			boolean News = driver.getPageSource().contains(rs.getString(1));
        			Assert.assertEquals(News, true);
          	  
          		}

 
            
            }
            
            */
}
