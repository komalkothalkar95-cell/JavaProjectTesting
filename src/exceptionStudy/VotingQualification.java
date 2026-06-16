package exceptionStudy;

public class VotingQualification {
    public static void main(String[] args) {
        int age=11;
        if(age<18)
        {
            throw new InvalidAgeException("your age is not valid for voting");
        }
        else
        {
            System.out.println("your age is valid for exception");
        }
    }
}
