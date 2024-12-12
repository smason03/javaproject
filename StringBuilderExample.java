public class StringBuilderExample {
	public static void main(String[] args){
		howManyObjectsSB();
	}
	
	public static void howManyObjectsSB(){
		StringBuilder sb = new StringBuilder("The ");
		sb.append("quick ");
		System.out.println(sb);
		sb.append("brown fox");
		System.out.println(sb);
	}
}