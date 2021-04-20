package study;

public class B06_IF {
	
	public static void main(String[] args) {
		
		/*
		 	# if ¹®
		 	
		 		- ()¾ÈÀÇ °ªÀÌ true ÀÏ ¶§ {} ¾ÈÀÇ ³»¿ëÀ» ½ÇÇàÇÑ´Ù
		 		- ()¾ÈÀÇ °ªÀÌ false ÀÏ¶§´Â {}¾ÈÀÇ ³»¿ëÀ» ¹«½ÃÇÑ´Ù
		 		- {}¾È¿¡ µé¾î°¥ ³»¿ëÀÌ ´Ü ÇÑÁÙÀÌ¶ó¸é {}¸¦ »ý·« ÇÒ ¼ö ÀÖ´Ù
		 		
		 	# else if¹®
		 		- À§¿¡ ÀÖ´Â if¹®ÀÌ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é if¹®Ã³·³ µ¿ÀÛÇÑ´Ù
		 		- else if´Â ´Üµ¶À¸·Î »ç¿ë ÇÒ ¼ö ¾ø´Ù
		 		- else if´Â ¿©·¯ °³ »ç¿ëÇÒ ¼ö ÀÖ´Ù
		 		
		 	# else¹®
		 	 - À§¿¡ ÀÖ´Â if, else if°¡ ¸ðµÎ ½ÇÇàµÇÁö ¾Ê¾Ò´Ù¸é {}¾ÈÀÇ ³»¿ëÀ» ¹«Á¶°Ç ½ÇÇàÇÑ´Ù
		 	 - if ¹Ù·Î ´ÙÀ½¿¡ ¾µ ¼öµµ ÀÖ´Ù
		 	 - else 
		 		
		*/
		int a = 6;
		
		
		if (a == 5) {
			System.out.println("Hello!");
			System.out.println("Hello2");
			
		} else if (a == 6) {
			System.out.println("Nice to meet you!");
		} else if (a > -10) {
			System.out.println("Greeting!");
		} else if (a > -20) {
			System.out.println("Good to see you!");
		}
		
	//--------------------------------------------------------------------
		
		char  ch = 0x3050;
		
		if (ch >= '°¡' && ch <= 'ÆR') {
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±ÛÀÔ´Ï´Ù");
		}else if (ch >= 0x3040 && ch <= 0x30FF ){
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÀÏº»¾î ÀÔ´Ï´Ù");
		}else  {
			System.out.println("ch¿¡ µé¾îÀÖ´Â °ªÀº ÇÑ±ÛÀÌ ¾Æ´Õ´Ï´Ù");
		}
		
		
		System.out.println("ÇÁ·Î±×·¥ÀÌ ³¡³µ½À´Ï´Ù.");
			
	}
}

