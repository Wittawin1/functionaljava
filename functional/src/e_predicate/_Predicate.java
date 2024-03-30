package e_predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println("Is phone number valid and contains number 3 = " +
        isPhoneNumberValidPredicate.and(containNumber3).test("09009877300")
        );

        System.out.println("Is phone number valid and contains number 3 = " +
                isPhoneNumberValidPredicate.and(containNumber3).test("07009877300")
        );
    }
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phonenumber ->
            phonenumber.startsWith("07") && phonenumber.length() == 11;

    static Predicate<String> containNumber3 = phonenumber3 ->
            phonenumber3.contains("3");
}
