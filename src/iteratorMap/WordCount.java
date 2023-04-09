package iteratorMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		System.out.println("영어 문장을 입력하세요");
		line = sc.nextLine();	//공백 포함요소
		
		HashMap<String, Integer>map = new HashMap<>();
		String []arr = line.split(" ");
		for (String word: arr) {
			Integer n = map.get(word);
			if( n != null) {
				n = n+1;
			}else {
				n = 1;
			}
			map.put(word, n);
		}
			
			Iterator<String> iter = map.keySet().iterator();
			while(iter.hasNext()) {
				String word1 = iter.next();
				int cnt = map.get(word1);
				System.out.println(word1 +"==>"+cnt );
				
			
		}
		
		
	}

}
