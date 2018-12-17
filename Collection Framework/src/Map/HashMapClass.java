package Map;
import java.util.*;
public class HashMapClass {
//Map is: Key and Values
// HasMap - fast, unsynchronized, work with single thread, allows one null key
//HashTable-slow,synchronized, works with multiple thread, does not allow null key
//LinkedHashMap-preserves the insertion order
	public static void main(String[] args) {
	
//	Map map= new HashMap();
	Map<String,String> mapSample=new HashMap<>();
	mapSample.put("myName","Mike");
	mapSample.put("myAge","25");
	mapSample.put("myJob","SDET");
	mapSample.put("x","y");

	System.out.println(mapSample);
	System.out.println(mapSample.get("myName"));
	System.out.println(mapSample.get("myName2"));
	
	Set<String> keys=mapSample.keySet();
	
//	for(i of array) {
//		//degerini veriyor
//	}
//	for(i in array) {
//		//index number ini veriyor
//	}
	
	for(String i:keys) {
		System.out.println(i+": "+mapSample.get(i));
	}
	}

}
