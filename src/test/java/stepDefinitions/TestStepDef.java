package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basesetting.Chrome;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.en.And;


public class TestStepDef {

	Chrome ch= new Chrome();
	
	@Given("User open signup page")
	public void User_open_signup_page() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Open_Signup_Page();
	}
	
	@And("User fill first name with empty")
	public void User_fill_first_name_with_empty() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Empty_Fist_Name_SignUp();
	}
	
	@And("User fill last name")
	public void User_fill_last_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Last_Name_SignUp();
	}
	
	@And("User fill company name")
	public void User_fill_company_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Company_Name_SignUp();
	}
	
	@And("User fill email address")
	public void User_fill_email_address() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Email_Address_SignUp();
	}
	
	@And("User click agreement")
	public void User_tick_user_agreement() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Agreement_Signup();
	}
	
	
	@And("User click register button")
	public void User_click_register_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_RegisterButton_Signup();
	}
	
	@Then("User view error first name message")
	public void User_view_error_first_name_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_Error_First_Name_Signup();
	}
	
	@And("User quit the browser")
	public void User_quit_the_browser() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.success_quit_app();
	}
	
	@And("User fill first name")
	public void User_fill_first_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Fist_Name_SignUp();
	}
	
	@And("User fill last name with empty")
	public void User_fill_last_name_with_empty() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Empty_Last_Name_SignUp();
	}
	
	@Then("User view error last name message")
	public void User_view_error_last_name_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_Error_Last_Name_Signup();
	}
	
	@And("User fill company name with empty")
	public void User_fill_company_name_with_empty() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Empty_Company_Name_SignUp();
	}
	
	@Then("User view error company name message")
	public void User_view_error_company_name_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_Error_Company_Name_Signup();
	}
	
	@And("User fill email address with empty")
	public void User_fill_email_address_with_empty() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Empty_Email_Address_SignUp();
	}
	
	@Then("User view error email address message")
	public void User_view_error_email_address_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_Error_Email_Address_Signup();
	}
	
	@And("User fill email address with wrong format")
	public void User_fill_email_address_with_wrong_format() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Wrong_Format_Email_Address_SignUp();
	}
	
	@Then("User view register success message")
	public void User_view_register_success_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_Toast_Message();
	}
	
	@And("User wait for some second")
	public void User_wait_for_some_second() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.User_Wait_For_Some_Second();
	}

	@Given("User open login page")
	public void User_open_login_page() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Open_Login_Page();
	}
	
	@And("User fill login email with empty")
	public void User_fill_login_email_with_empty() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Empty_Email_Login();
	}
	
	@And("User fill login password")
	public void User_fill_login_password() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Password_Login();
	}
	
	@And("User click login button")
	public void User_click_login_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Login_Button_Login();
	}
	
	@Then("User view error empty email message")
	public void User_view_error_empty_email_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_error_empty_email_Login();
	}
	
	@And("User fill login email")
	public void User_fill_login_email() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Email_Login();
	}
	
	@And("User fill login password with empty")
	public void User_fill_login_password_with_empty() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Empty_Password_Login();
	}
	
	@Then("User view error empty password message")
	public void User_view_error_empty_password_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_error_empty_password_Login();
	}
	
	@And("User fill login email with wrong email")
	public void User_fill_login_email_with_wrong_email() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Wrong_Email_Login();
	}
	
	@Then("User view toast message")
	public void User_view_toast_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_Toast_Message();
	}
	
	@And("User fill login password with wrong password")
	public void User_fill_login_password_with_wrong_password() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Wrong_Password_Login();
	}
	
	@Then("User redirect to dashboard page")
	public void User_redirect_to_dashboard_page() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Redirect_to_Dashboard();
	}
	
	@And("User click setup button menu")
	public void User_click_setup_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Setup_Button();
	}
	
	@Then("User redirect to setup page")
	public void User_redirect_to_setup_page() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Redirect_to_Setup_Page();
	}
	
	@And("User click add new category button")
	public void User_click_add_new_category_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Add_New_Category();
	}
	
	@And("User fill category name")
	public void User_fill_category_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Category_Name();
	}
	
	@And("User fill category description")
	public void User_fill_category_description() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Category_Description();
	}
	
	@And("User click cancel button")
	public void User_click_cancel_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Cancel_Button();
	}
	
	@Then("User back to category list")
	public void User_back_to_category_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Redirect_to_Setup_Page();
	}
	
	@And("User click add new button")
	public void User_click_add_new_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Add_New_Button_Category();
	}
	
	@And("User edit button on AA category")
	public void User_edit_button_on_AA_category() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User edit to AB")
	public void User_edit_to_AB() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_AA_Category();
	}
	
	@And("User click save button")
	public void User_click_save_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Save_Button_Category();
	}
	
	@And("User delete button on AB category")
	public void User_delete_button_on_AB_category() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Delete_Button_AB_Category();
	}
	
	@Then("User view pop up message")
	public void User_view_pop_up_message() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.View_PopUp_Message();
	}
	
	@And("User click no button")
	public void User_click_no_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_No_Button_Category();
	}
	
	@And("User click yes delete button")
	public void User_click_yes_delete_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Yes_Delete_Button_Category();
	}
	
	@And("User click companies menu button")
	public void User_click_companies_menu_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Companies_Button_Menu();
	}
	
	@And("User click add new company button")
	public void User_click_add_new_company_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Add_New_Company();
	}
	
	@And("User fill setup company name")
	public void User_fill_setup_company_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Name_Company();
	}
	
	@And("User fill setup company address field1")
	public void User_fill_setup_company_address_field1() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Adress1_Company();
	}
	
	@And("User fill setup company address field2")
	public void User_fill_setup_company_address_field2() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Adress2_Company();
	}
	
	@And("User fill setup company country")
	public void User_fill_setup_company_country() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Country_Company();
	}
	
	@And("User fill setup company state")
	public void User_fill_setup_company_state() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_State_Company();
	}
	
	@And("User fill setup company city")
	public void User_fill_setup_company_city() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_City_Company();
	}
	
	@And("User fill setup company street")
	public void User_fill_setup_company_street() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Street_Company();
	}
	
	@And("User fill setup company postal code")
	public void User_fill_setup_company_postal_code() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Postal_Code_Company();
	}
	
	@And("User fill setup company registration id")
	public void User_fill_setup_company_registration_id() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Registration_id_Company();
	}
	
	@And("User fill setup company tax id")
	public void User_fill_setup_company_tax_id() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Company_Tax_id_Company();
	}
	
	
	@And("User back to company list")
	public void User_back_to_company_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User click edit company")
	public void User_click_edit_company() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User edit setup company name")
	public void User_edit_setup_company_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Name_Company();
	}
	
	@And("User edit setup company address field1")
	public void User_edit_setup_company_address_field1() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Adress1_Company();
	}
	
	@And("User edit setup company address field2")
	public void User_edit_setup_company_address_field2() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Adress2_Company();
	}
	
	@And("User edit setup company country")
	public void User_edit_setup_company_country() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Country_Company();
	}
	
	@And("User edit setup company state")
	public void User_edit_setup_company_state() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_State_Company();
	}
	
	@And("User edit setup company city")
	public void User_edit_setup_company_city() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_City_Company();
	}
	
	@And("User edit setup company street")
	public void User_edit_setup_company_street() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Street_Company();
	}
	
	@And("User edit setup company postal code")
	public void User_edit_setup_company_postal_code() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Postal_Code_Company();
	}
	
	@And("User edit setup company registration id")
	public void User_edit_setup_company_registration_id() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Registration_id_Company();
	}
	
	@And("User edit setup company tax id")
	public void User_edit_setup_company_tax_id() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Edit_Setup_Company_Tax_id_Company();
	}
	
	@And("User click delete company")
	public void User_click_delete_company() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User fill reason delete company")
	public void User_fill_reason_delete_company() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Delete_Reason();
	}
	
	@And("User click department button menu")
	public void User_click_department_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Department_Button_Menu();
	}

	@And("User click add new department button")
	public void User_click_add_new_department_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Add_New_Department_Button();
	}
	
	@And("User fill setup department name")
	public void User_fill_setup_department_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Department_Name();
	}
	
	@And("User select company from list")
	public void User_select_company_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Select_Company_from_List();
	}
	
	@Then("User back to department list")
	public void User_back_to_department_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		 ch.Redirect_to_Setup_Page();
	}
	
	@And("User edit button on QA category")
	public void User_edit_button_on_QA_category() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User edit to QC")
	public void User_edit_to_QC() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.User_Edit_to_QC();
	}
	
	@And("User select other company from list")
	public void User_select_other_company_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.User_Select_Other_Company();
	}
	
	@And("User delete button on QC department")
	public void User_delete_button_on_QC_department() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User click location button menu")
	public void User_click_location_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Location_Button_Menu();
	}
	
	@And("User click add new location button")
	public void User_click_add_new_location_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Add_New_Location_Button();
	}
	
	@And("User fill setup location name")
	public void User_fill_setup_location_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Setup_Location_Name_Location();
	}
	
	@And("User select company location from list")
	public void User_select_company_location_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Select_Company_Location();
	}
	
	@And("User select show on map")
	public void User_select_show_on_map() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Select_Show_on_Map();
	}
	
	@And("User click edit peganden location")
	public void User_click_edit_peganden_location() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		 ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change location name")
	public void User_change_location_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		 ch.Change_Location_Name();
	}
	
	@And("User change company location from list")
	public void User_change_company_location_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		 ch.Change_Company_Location();
	}
	
	@And("User delete location")
	public void User_delete_location() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User back to location list")
	public void User_back_to_location_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User click dropdown location")
	public void User_click_dropdown_location() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Dropdown_Location();
	}
	
	@And("User click sub location button menu")
	public void User_click_sub_location_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Sublocation_Menu_Button();
	}
	
	@And("User click add new sub location button")
	public void User_click_add_new_sub_location_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Add_New_Sublocation_Button();
	}
	
	@And("User select company sub location from list")
	public void User_select_company_sub_location_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Select_Company_Location();
	}
	
	@And("User select location for sub location")
	public void User_select_location_for_sub_location() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Location_For_Sub_Location();
	}
	
	@And("User fill sub location name")
	public void User_fill_sub_location_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Sub_Location_Name();
	}
	
	@And("User fill sub location address")
	public void User_fill_sub_location_address() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Sub_Location_Addess();
	}
	
	@And("User back to sub location list")
	public void User_back_to_sub_location_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User search ziyadah")
	public void User_search_ziyadah() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Search_Ziyadah_SubLocation();
	}
	
	@Then("User find ziyadah result")
	public void User_find_ziyadah_result() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Find_Ziyadah_Result();
	}
	
	@And("User click edit sub location button")
	public void User_click_edit_sub_location_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change company sub location from list")
	public void User_change_company_sub_location_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Company_Sub_Location();
	}
	
	@And("User change location for sub location")
	public void User_change_location_for_sub_location() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Location_Sub_Location();
	}
	
	@And("User change sub location name")
	public void User_change_sub_location_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Name_Sub_Location();
	}
	
	@And("User change sub location address")
	public void User_change_sub_location_addresse() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Address_Sub_Location();
	}
	
	@And("User click delete sub location button")
	public void User_click_delete_sub_location_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User click manufacturer button menu")
	public void User_click_manufacturer_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Manufacturer_Button_Menu();
	}
	
	@And("User click add new manufacturer button")
	public void User_click_add_new_manufacturer_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Add_Manufacturer_Button_Manufacturer();
	}
	
	@And("User fill manufacturer name")
	public void User_fill_manufacturer_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Manufacturer_Name();
	}
	
	@And("User fill manufacturer description")
	public void User_fill_manufacturer_description() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Manufacturer_Description();
	}
	
	@And("User click edit button on manufacturer")
	public void User_click_edit_button_on_manufacturer() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	
	@And("User change manufacturer name")
	public void User_change_manufacturer_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Manufacturer_Name();
	}
	
	@And("User change manufacturer description")
	public void User_change_manufacturer_description() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Manufacturer_Description();
	}
	
	@And("User click delete button on manufacturer")
	public void User_click_delete_button_on_manufacturer() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	
	@And("User click dropdown manufacturer")
	public void User_click_dropdown_manufacturer() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Dropdown_Manufacturer();
	}
	
	@And("User click model button menu")
	public void User_click_model_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Model_Menu_Button();
	}
	
	@And("User click add new model button")
	public void User_click_add_new_model_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Click_Add_New_Model();
	}
	
	@And("User select manufacturer from list")
	public void User_select_manufacturer_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Select_Manufacturer_from_List();
	}
	
	@And("User fill model name")
	public void User_fill_model_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    ch.Fill_Model_Name();
	}
	
	@And("User click edit model button")
	public void User_click_edit_model_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change manufacturer from list")
	public void User_change_manufacturer_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Model_Manufacturer_From_List();
	}
	
	@And("User change model name")
	public void User_change_model_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Model_Name();
	}
	
	@And("User click delete model button")
	public void User_click_delete_model_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User click suplier button menu")
	public void User_click_suplier_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Suplier_Button_Menu();
	}
	
	
	@And("User click add new suplier button")
	public void User_click_add_new_suplier_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Add_New_Suplier_Button();
	}
	
	@And("User fill suplier name")
	public void User_fill_suplier_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Name();
	}
	
	@And("User select suplier country from list")
	public void User_select_suplier_country_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Setup_Company_Country_Company();
	}
	
	@And("User fill suplier state")
	public void User_fill_suplier_state() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_State();
	}

	@And("User fill suplier city")
	public void User_fill_suplier_city() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_City();
	}
	
	@And("User fill suplier street")
	public void User_fill_suplier_street() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Street();
	}
	
	@And("User fill suplier postal code")
	public void User_fill_suplier_postal_code() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Postal_Code();
	}
	
	@And("User fill suplier contact person name")
	public void User_fill_suplier_contact_person_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Cp_Name();
	}
	
	@And("User fill suplier primary contact number")
	public void User_fill_suplier_primary_contact_number() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Cp_Primary_Number();
	}
	
	@And("User fill suplier alternate contact number")
	public void User_fill_suplier_alternate_contact_number() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Cp_Alternate_Number();
	}
	
	@And("User fill suplier email address")
	public void User_fill_suplier_email_address() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Cp_Email_Address();
	}
	
	@And("User fill suplier website")
	public void User_fill_suplier_website() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Cp_Website();
	}
	
	@And("User fill suplier company register id")
	public void User_fill_suplier_company_register_id() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Suplier_Cp_Comapny_Regiter_Id();
	}

	@And("User click edit suplier button")
	public void User_click_edit_suplier_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change suplier name")
	public void User_change_suplier_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Name();
	}
	
	@And("User change suplier country from list")
	public void User_change_suplier_country_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Edit_Setup_Company_Country_Company();
	}
	
	@And("User change suplier state")
	public void User_change_suplier_state() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_State();
	}

	@And("User change suplier city")
	public void User_change_suplier_city() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_City();
	}
	
	@And("User change suplier street")
	public void User_change_suplier_street() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Street();
	}
	
	@And("User change suplier postal code")
	public void User_change_suplier_postal_code() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Postal_Code();
	}
	
	@And("User change suplier contact person name")
	public void User_change_suplier_contact_person_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Cp_Name();
	}
	
	@And("User change suplier primary contact number")
	public void User_change_suplier_primary_contact_number() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Cp_Primary_Number();
	}
	
	@And("User change suplier alternate contact number")
	public void User_change_suplier_alternate_contact_number() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Cp_Alternate_Number();
	}
	
	@And("User change suplier email address")
	public void User_change_suplier_email_address() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Cp_Email_Address();
	}
	
	@And("User change suplier website")
	public void User_change_suplier_website() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Cp_Website();
	}
	
	@And("User change suplier company register id")
	public void User_change_suplier_company_register_id() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_Cp_Company_Regiter_Id();
	}
	
	@And("User click edit button")
	public void User_click_edit_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button();
	}
	
	@And("User click delete suplier button")
	public void User_click_delete_suplier_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User click type button menu")
	public void User_click_type_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Type_Button_Menu();
	}
	
	@And("User click add new type button")
	public void User_click_add_new_type_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Add_New_Type_Button();
	}

	@And("User select category from list")
	public void User_select_category_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Category_From_List();
	}
	
	@And("User fill type name")
	public void User_fill_type_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Type_Name();
	}

	@And("User click edit type button")
	public void User_click_edit_type_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change category from list")
	public void User_change_category_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Category_From_List();
	}
	
	@And("User change type name")
	public void User_change_type_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Type_Name();
	}
	
	@And("User click delete type button")
	public void User_click_delete_type_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User click dropdown type")
	public void User_click_dropdown_type() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Dropdown_Type();
	}

	@And("User click sub type button menu")
	public void User_click_sub_type_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Sub_Type_Button_Menu();
	}
	
	@And("User click add new sub type button")
	public void User_click_add_new_sub_type_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Add_New_Sub_Type_Button();
	}
	
	@And("User select category sub type from list")
	public void User_select_category_sub_type_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Category_SubType_From_List();
	}
	
	@And("User select type from list")
	public void User_select_type_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Type_From_List();
	}
	
	@And("User fill sub type name")
	public void User_fill_sub_type_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Sub_Type_Name();
	}
	
	@And("User search hardisk")
	public void User_search_hardisk() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Search_Hardisk();
	}
	
	@And("User find hardisk result")
	public void User_find_hardisk_result() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Find_Hardisk();
	}
	
	@And("User click edit sub type button")
	public void User_click_edit_sub_type_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change category sub type from list")
	public void User_change_category_sub_type_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Category_SubType_From_List();
	}
	
	@And("User change type from list")
	public void User_change_type_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Type_From_List();
	}
	
	@And("User change sub type name")
	public void User_change_sub_type_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Sub_Type_Name();
	}
	
	@And("User click delete sub type button")
	public void User_click_delete_sub_type_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User click item code button menu")
	public void User_click_item_code_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Item_Code_Button_Menu();
	}
	
	@And("User click add new item code button")
	public void User_click_add_new_item_code_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Add_New_Item_Code_Button();
	}
	
	@And("User fill item code")
	public void User_fill_item_code() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Item_Code();
	}
	
	@And("User fill code name")
	public void User_fill_code_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Item_Code_Name();
	}
	
	@And("User fill item code description")
	public void User_fill_item_code_description() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Item_Code_Description();
	}
	
	@And("User select manufacture from list")
	public void User_select_manufacture_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Manufacturer_from_list_item();
	}
	
	@And("User select model from list")
	public void User_select_model_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Model_from_list();
	}
	
	@And("User select categories from list")
	public void User_select_categories_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Categories_from_list();
	}
	
	@And("User select asset type from list")
	public void User_select_asset_type_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Asset_Type_from_list();
	}
	
	@And("User select suplier from list")
	public void User_select_suplier_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Select_Suplier_from_list();
	}
	
	@And("User click edit item code button")
	public void User_click_edit_item_code_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change item code")
	public void User_change_item_code() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Item_Code();
	}
	
	@And("User change code name")
	public void User_change_code_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Item_Code_Name();
	}
	
	@And("User change item code description")
	public void User_change_item_code_description() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Item_Code_Description();
	}
	
	@And("User change manufacture from list")
	public void User_change_manufacture_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Manufacturer_from_list();
	}
	
	@And("User change model from list")
	public void User_change_model_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Model_from_list();
	}
	
	@And("User change categories from list")
	public void User_change_categories_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Categories_from_list();
	}
	
	@And("User change asset type from list")
	public void User_change_asset_type_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Asset_Type_from_list();
	}
	
	@And("User change suplier from list")
	public void User_change_suplier_from_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Change_Suplier_from_list();
	}
	
	@And("User click delete item code button")
	public void User_click_delete_item_code_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User click asset status button menu")
	public void User_click_asset_status_button_menu() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Asset_Status_Button_Menu();
	}
	
	@And("User click add asset status button")
	public void User_click_add_asset_status_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Add_Asset_Status();
	}
	
	@And("User fill asset status name")
	public void User_fill_asset_status_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Asset_Status_Name();
	}
	
	@And("User search added asset status")
	public void User_search_added_asset_status() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Search_Added_Asset_Status();
	}
	
	@And("User view search result")
	public void User_view_search_result() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.View_Asset_Status_Search_Result();
	}
	
	@And("User click edit asset status button")
	public void User_click_edit_asset_status_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Edit_Button_AA_Category();
	}
	
	@And("User change asset status name")
	public void User_change_asset_status_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Fill_Asset_Status_Name();
	}
	
	@And("User click delete asset status button")
	public void User_click_delete_asset_status_button() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Click_Delete_Button_AB_Category();
	}
	
	@And("User back to manufacturer list")
	public void User_back_to_manufacturer_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User back to model list")
	public void User_back_to_model_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User back to suplier list")
	public void User_back_to_suplier_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User back to type list")
	public void User_back_to_type_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User back to sub type list")
	public void User_back_to_sub_type_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User back to asset status list")
	public void User_back_to_asset_status_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User back to item code list")
	public void User_back_to_item_code_list() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Redirect_to_Setup_Page();
	}
	
	@And("User search typename")
	public void User_search_typename() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Search_TypeName();
	}
	
	@And("User find typename")
	public void User_find_typename() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Find_TypeName();
	}
	
	@And("User search viar manufacturer")
	public void User_search_viar_manufacturer() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Filter_VIAR();
	}
	
	@And("User search tvs manufacturer")
	public void User_search_tvs_manufacturer() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Filter_TVS();
	}
	
	@And("User search yamaha model")
	public void User_search_yamaha_model() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Filter_Yamaha();
	}
	
	@And("User search honda model")
	public void User_search_honda_model() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Filter_Honda();
	}
	
	@And("User search suplier name")
	public void User_search_suplier_name() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
		ch.Search_Suplier_Name();
	}



	
    @After()
    public void embedScreenshot(Scenario scenario) {
    	if (scenario.isFailed()) {
    	    byte[] screenshot = ((TakesScreenshot) ch.driver).getScreenshotAs(OutputType.BYTES);
    	    scenario.embed(screenshot, "image/png");
    	    ch.force_quit_app("There is error with this test");
    	}
    }
	

	
}
