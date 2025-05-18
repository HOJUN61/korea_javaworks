package interfaces.bookshelf;

import java.util.ArrayList;

//책 제목을 저장할 선반 클래스 정의(ArrayList)
public class Shelf {
	
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<>();
	}
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
}
