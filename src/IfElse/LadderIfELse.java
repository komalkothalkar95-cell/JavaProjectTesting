package IfElse;

public class LadderIfELse
{
    public static void main(String[] args) {
        String username="komal";
        String password= "komal@1234";
        if (username =="komal")
        {
            System.out.println("Usrname is correct, please enter password");

            if( password =="komal@1234")
            {
                System.out.println("Passwqord is correct, login success");
            } else
            {
                System.out.println("Passwqord is incorrect, login failed");
            }}
        else
        {
            System.out.println("Username is incorrect, Try again");
        }
    }
}
