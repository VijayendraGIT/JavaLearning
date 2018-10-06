package class2;

public class Book {
	//Class properties
	int chapters;
	int pages;
	
	public void setBookProperties(int chapters, int pages){
		this.chapters = chapters;
		this.pages = pages;
	}

	public static void main(String[] args) {
// Object => new Book(); 
// Object refrence => englishBook, hindiBook
		
		new Book();
		
		Book englishBook = new Book();
		englishBook.setBookProperties(10, 20);
		//englishBook.chapters = 10;
		//englishBook.pages = 200;
		
		Book hindiBook	= new Book();
		hindiBook.chapters = 12;
		hindiBook.pages =250;
		
		System.out.println("English Book Cotains :chapters ="+englishBook.chapters);
		

	}

}
