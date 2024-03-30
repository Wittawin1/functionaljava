package d_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer{
    public static void main(String[] args) {
        //Normal JAVA Function
        Customer maria =new Customer("Maria","0656599899");
        greetCustomer(maria);

        //Consumer functional interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria,false);
        greetCustomer(maria);
        greetCustomerV2(maria,false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello" + customer.customername +
                    ", thank for registering phone number"
                    + customer.customerPhoneNumber);

    static BiConsumer<Customer,Boolean> greetCustomerConsumerV2 = (customer , showPhoneNumber)->
            System.out.println("Hello" + customer.customername +
                    ", thank for registering phone number"
                    + (showPhoneNumber ? customer.customerPhoneNumber : "*************"));
    static void greetCustomer(Customer customer){
        System.out.println("Hello" + customer.customername +
                ", thank for registering phone number"
                + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer,boolean showPhoneNumber){
        System.out.println("Hello" + customer.customername +
                ", thank for registering phone number"
                + (showPhoneNumber ? customer.customerPhoneNumber : "*************"));
    }
    static class Customer{
        private final String customername;
        private final String customerPhoneNumber;

        public Customer(String customername, String customerPhoneNumber) {
            this.customername = customername;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}