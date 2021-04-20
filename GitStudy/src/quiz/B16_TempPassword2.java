package quiz;

public class B16_TempPassword2 {

	public static void main(String[] args) {
		
		String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		int password_size = 6;
		
		for (int i = 0; i < password_size; ++i) {
			int random_index = (int)(Math.random() * charset.length());
			System.out.println(charset.charAt(random_index));
 			
		}
		System.out.println();
	}

}
