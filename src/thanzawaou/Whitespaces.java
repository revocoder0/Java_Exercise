package thanzawaou;

public class Whitespaces {

	public static void main(String[] args) {
		String sentence="O nce upona   time th  ere was a     Ki  ng.";
		System.out.println("Original Sentence : "+sentence);
		
		sentence=sentence.replaceAll("\\s", "");
		System.out.println("After Sentence : "+sentence);

	}

}
