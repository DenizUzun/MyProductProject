
public class DiscountManager implements Discount{

	@Override
	public void discount(Product product) {
		
		double discountRatio;
		
		discountRatio= product.getProductPrice()-(product.getProductPrice()*0.5);
		System.out.println("Azalan fiyat : "+ discountRatio);
		
	}
	

}
