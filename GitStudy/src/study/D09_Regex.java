package study;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
	 		# Á¤±ÔÇ¥Çö½Ä (Regular Expression)
	 		
	 			- ¹®ÀÚ¿­ÀÇ ÆĞÅÏÀ» Ç¥ÇöÇÏ´Â Ç¥Çö½Ä
	 			- Æ¯Á¤ ÇÁ·Î±×·¡¹Ö ¾ğ¾î¿¡ Á¾¼ÓµÇÁö ¾Ê´Â´Ù
	 			- ÇÁ·Î±×·¡¸Ó°¡ ¿øÇÏ´Â ¹®ÀÚ¿­ ÆĞÅÏ°ú ÀÏÄ¡ÇÏ´ÂÁö °Ë»çÇÒ¶§ »ç¿ëÇÑ´Ù
	 			
	 		# Pattern Å¬·¡½º
	 			
	 			- Á¤±ÔÇ¥Çö½ÄÀ» ´Ù·ç´Â Å¬·¡½º
	 			
	 		# Matcher Å¬·¡½º
	 		
	 			- ÆĞÅÏ ÀÎ½ºÅÏ½º¸¦ ÀÌ¿ëÇÏ¿© ¹®ÀÚ¿­À» °Ë»çÇÒ ¶§ »ç¿ëÇÏ´Â Å¬·¡½º
	 			
	 */
	public static void main(String[] args) {
		
		// Patten.matchs(regex, input) : inputÀÌ regex¿¡ ¸ÅÄ¡µÇ´Â ¹®ÀÚ¿­ÀÎÁö¸¦ °Ë»çÇØÁÖ´Â ¸Ş¼­µå
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : ÇØ´ç À§Ä¡ÀÇ ÇÑ ±ÛÀÚ¿¡ ¾î¶² ¹®ÀÚµéÀÌ ¿Ã ¼ö ÀÖ´ÂÁö Á¤ÀÇÇÏ´Â Ç¥Çö½Ä
		System.out.println(Pattern.matches("s[lh@]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh@]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh@]eep", "s@eep"));
		System.out.println(Pattern.matches("s[lh@]eep", "speep")); // ÀÌ°Ç ¾ÈµÊ
		
		
		
		/*
		  		[] ³»ºÎ¿¡ Á¤ÀÇÇÒ ¼ö ÀÖ´Â °Íµé
		  		
		  		1. abc 	: ÇØ´ç ÀÚ¸®¿¡ a ¶Ç´Â b ¶Ç´Â c¸¦ Çã¿ë
		  		2. ^abc	: ÇØ´ç ÀÚ¸®¿¡ abc¸¦ Á¦¿ÜÇÑ ¸ğµç°ÍÀ» Çã¿ë 
		  		3. a-z	: a ºÎÅÍ z±îÁö ¸ğµÎ Çã¿ë
		  		4. &&	: ±³ÁıÇÕ
		 */
		// 2¹ø
		System.out.println(Pattern.matches("s[^lh@]eep", "s2eep"));
		
		// 3¹ø
		System.out.println(Pattern.matches("s[1-9]eep", "s4eep"));
		System.out.println(Pattern.matches("s[1-9a-z]eep", "sleep"));
		
		// ±³ÁıÇÕ
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sceep"));
		System.out.println(Pattern.matches("s[a-d&&c-f]eep", "sfeep")); //¾ÈµÊ
		
		
		System.out.println("=-----------------------------------");
		/*
		 		¿©·¯ ¹®ÀÚ¸¦ ³ªÅ¸³»´Â °Íµé
		 		
		 		1. . 	: ¸ğµç ¹®ÀÚ		¡Ø [] ¹Û¿¡ ½á¾ß ¸ğµç ¹®ÀÚ
		 		2. \d	: ¸ğµç ¼ıÀÚ
		 		3. \D : ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¸ğµç °Í
		 		4. \s	: ¸ğµç °ø¹é (\t, \n, . .  µîÀÇ ¸ğµç °ø¹éµé)
		 		5. \S	: °ø¹éÀ» Á¦¿ÜÇÑ ¸ğµç °Í (°ø¹éÀÌ ¿À¸é ¾ÈµÊ)
		 		6. \w	: ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Çã¿ë [a-zA-z0-9_]
		 		7. \W: ÀÏ¹İÀûÀÎ ¹®ÀÚµéÀ» Á¦¿ÜÇÑ ¸ğµç °ÍÀ» Çã¿ë
		 */		
		System.out.println(Pattern.matches("s.eep", "sheep"));		//¸ğµç ¹®ÀÚ
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));		// . ¸¸ Çã¿ë
		System.out.println(Pattern.matches("s\\.eep", "sheep"));		// . ¸¸ Çã¿ë 			ÀÌ°Å ¹¹ÀÓ?
		
		// 2¹ø
		System.out.println(Pattern.matches("s\\deep", "s9eep"));		
		
		// 3¹ø
		System.out.println(Pattern.matches("\\D\\D\\D", "cat"));		
		
		// 4¹ø
		System.out.println(Pattern.matches("s\\seep", "s eep"));		
		System.out.println(Pattern.matches("s\\seep", "saeep"));		// °ø¹éÀÌ ¾Æ´Ô
		System.out.println(Pattern.matches("s\\seep", "s\teep"));		
		System.out.println(Pattern.matches("s\\seep", "s\reep"));		
		System.out.println(Pattern.matches("s\\seep", "s\neep"));		
		
		// 5¹ø
		System.out.println(Pattern.matches("s\\Seep", "sdeep"));		
		
		/*
		 		ÇØ´ç ÆĞÅÏÀÌ Àû¿ëµÉ ¹®ÀÚÀÇ °³¼ö¸¦ Á¤ÀÇÇÏ´Â ¹æ¹ı
		 		
		 			1. [ex]{n}	: {}¾ÕÀÇ ÆĞÅÏÀÌ n°³ ÀÏÄ¡ÇØ¾ß ÇÑ´Ù 
		 			2. [ex]{n, m} : {} ¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ ÀÌ»ó, ÃÖ´ë m°³(mÆ÷ÇÔ) ÀÏÄ¡ÇØ¾ß ÇÑ´Ù
		 				¡Ø Á¤±ÔÇ¥Çö½Ä¿¡ {n, m}Ã³·³ °ø¹éÀ» ³ÖÀ¸¸é ¾ÈµÈ´Ù
		 			3. [ex]{n,} : {} ¾ÕÀÇ ÆĞÅÏÀÌ ÃÖ¼Ò n°³ ÀÌ»ó ÀÏÄ¡ÇØ¾ßÇÑ´Ù
		 			4. [ex]?	: 0¹ø ¶Ç´Â ÇÑ¹ø
		 			5. [ex]+	: ÃÖ¼Ò ÇÑ¹ø ÀÌ»ó
		 			6. [ex]* : 0¹ø ¶Ç´Â ¿©·¯¹ø
		 */
		// 1¹ø
		System.out.println(Pattern.matches("[\\D3-5]{5}\\.txt", "d!35t.txt"));		

		// 2¹ø
		System.out.println(Pattern.matches("[\\D3-5]{3,5}\\.txt", "d!4.txt"));		
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "ÇÏÀÌ.txt"));		
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "¾È³çÇÏ.txt"));		
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "hi.txt"));		
		System.out.println(Pattern.matches("[°¡-ÆR]{2,}\\.txt", "¾È.txt"));		
		
		// 3¹ø
		String regex1 = String.format(".{2,}\\.txt",2);
		System.out.println(Pattern.matches(regex1, "asda.txt"));		
		
		//4¹ø
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", ".txt"));		
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "¾È.txt"));		
		System.out.println(Pattern.matches("[°¡-ÆR]?\\.txt", "ÇÑ±Û.txt"));		
		
		// ÀüÈ­¹øÈ£ Á¤±ÔÇ¥Çö½Ä
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-\\d{4}", "010-303-5151"));		
		System.out.println(Pattern.matches("\\d{3}-?\\d{3,4}-\\d{4}", "010-3043-5151"));		
		System.out.println(Pattern.matches("0\\d{2}-?\\d{3,4}-\\d{4}", "010-3043-5151"));		
		
		// ¹ÎÁõ Á¤±ÔÇ¥Çö½Ä
		System.out.println(Pattern.matches("\\d{6}-?\\d{7}", "011510-3215014"));		
		
		// ¿¬½À¹®Á¦ : ÀÚ¹Ù¿¡¼­ Çã¿ëÇÏ´Â º¯¼ö¸íÀ» °Ë»çÇÒ ¼ö ÀÖ´Â Á¤±ÔÇ¥Çö½ÄÀ» ¸¸µé¾îº¸¼¼¿ä
		
		System.out.println(Pattern.matches("[^0-9][\\w°¡-ÆR$]*", "_¹Ú½º1"));
		
		
		System.out.println(Pattern.matches("^[a-zA-Z_$][\\w°¡-ÆR$]*", "_¹Ú½º1"));
		System.out.println(Pattern.matches("^[\\D&&\\S&&\\w&°¡-ÆR][\\w$°¡-ÆR]*$", "_±è"));
		System.out.println(Pattern.matches("^[\\D&&\\S&&\\w&°¡-ÆR][\\w$°¡-ÆR]*a$", "_±èa"));
		
		/*
		   		#Pattern.compile(regex)
		   		
		   			- Àü´ŞÇÑ Á¤±ÔÇ¥Çö½ÄÀ» ÇØ¼®ÇÏ¿© Pattern ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ°í ¹İÈ¯ÇÑ´Ù
		   			
		   		# split() : ÄÄÆÄÀÏµÈ ÆĞÅÏ ÀÎ½ºÅÏ½º·Î ¹®ÀÚ¿­ split()À» ÁøÇàÇÑ´Ù
		   		
		   		# matcher() : Matcher ÀÎ½ºÅÏ½º¸¦ »ı¼ºÇÏ¿© ¹İÈ¯ÇÑ´Ù
		 */
		String fruits_text = "apple/banana/orange/grape/pineapple/peach/mango/redapple";
		
		Pattern regex = Pattern.compile("/");
		
		String[] fruits = regex.split(fruits_text);
		
		System.out.println(Arrays.toString(fruits));
		
		Pattern regex2 = Pattern.compile("[a-zA-Z]+");
		
		Matcher matcher = regex2.matcher(fruits_text);
		
		while(matcher.find()) {
			System.out.println("Ã£Àº °Í : " + matcher.group());
			System.out.println("À§Ä¡ : " + matcher.start() + "ºÎÅÍ" +matcher.end() + "±îÁö");
		}
	}
}











