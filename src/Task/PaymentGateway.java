package Task;

abstract class Payment{
	public void status() {
		System.out.println("=====Payment Processing===========");
	}
	abstract void paymentMethod(double amount);
}

class UPI extends Payment{

	@Override
	void paymentMethod(double amount) {
		System.out.println("Method is UPI:"+amount);
		
	}
	
}
class CreditCard extends Payment{

	@Override
	void paymentMethod(double amount) {
		System.out.println("Credit Card Payment:"+amount);
		
	}
	
}
class NetBanking extends Payment{

	@Override
	void paymentMethod(double amount) {
		System.out.println("NetBanking.."+amount);
		
	}
	
}
public class PaymentGateway {

	public static void main(String[] args) {
		UPI u=new UPI();
		
		CreditCard c=new CreditCard();
		
		NetBanking n=new NetBanking();
		n.status();
		u.paymentMethod(2000);
		c.paymentMethod(3000);
		n.paymentMethod(10000);
		
		

	}

}
