package by.misterlucky.function;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HashTest {
	
	@Test
	public void hashFunctionForTheSameStringTest(){
		String line = "Some String";
		int first = Hash.hash(line);
		int second = Hash.hash(line);
		assertTrue(first==second);
	}
	
	@Test
	public void hashFunctionForDifferentValuesTest(){
		int iterations = 100;
		Set<String>values = new HashSet<>();
		Set<Integer>hashs = new HashSet<>();
		for(int i=0;i<iterations;i++){
			String line = randomLine();
			values.add(line);
			hashs.add(Hash.hash(line));
		}
		assertTrue(values.size()==hashs.size());
	}
	
	/**
	 * returns random String with characters: a..z,A..Z,0..9
	 * and length 5..15;
	 */
	private String randomLine(){
		int length = 5+(int)(Math.random()*11);
		char[]chars = new char[length];
		for(int i=0;i<length;i++)chars[i]=randomChar();
		return new String(chars);
	}
	
	/**
	 * returns random char in [a..z],[A..Z],[0..9];
	 * @return
	 */
	private char randomChar(){
		if(Math.random()>0.9)return (char)(Math.random()*11+(int)'0');
		if(Math.random()>0.5)return (char)(Math.random()*27+(int)'a');
		return (char)(Math.random()*27+(int)'A');
	}

}
