package com.example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class Shakespeare {
	
	public static void main(String[] args) throws IOException {
		
		Set<String> shakespeareWords = Files.lines(Paths.get("Files/words.shakespeare.txt"))
				.map(word -> word.toLowerCase())
				.collect(Collectors.toSet());
		
		Set<String> scrabbleWords = Files.lines(Paths.get("Files/ospd.txt"))
				.map(word -> word.toLowerCase())
				.collect(Collectors.toSet());
		
		System.out.println("# words of Shakespeare : " + shakespeareWords.size());
		System.out.println("# words of Scrabble : " + scrabbleWords.size());
		
	}
	
}
