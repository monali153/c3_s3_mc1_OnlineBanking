public class SavingsAccountImpl {

    public static void main(String[] args) {

        SavingsAccount object = new SavingsAccount();

        object.setAccountHolderName("Monali Sharma");
        object.setAccountNumber(123456789012L);
        object.setAccountOpeningDate("15 March 2019");
        object.setAccountStatus("Active");
        object.setAvailableBalance(50000);
        object.setTotalBalance(50000);
        object.setEnableInternetAndMobileBanking(true);
        object.setInterestRate(6);
        object.setModeOfOperation("Self-operated");

        object.displayAccountDetails();

        System.out.println("\nRetrieve Balance = " + object.retrieveBalance());
        System.out.println("Balance After Debit Amount = " + object.debitAmount(1000));
        System.out.println("Balance After Credit Amount = " + object.creditAmount(4000));

        System.out.println("\nAvailable Balance After Transaction = " + object.getAvailableBalance());
        System.out.println("Total Balance After Transaction = " + object.getTotalBalance());
    }
}
