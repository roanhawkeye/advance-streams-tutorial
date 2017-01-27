package com.example.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FlatMapExamples {

	public static void main(String[] args) throws IOException {
		
		Stream<String> stream1 = Files.lines(Paths.get("Files/TomSawyer_01.txt"));
		Stream<String> stream2 = Files.lines(Paths.get("Files/TomSawyer_02.txt"));
		Stream<String> stream3 = Files.lines(Paths.get("Files/TomSawyer_03.txt"));
		Stream<String> stream4 = Files.lines(Paths.get("Files/TomSawyer_04.txt"));
		
		System.out.println("Stream 1 : " + stream1.count());
		System.out.println("Stream 2 : " + stream2.count());
		System.out.println("Stream 3 : " + stream3.count());
		System.out.println("Stream 4 : " + stream4.count());
		
	}

}
