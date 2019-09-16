package lab2_1.ex1;

public class Book {
	private String chapters[];
	private static final int DEFAULT_CHAPTERS =10;
	public Book() {
		chapters =new String [DEFAULT_CHAPTERS];
		for (int i=0; i< chapters.length; i++) {
			chapters[i]="Chapter "+i;
		}
	}
	public Book(String argument[]) {
		// construct the object with an array of chapters names
		chapters =new String [argument.length];
		for (int i=0; i< argument.length; i++) {
			chapters[i]=argument [i];
		}
		
	}
	public String getChapter(int i) {
		//return the chapter by the given index. if the index is <0 or >= to the array size, return "invaild Chapter".
		if (i<0) {
			return "Invalid Chapter.";
		}
		else if (i>= chapters.length) {
			return "Invalid Chapter.";
		}
		else {
			return chapters[i];
		}
	}
	public String[] getChapters() {
		return chapters;
	}

}
