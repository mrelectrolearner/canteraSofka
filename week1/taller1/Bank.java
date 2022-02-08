package taller1;

import java.util.ArrayList;

/**
 * Represents a bank and its basic operations.
 * @author Luis Felipe Rivas.
 *
 */
public class Bank {

	/**
	 * Represents the list of employees.
	 */
	private ArrayList<Person> employees;
	/**
	 * Represents the list of clients.
	 */
	protected ArrayList<String> clients;
	/**
	 * Represent the Bank accounts list of the clients.
	 */
	private ArrayList<BankAccount> bankAccounts;
	/**
	 * Represent the list of the products.
	 */
	public ArrayList<String>  products;
	/**
	 * Represent the bank's money.
	 */
	private float bankEarnings;
	/**
	 * Create an instance of the bank class with a basic bank's earing of $100000.
	 * @param employees  bank employees list.
	 * @param clients bank clients list.
	 */
	
	public Bank(ArrayList<Person> employees, ArrayList<String> clients) {
		this.employees = employees;
		this.clients = clients;
		this.bankAccounts=new ArrayList<>();
		this.bankEarnings=100000;
		this.products=new ArrayList<>();
	}

	/**
	 * Look for a client's  savings account. If the account don't exit, its create. 
	 * @param accountOwnerId the identifier of the bank client.
	 * @param accountNumber the savings bank account number.
	 * @return the client's bank account.
	 */
	private BankAccount getClientBankAccount(String accountOwnerId,int accountNumber) {
		BankAccount account=new BankAccount(accountOwnerId, "savings account", accountNumber);
		if(!this.bankAccounts.contains(account)) 
			this.bankAccounts.add(account);
		return account;
	}
	/**
	 * Create a bank account and add it to the bank's accounts list.
	 * @param accountOwnerId the identifier of the bank account owner.
	 * @param accountType the type of the bank account.
	 * @param accountNumber bank account's number.
	 */
	protected void createBankAccount(String accountOwnerId, String accountType, int accountNumber) {
		BankAccount account=new BankAccount(accountOwnerId, accountType, accountNumber);
		this.bankAccounts.add(account);	
	}
	/**
	 * Delete a bank account.
	 * @param account the bank account to be deleted.
	 */
	
	protected void deleteBankAccount(BankAccount account) {
		this.bankAccounts.remove(account);	
	}
	/**
	 * Add a new client to the bank's clients list
	 * @param client the client to be added to the list
	 */
	
	protected void addClient(String client) {
		this.clients.add(client);	
	}
	/**
	 * Lends money to client from the bank's earing.
	 * @param client the client that ask for the loan.
	 * @param accountNumber the saving bank account where the loan is deposited.
	 * @param moneyAmount the money amount to be deposited.
	 */
	protected void lendMoney(String client,int accountNumber,float moneyAmount) {
		BankAccount account=getClientBankAccount(client,accountNumber);
		this.bankEarnings-=moneyAmount;
		account.setAccountBalance(account.getAccountBalance()+moneyAmount);
	}
	/**
	 * The bank collect the borrowed money and add to its earing. 
	 * @param client the client that ask for the loan.
	 * @param accountNumber the saving account's number of the client.
	 * @param moneyAmount the money amount to be collect.
	 */
	protected void collectMoney(String client,int accountNumber,float moneyAmount) {
		BankAccount account=getClientBankAccount(client, accountNumber);
		if(account.getAccountBalance()>=moneyAmount ) {
			account.setAccountBalance(account.getAccountBalance()-moneyAmount);
			this.bankEarnings+=moneyAmount;
		}
		else {
			System.out.println("Insufficient funds, communicate with the client");
		}
		
	}
	/**
	 * Get the employees.
	 * @return the list of bank's employees
	 */

	public ArrayList<Person> getEmployees() {
		return employees;
	}
	/**
	 * Set the employees.
	 * @param employees the list of bank's employees to be set.
	 */

	public void setEmployees(ArrayList<Person> employees) {
		this.employees = employees;
	}
	/**
	 * Get the clients.
	 * @return the list of bank's clients.
	 */

	public ArrayList<String> getClients() {
		return clients;
	}
	/**
	 * Set the clients.
	 * @param clients the list of bank's clients to be set.
	 */
	public void setClients(ArrayList<String> clients) {
		this.clients = clients;
	}
	/**
	 * Get the bank's accounts.
	 * @return the list of bank's account
	 */

	public ArrayList<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
	/**
	 * Set the bank's account list.
	 * @param bankAccounts the list of bank's account.
	 */
	public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	/**
	 * Get the bank's products. 
	 * @return bank's products.
	 */

	public ArrayList<String> getProducts() {
		return products;
	}
	/**
	 * Set the bank's products.
	 * @param products bank's products to be set.
	 */
	public void setProducts(ArrayList<String> products) {
		this.products = products;
	}
	/**
	 * Get the bank's earing.
	 * @return bank's earing.
	 */
	public float getBankEarnings() {
		return bankEarnings;
	}
	/**
	 * Set the bank's earing.
	 * @param bankEarnings bank's earing to be set.
	 */

	public void setBankEarnings(float bankEarnings) {
		this.bankEarnings = bankEarnings;
	}
	

}
