package ExceptionHandling;

public class ThrowKeyword {

	//https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/ -refer this
	public static void getData() { // if u write throws exception here u have to hav catch in main which is bad
		String data = null;
		if (data == null) { // data is primitive DT ..so va cn use ==

			System.out.println("data is null...");
			try {
			throw new Exception("data is not found exception");
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public static void main(String[] args) {
		getData();

	}

}
