public class Main {
    public static void main(String[] args) {

        BankAccount account = BankAccount.builder(1234L)
                .withOwner("Jan")
                .atBranch("SpringField")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        BankAccount anotherAccount = BankAccount.builder(1235L)
                .withOwner("Tom")
                .atBranch("District")
                .openingBalance(200)
                .atRate(2.0)
                .build();

        System.out.println(account);
        System.out.println(anotherAccount);
    }
}

