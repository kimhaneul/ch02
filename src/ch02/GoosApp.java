package ch02;

public class GoosApp {
	public static void main(String[] args) {
		
		Goods camera = new Goods();

		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		String k = camera.toString();
		
//		System.out.println(camera.countOfGoods);
//		System.out.println(k);
//		

		Goods camera1 = new Goods("cannon", 500000, 10, 60);
		
		camera1.showInfo();
		
	}
}
