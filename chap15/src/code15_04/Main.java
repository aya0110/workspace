package code15_04;

public class Main {
//	StringBuilder sb = new StringBuilder();{
//
//	for(int i = 0 ; i<10000 ; i++) {
//		sb.append("Java");
//	}
//	String s = sb.toString();
//}

public static void main(String[]args)	{

//	StringBuilder sb = new StringBuilder();
//	sb.append("Hello");
//	sb.append("New");
//

	String s = "Java";
	s.matches("Java");
	s.matches("JavaJava");//false
	s.matches("java");//false

	"Java".matches("J.va");
	"Jaaaaava".matches("JA*va");
	
}

}

