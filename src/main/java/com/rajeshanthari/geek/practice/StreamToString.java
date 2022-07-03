package com.rajeshanthari.geek.practice;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class StreamToString {

	public static void main(String[] args) throws IOException {
		try (InputStream iStream = new ByteArrayInputStream("RajeshAnthari".getBytes(StandardCharsets.UTF_8))) {
			byte[] allBytes = iStream.readAllBytes();
			System.out.println(new String(allBytes));
		}
	}

}
