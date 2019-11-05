package basesetting;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class Chrome {
	
	public WebDriver driver;
	private FluentWait<WebDriver> myWaitVar;
	String actualTitle = "";
	Faker faker = new Faker();
	String name = faker.name().fullName();
	String firstName = faker.name().firstName();
	String lastName = faker.name().lastName();
	String streetAddress = faker.address().streetAddress();
	static String sublocation;
	
	public String Messsage;
	static String AddedAssetStatus,TypeName, SupplierName;

	@SuppressWarnings("deprecation")
	public void OpenWebsite(String baseUrl) {
		//change with your chromedriver location
		//System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/workspace/isitup/Lib/chromedriver");
		System.setProperty("webdriver.chrome.driver","/Users/refqi/Downloads/chromedriver");
		//System.setProperty("webdriver.chrome.driver","/Users/ahmadubaidilah/Documents/Lib/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("chrome");
        options.addArguments("window-size=1200x600");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        options.addArguments("disable-extensions");
        options.addArguments("disable-dev-shm-usage");
        options.addArguments("disable-gpu");
        options.addArguments("no-sandbox");
		//use it when run in headless
        //driver = new ChromeDriver(options);
        driver = new ChromeDriver();
		myWaitVar = new WebDriverWait (driver,30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(baseUrl);
		
	}
	
	public boolean CheckVisibility(String targetResourceId, String Name) {
		boolean isElementPresent;
		try{
			WebElement webelement = (WebElement) driver.findElements(By.xpath("+targetResourceId+"));
			@SuppressWarnings("deprecation")
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(webelement));
			isElementPresent = webelement.isDisplayed();
			System.out.println(Name +" is displayed");
			return isElementPresent;
		}catch(Exception e){
			isElementPresent = false;
			System.out.println(Name +" not displayed");
			//System.out.println(e.getMessage());
			return isElementPresent;
		}
		
	}
	
	public void checkTitle(String expectedTitle, String nameofTitle) {
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)){
            System.out.println(nameofTitle+" is displayed");
        } else {
            System.out.println(nameofTitle+" is not displayed");
        }

	}
	
	protected String getSaltString() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	public static String getRandomNumberString() {
	    Random rnd = new Random();
	    int number = rnd.nextInt(999999);
	    return String.format("%06d", number);
	}
	

	public void Open_Signup_Page() {
		OpenWebsite("https://secure.isitup.me/register");
		System.out.println("=================== S T A R T ======================");
		
	}
	
	
	//Start Here
	public void Fill_Empty_Fist_Name_SignUp() {
		driver.findElement(By.id("first_name")).clear();
		
	}

	public void Fill_Last_Name_SignUp() {
		driver.findElement(By.id("last_name")).sendKeys(lastName);
		
	}

	public void Fill_Company_Name_SignUp() {
		driver.findElement(By.id("company_name")).sendKeys(firstName+" "+lastName);
		
	}

	public void Fill_Email_Address_SignUp() {
		driver.findElement(By.id("email_address")).sendKeys(getSaltString()+"@tester.com");
		
	}

	public void Click_Agreement_Signup() throws InterruptedException {
		Thread.sleep(10);
		driver.findElement(By.xpath(".//*[@id='agree']")).sendKeys(Keys.SPACE);
	}
	
	public void Click_RegisterButton_Signup() {
		driver.findElement(By.xpath("//div[@id='__layout']/div/div/div/div/div[2]/div/div/div[7]/button/div")).click();
	}
	
	public void View_Error_Signup(String Element) {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Element)));
		Messsage = driver.findElement(By.xpath(Element)).getText();
		System.out.println("There is error message : "+Messsage );
	}
	

	public void View_Error_First_Name_Signup() {
		View_Error_Signup("//fieldset[@id='__BVID__17']/div/span");
		
	}

	public void Fill_Fist_Name_SignUp() {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		
	}

	public void Fill_Empty_Last_Name_SignUp() {
		driver.findElement(By.id("last_name")).clear();
		
	}

	public void View_Error_Last_Name_Signup() {
		View_Error_Signup("//fieldset[@id='__BVID__19']/div/span");
		
	}

	public void Fill_Empty_Company_Name_SignUp() {
		driver.findElement(By.id("company_name")).clear();
		
	}

	public void View_Error_Company_Name_Signup() {
		View_Error_Signup("//fieldset[@id='__BVID__21']/div/span");
		
	}

	public void Fill_Empty_Email_Address_SignUp() {
		driver.findElement(By.id("email_address")).clear();
		
	}

	public void View_Error_Email_Address_Signup() {
		View_Error_Signup("//fieldset[@id='__BVID__23']/div/span[2]");
		
	}

	public void Fill_Wrong_Format_Email_Address_SignUp() {
		driver.findElement(By.id("email_address")).sendKeys("ISITUP.COM");
		
	}

	
	public void User_Wait_For_Some_Second() throws InterruptedException {
		Thread.sleep(3000);
		
	}
	
	public void Open_Login_Page() {
		OpenWebsite("https://hanatakaruki.isitup.me/login");
		System.out.println("=================== S T A R T ======================");
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'btn pull-right')]")));
		
	}
	
	public void Fill_Empty_Email_Login() {
		driver.findElement(By.id("email")).clear();
		
	}

	public void Fill_Password_Login() {
		driver.findElement(By.id("password")).sendKeys("nokia2300");
		
	}

	public void Click_Login_Button_Login() {
		driver.findElement(By.xpath("//button[contains(@class,'btn pull-right')]")).click();
		
	}

	public void View_error_empty_email_Login() {
		View_Error_Signup("(//span[@class='invalid-feedback'])[1]");
		
	}
	
	
	public void success_quit_app() {
		System.out.println("This test running successfully");
		System.out.println("====================  E N D  =======================");
		driver.quit();
	}
	
	public void force_quit_app(String error_message) {
		System.out.println("This test force quit because :"+error_message);
		System.out.println("====================  E N D  =======================");
		driver.quit();
	}


	
	public void ss() {
		((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	public void Fill_Email_Login() {
		driver.findElement(By.id("email")).sendKeys("ahmadubaidillah5@gmail.com");
		
	}

	public void Fill_Empty_Password_Login() {
		driver.findElement(By.id("password")).clear();
		
	}

	public void View_error_empty_password_Login() {
		View_Error_Signup("(//span[@class='invalid-feedback'])[2]");
		
	}

	public void Fill_Wrong_Email_Login() {
		driver.findElement(By.id("email")).sendKeys("wrong@email.com");
	}

	public void View_Toast_Message() throws InterruptedException {
		Thread.sleep(500);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='toast-container']/div")));
		String notification = driver.findElement(By.xpath("//div[@id='toast-container']/div")).getText();
		System.out.println("there is notification "+ notification);
		
	}

	public void Fill_Wrong_Password_Login() {
		driver.findElement(By.id("password")).sendKeys("wrongpassword");
		
	}

	public void Redirect_to_Dashboard() throws InterruptedException {
		Thread.sleep(1000);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Dashboard']")));
	}

	public void Click_Setup_Button() {
		driver.findElement(By.xpath("//a[@href='/setup']")).click();
		
	}

	public void Redirect_to_Setup_Page() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Settings']")));
		
	}

	public void Click_Add_New_Category() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Category']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Category']]")).click();
		
	}

	public void Fill_Category_Name() {
		driver.findElement(By.id("name")).sendKeys("AA");
		
	}

	public void Fill_Category_Description() {
		driver.findElement(By.id("description")).clear();
		driver.findElement(By.id("description")).sendKeys("This just test add some category");
		
	}

	public void Click_Cancel_Button() {
		driver.findElement(By.xpath("//button[text()[normalize-space()='Cancel']]")).click();
		
	}

	public void Click_Add_New_Button_Category() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New']]")).click();
		
	}

	public void Click_Edit_Button_AA_Category() {
		driver.findElement(By.xpath("//button[text()[normalize-space()='Edit']]")).click();
		
	}

	public void Edit_AA_Category() {
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("AB");
		
	}

	public void Click_Save_Button_Category() {
		driver.findElement(By.xpath("//button[text()[normalize-space()='Save']]")).click();
		
	}

	public void Click_Delete_Button_AB_Category() {
		driver.findElement(By.xpath("//button[text()[normalize-space()='Delete']]")).click();
		
	}

	public void View_PopUp_Message() throws InterruptedException {
		Thread.sleep(1500);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("swal2-title")));
		String notification = driver.findElement(By.id("swal2-title")).getText();
		System.out.println("there is pop up notification :"+ notification);
		
	}

	public void Click_No_Button_Category() throws InterruptedException {
		Thread.sleep(1000);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No']")));
		driver.findElement(By.xpath("//button[text()='No']")).click();
		
	}


	public void Click_Yes_Delete_Button_Category() throws InterruptedException {
		Thread.sleep(1000);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Yes, Delete']")));
		driver.findElement(By.xpath("//button[text()='Yes, Delete']")).click();
		
	}

	public void Click_Add_New_Company() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Company']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Company']]")).click();
		
	}

	public void Fill_Setup_Company_Name_Company() {
		driver.findElement(By.id("company_name")).sendKeys("PT.A_"+getSaltString());
		
	}

	public void Fill_Setup_Company_Adress1_Company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Address Field 1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Address Field 1']")).sendKeys("Jl. Selayar, Mekarwangi, Kec. Cikarang Bar., Bekasi, Jawa Barat 17530");
	}

	public void Fill_Setup_Company_Adress2_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Address Field 2']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Address Field 2']")).sendKeys("Palawad, East Karawang, Karawang Regency, West Java");
		
		
	}

	public void Fill_Setup_Company_Country_Company() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Choose Your Country']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose Your Country']")).sendKeys("indonesia");
		driver.findElement(By.xpath("//input[@placeholder='Choose Your Country']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
	}

	public void Fill_Setup_Company_State_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your State']")).sendKeys("indonesia");
		
	}

	public void Fill_Setup_Company_City_Company() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//i[contains(@class,'fas fa-save')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your City']")).sendKeys("Bekasi");
		
	}

	public void Fill_Setup_Company_Street_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Street / Building']")).sendKeys("Jl. Selayar");
		
	}

	public void Fill_Setup_Company_Postal_Code_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Postal Code']")).sendKeys("17530");
		
		
	}

	public void Fill_Setup_Company_Registration_id_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Registration ID']")).sendKeys(getSaltString());
		
	}

	public void Fill_Setup_Company_Tax_id_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Tax ID']")).sendKeys(getSaltString());
		
	}

	public void Click_Companies_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Companies")));
		driver.findElement(By.linkText("Companies")).click();
		
		
	}

	public void Edit_Setup_Company_Name_Company() {
		driver.findElement(By.id("company_name")).clear();
		driver.findElement(By.id("company_name")).sendKeys("CV.A_"+getSaltString());
		
	}

	public void Edit_Setup_Company_Adress1_Company() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Address Field 1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Address Field 1']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Address Field 1']")).sendKeys("Jl. Embong Malang No.4, Kedungdoro, Kec. Tegalsari, Kota SBY, Jawa Timur 60261");
	
		
	}

	public void Edit_Setup_Company_Adress2_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Address Field 2']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Address Field 2']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Address Field 2']")).sendKeys("BRI Tower, Jl. Jenderal Basuki Rachmat No.122, Tegalsari, Surabaya City, East Java 60271");
		
	}

	public void Edit_Setup_Company_Country_Company() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Austria");
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
	}

	public void Edit_Setup_Company_State_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your State']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your State']")).sendKeys("Jawa Timur");
		
	}

	public void Edit_Setup_Company_City_Company() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//i[contains(@class,'fas fa-save')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your City']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your City']")).sendKeys("Surabaya");
		
	}

	public void Edit_Setup_Company_Street_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Street / Building']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Street / Building']")).sendKeys("Jl. Jenderal Basuki Rachmat");
		
	}

	public void Edit_Setup_Company_Postal_Code_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Postal Code']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Postal Code']")).sendKeys("60271");
		
	}

	public void Edit_Setup_Company_Registration_id_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Registration ID']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Registration ID']")).sendKeys(getSaltString());
		
	}

	public void Edit_Setup_Company_Tax_id_Company() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Tax ID']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Tax ID']")).sendKeys(getSaltString());
		
	}

	public void Fill_Delete_Reason() {
		driver.findElement(By.xpath("//textarea[@class='swal2-textarea']")).sendKeys("Just test delete");
		
	}

	public void Click_Department_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Department")));
		driver.findElement(By.linkText("Department")).click();
		
	}

	public void Click_Add_New_Department_Button(){
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Departments']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Departments']]")).click();
		
	}

	public void Fill_Setup_Department_Name() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Department Name']")).sendKeys("Akutansi");
		
	}

	public void Select_Company_from_List() {
		driver.findElement(By.xpath("//input[@placeholder='Choose Department Company']")).sendKeys("VOC");
		driver.findElement(By.xpath("//input[@placeholder='Choose Department Company']")).sendKeys(Keys.ENTER);
		
	}

	public void User_Edit_to_QC() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Department Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Department Name']")).sendKeys("Administrasi");
		
	}

	public void User_Select_Other_Company() throws InterruptedException {
		//driver.findElement(By.xpath("//input[@placeholder='Choose Department Company']")).sendKeys("PT.360 Drajat");
		//driver.findElement(By.xpath("//input[@placeholder='Choose Department Company']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
		driver.findElement(By.xpath("//li[contains(.,'PT.360 Drajat')]")).click();
		Thread.sleep(1000);
		
	}

	public void Click_Location_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Locations ']")));
		driver.findElement(By.xpath("//div[text()='Locations ']")).click();
		
	}

	public void Click_Add_New_Location_Button() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Location']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Location']]")).click();
		
	}

	public void Fill_Setup_Location_Name_Location() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Location Name']")).sendKeys("Jl."+getSaltString());
		
	}

	public void Fill_Select_Company_Location() {
		driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
		driver.findElement(By.xpath("//li[contains(.,'VOC')]")).click();
		
	}

	public void Select_Show_on_Map() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//button[text()[normalize-space()='Show On Map']]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//button[text()[normalize-space()='Show On Map']]")).click();
		
	}

	public void Change_Location_Name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("location_name")).clear();
		driver.findElement(By.id("location_name")).sendKeys("Jl."+getSaltString());
		
	}

	public void Change_Company_Location() {
		driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
		driver.findElement(By.xpath("//li[contains(.,'PT.360 Drajat')]")).click();
		
	}


	public void Click_Dropdown_Location() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[contains(@class,'fas fa-angle-down')])[1]")));
		driver.findElement(By.xpath("(//i[contains(@class,'fas fa-angle-down')])[1]")).click();
		
	}

	public void Click_Sublocation_Menu_Button() {
		driver.findElement(By.xpath("//div[text()='Sub-Location']")).click();
		
	}

	public void Click_Add_New_Sublocation_Button() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Sub-Location']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Sub-Location']]")).click();
		
	}

	public void Select_Location_For_Sub_Location() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Choose Location Name']")).click();
		driver.findElement(By.xpath("//li[contains(.,'Kalimantan')]")).click();
		
	}

	public void Fill_Sub_Location_Name() {
		sublocation = "SubLoc_"+getSaltString();
		driver.findElement(By.id("sub-location-name")).sendKeys(sublocation);
		
	}

	public void Fill_Sub_Location_Addess() {
		driver.findElement(By.id("sub-location-address")).sendKeys("Jl. Raya Suci Km 24");
		
	}

	public void Search_Ziyadah_SubLocation() {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(sublocation);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(Keys.ENTER);
		
	}

	public void Find_Ziyadah_Result() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='"+sublocation+"']")));
		
	}

	public void Change_Company_Sub_Location() throws InterruptedException {
		String company_sublocation = driver.findElement(By.xpath("(//input[@type='search'])[4]")).getText();
		System.out.println(company_sublocation);
		Thread.sleep(1000);
		if (company_sublocation.equals("VOC")) {
			driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
			driver.findElement(By.xpath("//li[contains(.,'PT.360 Drajat')]")).click();
		}else {
			driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
			driver.findElement(By.xpath("//li[contains(.,'VOC')]")).click();
		
	}
	}

	public void Change_Location_Sub_Location() throws InterruptedException {
		String location_sublocation = driver.findElement(By.xpath("(//span[@class='vs__selected'])[5]")).getText();
		System.out.println(location_sublocation);
		Thread.sleep(1000);
		if (location_sublocation.equals("Kalimantan")) {
			driver.findElement(By.xpath("(//span[@class='vs__selected'])[5]")).click();
			driver.findElement(By.xpath("//li[contains(.,'Papua')]")).click();
		}else {
			driver.findElement(By.xpath("(//span[@class='vs__selected'])[5]")).click();
			driver.findElement(By.xpath("//li[contains(.,'Kalimantan')]")).click();
		
	}
	}

	public void Change_Name_Sub_Location() {
		sublocation = "SubLoc_"+getSaltString();
		driver.findElement(By.id("sub-location-name")).clear();
		driver.findElement(By.id("sub-location-name")).sendKeys(sublocation);
		
	}

	public void Change_Address_Sub_Location() {
		driver.findElement(By.id("sub-location-address")).clear();
		driver.findElement(By.id("sub-location-address")).sendKeys("Jl Kwitang Raya 8 Ged Senatama Lt 2,Kwitang");
		
	}

	public void Click_Manufacturer_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Manufacturer ']")));
		driver.findElement(By.xpath("//div[text()='Manufacturer ']")).click();
		
	}

	public void Click_Add_Manufacturer_Button_Manufacturer() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Manufacturers']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Manufacturers']]")).click();
		
	}

	public void Fill_Manufacturer_Name() {
		driver.findElement(By.id("manufacturer_name")).sendKeys("VIAR");
		
	}

	public void Fill_Manufacturer_Description() {
		driver.findElement(By.id("manufacturer_description")).sendKeys("Motor Manufacturer");
		
	}

	public void Change_Manufacturer_Name() {
		driver.findElement(By.id("manufacturer_name")).clear();
		driver.findElement(By.id("manufacturer_name")).sendKeys("TVS");
		
	}

	public void Change_Manufacturer_Description() {
		driver.findElement(By.id("manufacturer_description")).clear();
		driver.findElement(By.id("manufacturer_description")).sendKeys("Ninja Motor");
		
	}

	public void Click_Dropdown_Manufacturer() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[contains(@class,'fas fa-angle-down')])[2]")));
		driver.findElement(By.xpath("(//i[contains(@class,'fas fa-angle-down')])[2]")).click();
		
	}

	public void Click_Model_Menu_Button() {
		driver.findElement(By.xpath("//div[text()='Models']")).click();
		
	}

	public void Click_Add_New_Model() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Models']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Models']]")).click();
		
	}

	public void Select_Manufacturer_from_List() {
		driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Yamaha')]")).click();
		
	}

	public void Fill_Model_Name() {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Vixion");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ENTER);
	}

	public void Change_Model_Manufacturer_From_List() {
		driver.findElement(By.xpath("(//input[@type='search'])[4]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Honda')]")).click();
		
	}

	public void Change_Model_Name() {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Vario");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.ENTER);
		
	}

	public void Click_Suplier_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Suppliers")));
		driver.findElement(By.linkText("Suppliers")).click();
		
	}

	public void Click_Add_New_Suplier_Button() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Supplier']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Supplier']]")).click();
		
	}

	public void Fill_Suplier_Name() {
		SupplierName = name;
		driver.findElement(By.xpath("(//input[@id='first_name'])[1]")).sendKeys(SupplierName);
		
	}

	public void Fill_Suplier_State() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[2]")).sendKeys("Bekasi");
		
	}

	public void Fill_Suplier_City() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[3]")).sendKeys("Cibitung");
		
	}

	public void Fill_Suplier_Street() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[4]")).sendKeys("JL. Buncit Persada, No.1");
		
	}

	public void Fill_Suplier_Postal_Code() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[5]")).sendKeys(getRandomNumberString());
		
	}

	public void Fill_Suplier_Cp_Name() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//i[contains(@class,'fas fa-save')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Contact Person']")).sendKeys(SupplierName);
		
	}

	public void Fill_Suplier_Cp_Primary_Number() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Primary Contact Number']")).sendKeys("08856"+getRandomNumberString());
		
	}

	public void Fill_Suplier_Cp_Alternate_Number() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Alternate Contact Number']")).sendKeys("08838"+getRandomNumberString());
		
		
	}

	public void Fill_Suplier_Cp_Email_Address() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']")).sendKeys(getSaltString()+"@gmail.com");
		
	}

	public void Fill_Suplier_Cp_Website() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Website']")).sendKeys("https://"+firstName+".com");
		
	}

	public void Fill_Suplier_Cp_Comapny_Regiter_Id() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Company Registration ID']")).sendKeys(getRandomNumberString()+getSaltString());
		
	}

	public void Change_Suplier_Name() {
		SupplierName = name;
		driver.findElement(By.xpath("(//input[@id='first_name'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='first_name'])[1]")).sendKeys(SupplierName);
		
	}

	public void Change_Suplier_State() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@id='first_name'])[2]")).sendKeys("Jakarta");
		
	}

	public void Change_Suplier_City() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@id='first_name'])[3]")).sendKeys("Cimanggis");
		
	}

	public void Change_Suplier_Street() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[4]")).clear();
		driver.findElement(By.xpath("(//input[@id='first_name'])[4]")).sendKeys("Jl Raya Bogor Km 335/19,Curug");
		
	}

	public void Change_Suplier_Postal_Code() {
		driver.findElement(By.xpath("(//input[@id='first_name'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@id='first_name'])[5]")).sendKeys(getRandomNumberString());
		
	}

	public void Change_Suplier_Cp_Name() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//button[text()[normalize-space()='Edit']]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Contact Person']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Contact Person']")).sendKeys(SupplierName);
		
	}

	public void Change_Suplier_Cp_Primary_Number() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Primary Contact Number']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Primary Contact Number']")).sendKeys("08856"+getRandomNumberString());
		
	}

	public void Change_Suplier_Cp_Alternate_Number() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Alternate Contact Number']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Alternate Contact Number']")).sendKeys("08838"+getRandomNumberString());
		
		
	}

	public void Change_Suplier_Cp_Email_Address() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Email Address']")).sendKeys(getSaltString()+"@gmail.com");
		
	}

	public void Change_Suplier_Cp_Website() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Website']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Website']")).sendKeys("https://"+firstName+".com");
		
		
	}

	public void Change_Suplier_Cp_Company_Regiter_Id() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Company Registration ID']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Company Registration ID']")).sendKeys(getRandomNumberString()+getSaltString());
		
		
	}


	public void Click_Edit_Button() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='btn btn-deep-primary'])[2]")).click();
		
	}

	public void Click_Type_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Type ']")));
		driver.findElement(By.xpath("//div[text()='Type ']")).click();
		
	}

	public void Click_Add_New_Type_Button() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Type']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Type']]")).click();
		
	}

	public void Select_Category_From_List() {
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Network Equipment");
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys(Keys.ENTER);
		
	}

	public void Fill_Type_Name() {
		TypeName = "Modem TPlink "+getSaltString();
		driver.findElement(By.xpath("//input[@placeholder='Enter Type Name']")).sendKeys(TypeName);
		
	}

	public void Search_TypeName() {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(TypeName);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(Keys.ENTER);
		
	}

	public void Find_TypeName() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='"+TypeName+"']")));
		
	}
	
	public void Change_Category_From_List() {
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Furniture");
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys(Keys.ENTER);
		
	}

	public void Change_Type_Name() throws InterruptedException {
		driver.findElement(By.id("name")).clear();
		TypeName = "Meja informa "+getSaltString();
		driver.findElement(By.id("name")).sendKeys(TypeName);
		
	}

	public void Click_Dropdown_Type() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='nav-link']//i)[3]")));
		driver.findElement(By.xpath("(//a[@class='nav-link']//i)[3]")).click();
		
	}

	public void Click_Sub_Type_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sub Type']")));
		driver.findElement(By.xpath("//div[text()='Sub Type']")).click();
		
	}

	public void Click_Add_New_Sub_Type_Button() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Sub-Type']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Sub-Type']]")).click();
		
	}
	
	public void Select_Category_SubType_From_List() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Choose Type Category']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose Type Category']")).sendKeys("Network Equipment");
		driver.findElement(By.xpath("//input[@placeholder='Choose Type Category']")).sendKeys(Keys.ENTER);
		
	}

	public void Select_Type_From_List() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Choose Sub-Type Type']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose Sub-Type Type']")).sendKeys("Modem Huawei E352");
		driver.findElement(By.xpath("//input[@placeholder='Choose Sub-Type Type']")).sendKeys(Keys.ENTER);
		
	}



	public void Fill_Sub_Type_Name() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Sub-Type Name']")).sendKeys("Baut SN "+getSaltString());
		
	}

	public void Search_Hardisk() {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Hardisk Hitachi");
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(Keys.ENTER);
		
	}

	public void Find_Hardisk() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Hardisk Hitachi']")));
		
	}

	public void Change_Category_SubType_From_List() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='vs__search'])[5]")).click();
		driver.findElement(By.xpath("(//input[@class='vs__search'])[5]")).sendKeys("Computer");
		driver.findElement(By.xpath("(//input[@class='vs__search'])[5]")).sendKeys(Keys.ENTER);
		
	}

	public void Change_Type_From_List() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='vs__search'])[6]")).click();
		driver.findElement(By.xpath("(//input[@class='vs__search'])[6]")).sendKeys("laptop thinkpad x220");
		driver.findElement(By.xpath("(//input[@class='vs__search'])[6]")).sendKeys(Keys.ENTER);
		
	}

	public void Change_Sub_Type_Name() {
		driver.findElement(By.xpath("//input[@placeholder='Enter Sub-Type Name']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter Sub-Type Name']")).sendKeys("Hardisk Hitachi");
		
	}

	public void Click_Item_Code_Button_Menu() throws InterruptedException {
		Thread.sleep(500);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Item Code")));
		driver.findElement(By.linkText("Item Code")).click();
		
	}

	public void Click_Add_New_Item_Code_Button() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Item Code']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Item Code']]")).click();
		
	}
	
	public void Fill_Item_Code() {
		driver.findElement(By.xpath("//input[@placeholder='Enter item code']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Enter item code']")).sendKeys(getSaltString());
		
	}

	public void Fill_Item_Code_Name() {
		driver.findElement(By.xpath("//input[@placeholder='Enter item code name']")).clear();
		Random rand = new Random();
	    List<String>codeName = Arrays.asList("Nokia", "Xiaomi", "Samsung", "Apple","Oppo","Vivo");
	    int randomIndex = rand.nextInt(codeName.size());
		driver.findElement(By.xpath("//input[@placeholder='Enter item code name']")).sendKeys(codeName.get(randomIndex));
		
	}

	public void Fill_Item_Code_Description() {
		driver.findElement(By.xpath("//input[@placeholder='Enter description']")).clear();
		Random rand = new Random();
		List<String>Description = Arrays.asList("Hp murah", "Hp hebat", "Hp canggih", "Hp mahal","Hp kamera jahat");
	    int randomDescription = rand.nextInt(Description.size());
	    driver.findElement(By.xpath("//input[@placeholder='Enter description']")).sendKeys(Description.get(randomDescription));
		
	}

	public void Select_Manufacturer_from_list_item() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose manufacturer']")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='CS shop']]")).click();
		
	}

	public void Select_Model_from_list() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//button[text()[normalize-space()='Add New']]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Choose model']")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='Telepon Seluler']]")).click();
		
	}

	public void Select_Categories_from_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose categories']")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='Computer']]")).click();
		
	}

	public void Select_Asset_Type_from_list() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Choose asset type']")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='laptop thinkpad x220']]")).click();
		
	}

	public void Select_Suplier_from_list() throws InterruptedException {
	    driver.findElement(By.xpath("//input[@placeholder='Choose supplier']")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='Kasey Block']]")).click();
	    Thread.sleep(500);
		
	}

	public void Change_Manufacturer_from_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='Bebenk Store']]")).click();
		
	}

	public void Change_Model_from_list() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//button[text()[normalize-space()='Cancel']]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Choose model']")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='Smart Phone']]")).click();
		
	}

	public void Change_Categories_from_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='search'])[5]")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='Network Equipment']]")).click();
		
	}

	public void Change_Asset_Type_from_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Choose asset type']")).click();
	    driver.findElement(By.xpath("//li[text()[normalize-space()='Modem Huawei E352']]")).click();
		
	}

	public void Change_Suplier_from_list() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@name='supplier']//*[@class='vs__open-indicator']")).click();
		driver.findElement(By.xpath("//li[text()[normalize-space()='Matilda']]")).click();
		Thread.sleep(500);
		
	}

	public void Click_Asset_Status_Button_Menu() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Asset Status")));
		driver.findElement(By.linkText("Asset Status")).click();
		
	}

	public void Click_Add_Asset_Status() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()[normalize-space()='Add New Asset Status']]")));
		driver.findElement(By.xpath("//button[text()[normalize-space()='Add New Asset Status']]")).click();
		
	}

	public void Fill_Asset_Status_Name() {
		driver.findElement(By.xpath("//input[@placeholder='New Asset Status Name']")).clear();
		Random rand = new Random();
	    List<String> givenList = Arrays.asList("Rusak", "Normal", "Dipinjam", "Dikembalikan","Hilang","Diservis");
	    int randomIndex = rand.nextInt(givenList.size());
	    AddedAssetStatus = givenList.get(randomIndex);
	    driver.findElement(By.xpath("//input[@placeholder='New Asset Status Name']")).sendKeys(AddedAssetStatus);
	    System.out.println(AddedAssetStatus);
		
	}

	public void Search_Added_Asset_Status()  {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(AddedAssetStatus);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(Keys.ENTER);
		
	}

	public void View_Asset_Status_Search_Result() {
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='"+AddedAssetStatus+"']")));
		
	}

	public void Click_Edit_Button_Manufacturer() {
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-secondary')])[2]")).click();
		
	}

	public void Click_Delete_Button_Manufacturer() {
		driver.findElement(By.xpath("(//button[contains(@class,'btn btn-danger')])[2]")).click();
		
	}

	public void Filter_VIAR() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()[normalize-space()='Filters']]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()[normalize-space()='VIAR']]")).click();
		Thread.sleep(500);
		
	}

	public void Filter_TVS()throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()[normalize-space()='Filters']]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()[normalize-space()='TVS']]")).click();
		Thread.sleep(500);
		
	}

	public void Filter_Yamaha() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()[normalize-space()='Filters']]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()[normalize-space()='Yamaha']]")).click();
		Thread.sleep(500);
		
	}

	public void Filter_Honda() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()[normalize-space()='Filters']]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//input[@type='search'])[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()[normalize-space()='Honda']]")).click();
		Thread.sleep(500);
		
	}

	public void Search_Suplier_Name() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(SupplierName);
		driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='"+SupplierName+"']")));
	}




		
	
	


}

