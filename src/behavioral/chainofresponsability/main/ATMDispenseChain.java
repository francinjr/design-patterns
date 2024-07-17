package behavioral.chainofresponsability.main;

import java.util.Scanner;

import behavioral.chainofresponsability.Currency;
import behavioral.chainofresponsability.DispenseChain;
import behavioral.chainofresponsability.Dolar10Dispense;
import behavioral.chainofresponsability.Dolar20Dispense;
import behavioral.chainofresponsability.Dolar50Dispense;

public class ATMDispenseChain {
	private DispenseChain c1;

	public ATMDispenseChain() {
		this.c1 = new Dolar50Dispense();
		DispenseChain c2 = new Dolar20Dispense();
		DispenseChain c3 = new Dolar10Dispense();

		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenseChain = new ATMDispenseChain();
		boolean isInvalid = true;

		int amount = 0;
		Scanner sc = new Scanner(System.in);
		while (isInvalid) {
			System.out.println("Enter amount dispense: ");
			amount = sc.nextInt();

			if (amount % 10 == 0) {
				isInvalid = false;

				atmDispenseChain.c1.dispense(new Currency(amount));
				break;
			} else {
				System.out.println("Ammount should be a 10's multiple");
			}
		}
		sc.close();

	}
}
