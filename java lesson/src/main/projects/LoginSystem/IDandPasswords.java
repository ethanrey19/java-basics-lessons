package main.projects.LoginSystem;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    IDandPasswords(){

        loginInfo.put("Ethan","password");
        loginInfo.put("Bro","12345");
        loginInfo.put("ebud","abc");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
