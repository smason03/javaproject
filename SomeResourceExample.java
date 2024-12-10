public class SomeResourceExample {
	public static void main(String[] args){
		try (SomeResource resource = new SomeResource()) {
			resource.doSomething();
		}
	}
}

class SomeResource implements AutoCloseable {
	public void doSomething(){
		System.out.println("Doing Something . . . ");
	}
	
	@Override
	public void close() {
		System.out.println("SomeResource Closed.");
	}
}