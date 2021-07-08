
public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setProductPrice(100.0);

		RaiseManager raiseManager = new RaiseManager();
		raiseManager.raise(product1);

		DiscountManager discountManager = new DiscountManager();
		discountManager.discount(product1);

	}

}
