package activities;

public class MyBook extends Book {

	public static void main(String[] args) {
		MyBook newNovel = new MyBook();
		newNovel.setTitle("The Alchemist");
		System.out.println("The title is: " + newNovel.getTitle());
		
		

	}

	@Override
	public void setTitle(String s) {
		title = s;
		
		
	}

}
