package Week_1;

public class WordFactory extends DocumentFactory {
	
	@Override
	public Document createDocument() {
		return new WordDocument();
	}
}