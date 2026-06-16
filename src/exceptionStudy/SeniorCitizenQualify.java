package exceptionStudy;

public class SeniorCitizenQualify {
    public static void main(String[] args) {
        int age=62;
        if(age>60)
        {
            throw new SeniorCitizenException("you are above 60 and can not work");
        }
        else {
            System.out.println("Your age is below 60 and valid for work");
        }
    }
}
