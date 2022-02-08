package taller1;
/**
 * Represent a bank account and some of its basics operations.
 * @author Luis Felipe Rivas 
 *
 */

public class BankAccount {
	/**
	 * Represent the identifier of a bank account owner.
	 */
	private String accountOwnerId;
	/**
	 * Represent the bank account's number.
	 */
	private int accountNumber;
	/**
	 * Represent the state of the bank account.
	 */
	protected boolean activated;
	/**
	 * Represent the bank account's balance.
	 */
	private float accountBalance;
	/**
	 * Represent the bank account's type.
	 */
	protected String accountType;
	
	
	/**
	 * Instance a bank account with a balance in $ 0 and the account activated.
	 * @param accountOwnerId identifier of a bank account owner.
	 * @param accountType bank account's type.
	 * @param accountNumber bank account's number.
	 */
	
	public BankAccount(String accountOwnerId, String accountType,int accountNumber) {
		this.accountOwnerId = accountOwnerId;
		this.accountType = accountType;
		this.activated=true;
		this.accountBalance=0;
		this.accountNumber=accountNumber;
	}
	/**
	 * Get the bank account owner's identifier
	 * @return the acount owner's identifier 
	 */

	public String getAccountOwnerId() {
		return accountOwnerId;
	}
	/**
	 * Set the bank account owner's identifier.
	 * @param accountOwnerId the bank account owner's identifier to be set.
	 */

	public void setAccountOwnerId(String accountOwner) {
		this.accountOwnerId = accountOwner;
	}
	/**
	 * Get the bank account number.
	 * @return the bank account number.
	 */

	public int getAccountNumber() {
		return this.accountNumber;
	}
	/**
	 * Set the bank account number,
	 * @param accountNumber the bank account number to be set.
	 */

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * Get the state of the account.
	 * @return the state of the account.
	 */
	public boolean getActivated(){
		return this.activated;		
	}
	/**
	 * Set the state of the account.
	 * @param activated the account's state to be set.
	 */
	public void setActivated(boolean activated) {
		this.activated=activated;
	}
	/**
	 * Get the bank account's balance.
	 * @return the  bank account's balance.
	 */

	protected float getAccountBalance() {
		return this.accountBalance;
	}
	/**
	 * Set the bank account's balance,
	 * @param accountBalance the bank account's balance to be set.
	 */

	protected void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	/**
	 * Get the bank account's type.
	 * @return the bank account type.
	 */

	public String getAccountType() {
		return this.accountType;
	}
	/**
	 * Set the bank account's type.
	 * @param accountType the bank account's type to be set.
	 */

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * Make a deposit in the bank account.
	 * @param amount the money's amount to be deposit.
	 */
	
	protected void depositMoney(float amount) {
		this.accountBalance+=amount;
	}
	/**
	 * Withdraw money for the bank account.
	 * @param amount the money's amount to be withdraw.
	 */
	
	protected void withdrawMoney(float amount) {
		this.accountBalance-=amount;
	}
	
}
