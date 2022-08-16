public class SavingsAccount {

    private String accountHolderName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private boolean isEnableInternetAndMobileBanking;
    private float interestRate;
    private String modeOfOperation;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;

    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getTotalBalance() {
        return availableBalance;
    }

    public void setTotalBalance(double availableBalance) {
        totalBalance = availableBalance;
    }

    public boolean isEnableInternetAndMobileBanking() {
        return isEnableInternetAndMobileBanking;
    }

    public void setEnableInternetAndMobileBanking(boolean isEnableInternetAndMobileBanking) {
        this.isEnableInternetAndMobileBanking = isEnableInternetAndMobileBanking;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public double retrieveBalance() {
        return getAvailableBalance();
    }

    public double debitAmount(double debitCash) {
        availableBalance = availableBalance - debitCash;
        return availableBalance;
    }

    public double creditAmount(double creditCash) {
        availableBalance = availableBalance + creditCash;
        return availableBalance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder Name = " + accountHolderName);
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Opening Date = " + accountOpeningDate);
        System.out.println("Account Status = " + accountStatus);
        System.out.println("Available Balance = " + availableBalance);
        System.out.println("Total Balance = " + totalBalance);
        System.out.println("Enable Internet And Mobile Banking = " + isEnableInternetAndMobileBanking);
        System.out.println("Interest Rate = " + interestRate);
        System.out.println("Mode Of Operation = " + modeOfOperation);
    }
}
