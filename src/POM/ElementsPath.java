package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.JobsFeed;
import io.appium.java_client.MobileElement;

public class ElementsPath {
	
public int i = 0;

public String control_btn1="co.olivemedia.hihoandroidwebapp:id/control_hint";

public String main_menu1="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.ImageView";

public String main_menu2="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.view.ViewGroup/android.widget.RelativeLayout[4]/android.widget.ImageView";
public String main_menu="//android.widget.TextView[@index='3']";
public String main="//android.widget.TextView[@text='MainMenu']";

public String cancel="//android.widget.Button[@text='Cancel']";
//public String profile="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView";
public String profile="//android.widget.CheckedTextView[@text='Profile']";
//String login="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.ImageView";

public String login="android:id/button2";
/*"//android.widget.Button[@text='Login']*/
public String email="co.olivemedia.hihoandroidwebapp:id/email";

public String pass="co.olivemedia.hihoandroidwebapp:id/password";
public String sign_btn="co.olivemedia.hihoandroidwebapp:id/sign_in_button";
public String prof_title="co.olivemedia.hihoandroidwebapp:id/tv_user_profile_email_address";

public String log="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[10]/android.widget.CheckedTextView";

public String log_yes="android:id/button1";
public String refine="co.olivemedia.hihoandroidwebapp:id/bt_refine";

public String get_job="co.olivemedia.hihoandroidwebapp:id/openings_job_label";
public String signup="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]";

public String forget="co.olivemedia.hihoandroidwebapp:id/forgotten_password";
public String reset="co.olivemedia.hihoandroidwebapp:id/et_email_reset_password";
public String reset_btn="co.olivemedia.hihoandroidwebapp:id/bt_reset_password";
public String sign_in_set="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button[1]";
public String reset_til="co.olivemedia.hihoandroidwebapp:id/alertTitle";

public String reset_ok="android:id/button1";

public String sign="android:id/button1";
public String tab_app="co.olivemedia.hihoandroidwebapp:id/bt_tab_applications";
public String list_app="co.olivemedia.hihoandroidwebapp:id/rl_listview_job_applications_background";


public String close="co.olivemedia.hihoandroidwebapp:id/close_login";
//jobs Menu
public String jobsfeed="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView";

public String firstjob="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView";
public String njobs="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout["+i+"]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView";


public String applynow="co.olivemedia.hihoandroidwebapp:id/bt_job_details_view_apply_now";
public String applytil="co.olivemedia.hihoandroidwebapp:id/tv_text_application_sent";
public String label_jobs="co.olivemedia.hihoandroidwebapp:id/details_job_label";
public String app_til="co.olivemedia.hihoandroidwebapp:id/tv_title_layout_job_application";
public String recruit="co.olivemedia.hihoandroidwebapp:id/tv_job_application_recruiter_has_requested";
public String job_main_title="co.olivemedia.hihoandroidwebapp:id/tv_job_application_description";
public String back_to_job="co.olivemedia.hihoandroidwebapp:id/bt_back_to_job_search";
public String view_applic="co.olivemedia.hihoandroidwebapp:id/bt_view_your_job_application";

//application menu
public String app="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView";
public String app_title="co.olivemedia.hihoandroidwebapp:id/ints_applications_offers_title";

public String app_tab="co.olivemedia.hihoandroidwebapp:id/bt_tab_applications";
public String no_list="co.olivemedia.hihoandroidwebapp:id/no_offers_message";//if nothing
public String app_view="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.Button";
public String app_view_til="co.olivemedia.hihoandroidwebapp:id/tv_job_application_name_company";
public String add_note="co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter";
public String app_cancel="co.olivemedia.hihoandroidwebapp:id/bt_cancel_job_application";
public String appcancel_yes="android:id/button2";
public String appok="android:id/button1";
public String appclosed="co.olivemedia.hihoandroidwebapp:id/tv_job_application_when";

public String app_sent="co.olivemedia.hihoandroidwebapp:id/tv_text_application_sent";
//"co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter";
//public String view_inside="co.olivemedia.hihoandroidwebapp:id/tv_job_application_name_company";
public String app_list="co.olivemedia.hihoandroidwebapp:id/ints_job_applications_listview";
public String app_no_mes="co.olivemedia.hihoandroidwebapp:id/no_applications_message";
public String view_now="co.olivemedia.hihoandroidwebapp:id/bt_job_details_view_apply_now";
public String cancel_app="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]";
public String btn_no="android:id/button1";
public String send_app="co.olivemedia.hihoandroidwebapp:id/bt_apply_job_application";
public String int_view="co.olivemedia.hihoandroidwebapp:id/ints_job_interviews_listview";
//"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]";

//add covering note
public String cover_note="co.olivemedia.hihoandroidwebapp:id/et_job_application_information_to_the_recruiter";
public String after_view_apply="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]";

public String int_tab="co.olivemedia.hihoandroidwebapp:id/bt_tab_interviews";
public String int_tab_con="co.olivemedia.hihoandroidwebapp:id/no_interviews_message";
public String int_tab_list="co.olivemedia.hihoandroidwebapp:id/ints_job_offers_listview";

public String offer_tab="co.olivemedia.hihoandroidwebapp:id/bt_tab_offers";
public String offer_view="co.olivemedia.hihoandroidwebapp:id/no_offers_message";
public String offer_tab_list="co.olivemedia.hihoandroidwebapp:id/ints_job_offers_listview";


//Jobs Setting

public String jobsearch="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[2]/android.widget.CheckedTextView";
public String locat="co.olivemedia.hihoandroidwebapp:id/bt_tab_location";
public String postcode="co.olivemedia.hihoandroidwebapp:id/et_postcode";
public String done="co.olivemedia.hihoandroidwebapp:id/bt_refine";
public String loc_title="co.olivemedia.hihoandroidwebapp:id/search_setting_title";
public String jobs_reset="co.olivemedia.hihoandroidwebapp:id/bt_reset";

//job
public String jobtab="co.olivemedia.hihoandroidwebapp:id/bt_tab_job";//Set your search area
public String role="co.olivemedia.hihoandroidwebapp:id/button_roles";
public String role_tile="co.olivemedia.hihoandroidwebapp:id/title";
public String sel_role="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[7]/android.widget.TextView";//ARM Engineer
public String job_title="co.olivemedia.hihoandroidwebapp:id/view_job_search_role_title";//Set your job type
public String role_sel="//android.widget.TextView[@text='Qa testing role']";
public String industry="co.olivemedia.hihoandroidwebapp:id/tv_industry";
public String industry1="//android.widget.TextView[@text='Health & Social Care']";


public String role_jobs="co.olivemedia.hihoandroidwebapp:id/job_opening_description";
//pay
public String paytab="co.olivemedia.hihoandroidwebapp:id/bt_tab_pay";
public String range="co.olivemedia.hihoandroidwebapp:id/range_slider";
public String checkbox="co.olivemedia.hihoandroidwebapp:id/pay_undisclosed_checkbox";
public String pay_title="co.olivemedia.hihoandroidwebapp:id/pay_range_title";//Set your pay range

//training
public String train="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[5]/android.widget.CheckedTextView";
public String train_title="co.olivemedia.hihoandroidwebapp:id/tv_title_layout_training";
public String course="co.olivemedia.hihoandroidwebapp:id/bt_courses_by_industry";
public String unpurchase="co.olivemedia.hihoandroidwebapp:id/iv_unpurchased_course_icon";
public String my_course="co.olivemedia.hihoandroidwebapp:id/bt_my_courses";
public String course_indust="co.olivemedia.hihoandroidwebapp:id/iv_unpurchased_course_icon";
public String enroll="co.olivemedia.hihoandroidwebapp:id/bt_purchase_course";
public String thank_mes="co.olivemedia.hihoandroidwebapp:id/tv_purchase_thanks";
public String back_train="co.olivemedia.hihoandroidwebapp:id/bt_back_to_training";
public String my_course_list="co.olivemedia.hihoandroidwebapp:id/tv_title_layout_user_training_course_purchase";
public String purchase="co.olivemedia.hihoandroidwebapp:id/bt_proceed_to_payment";
public String card_num="co.olivemedia.hihoandroidwebapp:id/et_card_number";
public String card_date="co.olivemedia.hihoandroidwebapp:id/tv_pick_expire_date";
public String card_month="android:id/numberpicker_input"; 
public String card_year="//android.widget.EditText[@text='18']";
public String card_cvv="co.olivemedia.hihoandroidwebapp:id/et_cvv";
public String pay="co.olivemedia.hihoandroidwebapp:id/bt_purchase_securely";
public String price="co.olivemedia.hihoandroidwebapp:id/tv_training_specific_course_price";
public String row_course="co.olivemedia.hihoandroidwebapp:id/rl_training_specific_course";


//My training

public String my_train="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[6]/android.widget.CheckedTextView";
public String my_til="co.olivemedia.hihoandroidwebapp:id/tv_title_layout_user_training_course_purchase";
public String train_list="co.olivemedia.hihoandroidwebapp:id/rl_training_specific_course";
public String train_list_first="co.olivemedia.hihoandroidwebapp:id/tv_training_specific_course_title";
public String train_first="co.olivemedia.hihoandroidwebapp:id/tv_course_name";
//wallet
public String wallet="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[7]/android.widget.CheckedTextView";
public String wal_til="co.olivemedia.hihoandroidwebapp:id/my_wallet_documents_title";
public String tab_certy="co.olivemedia.hihoandroidwebapp:id/bt_tab_certificates";
public String add_doc="co.olivemedia.hihoandroidwebapp:id/bt_add_assets";
public String wallet_assest="//android.widget.TextView[@text='Hiup Course']";
public String cer_til="co.olivemedia.hihoandroidwebapp:id/tv_certificate_title";

public String doc="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup[1]/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[4]/android.widget.TextView";
//public String save="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]";
public String take_pic="co.olivemedia.hihoandroidwebapp:id/bt_take_photo";
public String capture="co.olivemedia.hihoandroidwebapp:id/picture";
public String save="co.olivemedia.hihoandroidwebapp:id/bt_upload_photo_save";
public String cert_title="co.olivemedia.hihoandroidwebapp:id/tv_certificate_title";


//settings
public String setting="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]/android.widget.CheckedTextView";
public String set_tile="co.olivemedia.hihoandroidwebapp:id/tv_title_layout_settings";
public String region="co.olivemedia.hihoandroidwebapp:id/bt_region_selection";
public String region_name="co.olivemedia.hihoandroidwebapp:id/region_entry";
public String region_sel="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[3]";
public String change_reg="co.olivemedia.hihoandroidwebapp:id/submit_button";
public String signout="co.olivemedia.hihoandroidwebapp:id/bt_sign_out";
public String yesout="android:id/button1";
public String region_menu="//android.widget.TextView[@text='US']";
}

