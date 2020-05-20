package app;

public class ValidatePhoneTest {
    public static void main(String[] args) {
        String[] validPhone   = {"(84)-(0988888888)", "(84)-(0982888094)",    "(84)-(0966666666)"};
        String[] invalidPhone = {"(a4)-(0988888888)", "(85644)-(0982888094)", "(84)-(6666666666)"};
        ValidatePhone validatePhone = new ValidatePhone();

        for (String phone : validPhone) {
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Phone is " + phone +" is valid: "+ isvalid);
        }
        for (String phone : invalidPhone) {
            boolean isvalid = validatePhone.validate(phone);
            System.out.println("Phone is " + phone +" is valid: "+ isvalid);
        }
    }
}
