import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserDetails {
/*
* userDetailsVerify() method to verify details of users and return boolean output
* */
    public boolean userDetailsVerify(String [] list){
        if (list.length == 0)
        {
            return false;
        }                                                                               //Declaring regex for name, Lastname,email,password.
        String nameRegex = "^[A-Z a-z]{3}";
        String lastNameRegex = "^[A-Z]{1}[A-Z a-z]{2}";
        String emailRegex ="^(abc)[\\.]{1}[a-z,A-Z]{3}[\\@]{1}(bl)[\\.]{1}(co)[\\.][a-z]{2}$";
        String passwordRegex="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";

        Pattern namePattern= Pattern.compile(nameRegex);                            //making pattern objects of name,Lastname,email,password.
        Pattern lastNamePattern= Pattern.compile(lastNameRegex);
        Pattern emailPattern= Pattern.compile(emailRegex);
        Pattern passwordPattern= Pattern.compile(passwordRegex);


        if (namePattern.matcher(list[0]).matches() && lastNamePattern.matcher(list[1]).matches() && emailPattern.matcher(list[2]).matches() && passwordPattern.matcher(list[3]).matches())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
