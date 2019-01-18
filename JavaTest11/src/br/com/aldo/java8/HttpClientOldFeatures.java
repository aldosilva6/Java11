package br.com.aldo.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class HttpClientOldFeatures {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://iteratorlearning.com");
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

			try (BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()))) {
				String response = in.lines().collect(Collectors.joining());
				System.out.println(response);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
