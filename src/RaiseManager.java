
public class RaiseManager implements Raise{

	@Override
	public void raise(Product product) {
		double raiseRatio;
		
		raiseRatio= (product.getProductPrice()*0.5)+product.getProductPrice();
		System.out.println("Artan fiyat : "+ raiseRatio);
		
	}

}
