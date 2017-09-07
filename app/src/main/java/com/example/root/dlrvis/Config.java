package com.example.root.dlrvis;

public class Config {
    //URLs to register.php and confirm.php file
    public static final String REGISTER_URL = "http://192.168.43.22/androidotp/register.php";
    public static final String CONFIRM_URL = "http://192.168.43.22/androidotp/confirm.php";

    //Keys to send username, password, phone and otp
    public static final String KEY_USERNAME = "username";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_PHONE = "phone";
    public static final String KEY_OTP = "otp";

    //JSON Tag from response from server
    public static final String TAG_RESPONSE= "ErrorMessage";
}