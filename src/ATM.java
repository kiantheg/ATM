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
		if (accounts.containsKey(accNum)&&accounts.get(accNum)==0.0) {
			accounts.remove(accNum);
		}
	}
	
	public double checkBalance (int accNum) {
		if (accounts.containsKey(accNum)) {
			return Math.round((100*accounts.get(accNum)))/100.0;
		}
		return 0.0;
	}
	
	public boolean depositMoney (int accNum, double dep) {
		if (accounts.containsKey(accNum)&&dep>=0) {
			accounts.put(accNum, accounts.get(accNum) + dep);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney (int accNum, double with) {
		if (accounts.containsKey(accNum)&&with<=checkBalance(accNum)&&with>=0) {
			accounts.put(accNum, accounts.get(accNum) - with);
			return true;
		}
		return false;
	}
}
