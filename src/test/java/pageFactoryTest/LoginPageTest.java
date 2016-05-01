/**
 * 
 */
/**
 * @author samuel
 *
 */
package pageFactoryTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.LoginPage;

public class LoginPageTest {
	 
	WebDriver driver;
	  
	@BeforeTest
	   public void setup(){
	 
	  driver = new FirefoxDriver();
	 
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	  //driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
	  driver.get("http://www.bing.com/");

	    }

	

	
		public void bingSearchTest() throws InterruptedException{
		LoginPage bingSearch = new LoginPage(driver);
		bingSearch.searchBing("Books");
	     //String searchFind = "driver.getPageSource().contains(Becker Books)";
	     boolean test = driver.getPageSource().contains("My 10 Favorite Books: Alan Cumming");
		
		Assert.assertEquals(test, true);
	  
	     driver.close();
	     
	     Thread.sleep(2000);
		}
		
		   
		public void bingSearchTest1() throws InterruptedException{
	     // invoke the beforeTest method over here 
			setup();
		LoginPage bingSearch = new LoginPage(driver);
		bingSearch.searchBing("Books");
	     //String searchFind = "driver.getPageSource().contains(Becker Books)";
	     boolean test = driver.getPageSource().contains("Books-A-Million - Official Site");
		
		Assert.assertEquals(test, true);
	  
	     driver.close();
	     
	     Thread.sleep(2000);
		}
		  
		public void bingSearchTest2() throws InterruptedException{
	     // invoke the beforeTest method over here 
			setup();
			
		LoginPage bingSearch = new LoginPage(driver);
		bingSearch.searchBing("Books");
	     //String searchFind = "driver.getPageSource().contains(Becker Books)";
		System.out.println(" verifying the test contains online shopping 3 ");
	     boolean test = driver.getPageSource().contains("Online shopping");
		
		Assert.assertEquals(test, true);
	     
	     driver.close();
	     
	     Thread.sleep(2000);
		}
		 
		public void bingSearchTest3() throws InterruptedException{
	     // invoke the beforeTest method over here 
			setup();
			
		LoginPage bingSearch = new LoginPage(driver);
		bingSearch.searchBing("Books");
	     //String searchFind = "driver.getPageSource().contains(Becker Books)";
		System.out.println(" verifying the test contains online shopping 3 ");
	     boolean test = driver.getPageSource().contains("100,000 booksellers.");
		
		Assert.assertEquals(test, true);
	     
	     driver.close();
	     
	     Thread.sleep(2000);
		}
	   @Test
		public void parameter() throws InterruptedException, ClassNotFoundException, SQLException{
			
		   
		   
			// put the data base method in here 
			
			String userName = "sa";
     		String password = "Sk@456321";

     		String url = "jdbc:sqlserver://104.37.189.218\\SQLEXPRESS;databaseName=Books";

     		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     		Connection conn = DriverManager.getConnection(url, userName, password);
     		Statement sta =  conn.createStatement();
     		String Sql = "select * from Books.[dbo].[InternetMarketing]";
     		ResultSet rs = sta.executeQuery(Sql);
     		while (rs.next()) {
     			System.out.println(rs.getString(1)); 
     		// This is where we test with the database to see if the connection is possible
  			  
 				LoginPage newsTest = new LoginPage(driver);
 				
 				newsTest.searchBing(rs.getString(1));
 				 Thread.sleep(9000);
 				
 				boolean test = driver.getPageSource().contains("O");
 				
 				Assert.assertEquals(test, true);
 			     
 				Thread.sleep(9000);

 	     		 driver.close();
 				setup();
 				
		}
     		
	   }
}