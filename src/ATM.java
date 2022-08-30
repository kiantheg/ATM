import java.util.*;

public class ATM {
	private HashMap<Integer, Double> accounts; 
	
	public ATM() {
		accounts = new HashMap<Integer, Double>();
	}
	
	public void openAccount (int accNum) {
		accounts.put(accNum, 0.0);
	}
	
	public void openAccount (int accNum, double iniDep) {
		accounts.put(accNum, iniDep);
	}
	
	public void closeAccount (int accNum) {
		if (accounts.get(accNum)==0.0) {
			accounts.remove(accNum);
		}
	}
	
	public double checkBalance (int accNum) {
		return accounts.get(accNum);
	}
	
	public boolean depositMoney (int accNum, double dep) {
		if (accounts.containsKey(accNum)) {
			accounts.put(accNum, accounts.get(accNum) + dep);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney (int accNum, double with) {
		if (accounts.containsKey(accNum)) {
			accounts.put(accNum, accounts.get(accNum) - with);
			return true;
		}
		return false;
	}
}
