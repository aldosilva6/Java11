package br.com.aldo.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


public class HttClientNewFeatures {

	public static void main(String[] args) {
		var httpClient = HttpClient.newBuilder().followRedirects(Redirect.ALWAYS).build();
		var request = HttpRequest.newBuilder(URI.create("http://iteratorlearning.com")).build();

		HttpResponse<String> response;
		
		try {
//			httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//			.thenApply(HttpResponse::body)
//			.thenAccept(System.out::println);
//			
			response = httpClient.send(request, BodyHandlers.ofString());
			System.out.println("Printing Body : " + response.body().strip());
			
			System.out.println("Headers : "+ response.headers());
			
			/*httpClient.sendAsync(request, ttpResponse.BodyHandlers.ofString())
			.thenApply(HttpResponse::body)
			.thenAccept(System.out::println);*/
			
			System.out.println("Status Code : " + response.statusCode());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
