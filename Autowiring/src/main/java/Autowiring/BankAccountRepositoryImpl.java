package Autowiring;

public abstract class BankAccountRepositoryImpl implements BankAccountRepository  {
	private void BankAccountRepositoryImpl(){
		  BankAccount bankaccount = new BankAccount();
		  bankaccount.setAccountHolderName("Pratham");
		  bankaccount.setAccountId(22);
		  bankaccount.setAccountType("Savings");
		  bankaccount.setAccountBalance((long) 21337.44);
	}

}
