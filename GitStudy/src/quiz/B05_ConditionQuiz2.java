package quiz;

import java.util.Scanner;

public class B05_ConditionQuiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		/*
        [ ¾Ë¸ÂÀº Á¶°Ç½ÄÀ» ¸¸µé¾îº¸¼¼¿ä ]

        1. charÇü º¯¼ö a°¡ 'q'¶Ç´Â 'Q'ÀÏ ¶§ true
        2. charÇü º¯¼ö b°¡ °ø¹éÀÌ³ª ÅÇÀÌ ¾Æ´Ò ¶§ true
        3. charÇü º¯¼ö c°¡ ¹®ÀÚ('0' ~ '9')ÀÏ ¶§ true
        4. charÇü º¯¼ö d°¡ ¿µ¹®ÀÚ(´ë¹®ÀÚ ¶Ç´Â ¼Ò¹®ÀÚ)ÀÏ ¶§ true
        
        À¯´ÏÄÚµå
        5. charÇü º¯¼ö e°¡ ÇÑ±ÛÀÏ ¶§ true
        6. charÇü º¯¼ö f°¡ ÀÏº»¾îÀÏ ¶§ true    
        7. »ç¿ëÀÚ°¡ ÀÔ·ÂÇÑ ¹®ÀÚ¿­ÀÌ exitÀÏ ¶§ true    
*/        
		
		char a = 'q';
		char b = ' ';
		char c = '4';
		char d = 'D';
		char e = 'ÇÑ';
		char f = 'e';
		
		String user_input ;
		
		System.out.println("1. " + (a == 'q' || a== 'Q')); // ¾Æ·¡ ¹øÈ£ ´Ù ºÙÀÌ±â
		System.out.println(b != ' ' && b != '\t');
		System.out.println('0' <= c && c <='9');
		System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');   // ¾ËÆÄºªÀÎ°¡? ºÙ¤· °ıÈ£
		System.out.println(e>=44032 &&  e<=55203);
		//System.out.println(e>='°¡' &&  e<='ÆR'); // 0xAC00 && 0xD7A3
		System.out.println(f >= 0x3040 && f <= 0x309F || f >= 0x30A0 && f <= 0x30FF); //°ıÈ£ ºÙÀÌ±â
		
		System.out.print("¾Æ¹« ´Ü¾î³ª ÀÔ·ÂÇØº¸¼¼¿ä >");
		user_input = sc.next();
		System.out.println(user_input.equals("exit"));

		
	}

}
