package capriotti.anthony.BankAccount;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.Scanner;

import static capriotti.anthony.BankAccount.AccountStatus.HOLD;

/**
 * Created by anthonycapriotti on 1/17/17.
 */

public class CreateAccount {

    private AccountType accountType;
    private AccountStatus accountStatus;
    private OverdraftType overDraftProtection;
    private double balance;
    private String accountName;
    private int accountNumber;
    private double interestRate;

    CreateAccount(AccountType accountType, int accountNumber, String accountName){
        this.accountType = accountType;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        double interestRate = 99.0;
    }

    public void deposit(double deposit){
        if(accountStatus.equals(HOLD)){
            System.out.println("Hold on account");
        }else {
            balance += deposit;
        }
    }

    public void withdraw (double withdraw){
        if(balance == 0){
            System.out.println("Insuffiecint funds");
        }else if (accountStatus.equals(HOLD)){
            System.out.println("Hold on account/Hold must be removed");
        }else {
            balance -= withdraw;
        }
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public AccountStatus getAccountStatus() {
        return accountStatus;
    }

    public OverdraftType getOverDraftProtection() {
        return overDraftProtection;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void setAccountStatus(AccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    public void setOverDraftProtection(OverdraftType overDraftProtection) {
        this.overDraftProtection = overDraftProtection;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
