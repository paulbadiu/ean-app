package main.api.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class BaseService {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected final String minorRev = "30";
	protected final String generalEndpoint = "api.ean.com";
	protected final String secureEdnpoint = "book.api.ean.com";
	protected final String cid = "489898";
	protected final String apiKey = "709q2nn7n46abem6mgaghs7tpd";
	protected final String sharedSecret = "33q5eovhe0psk";

	public static String generateSig(String apiKey, String sharedSecret) {
        if (sharedSecret == null) {
            return null;
        }
        String sig = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            long timeInSeconds = (System.currentTimeMillis() / 1000);
            String input = apiKey + sharedSecret + timeInSeconds;
            md.update(input.getBytes());
            sig = String.format("%032x", new BigInteger(1, md.digest()));
        } catch (NoSuchAlgorithmException nse) {
            nse.printStackTrace();
        }
        return sig;
    }
}
