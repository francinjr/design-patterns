package behavioral.chainofresponsability;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);
	
	void dispense(Currency cur);
}
