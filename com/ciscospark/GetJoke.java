package com.ciscospark;

import java.io.*;
import java.net.*;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetJoke {
   public static String getHTML() throws Exception {
	   String joke = null;
	  
	   JSONParser parser = new JSONParser();
	  try {         
          URL oracle = new URL("http://api.icndb.com/jokes/random"); // URL to Parse
          URLConnection yc = oracle.openConnection();
          BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
          
          String inputLine;
          while ((inputLine = in.readLine()) != null) {               
              JSONObject a = (JSONObject) parser.parse(inputLine);
              JSONObject value = (JSONObject) a.get("value");
              joke = (String) value.get("joke");  
          }
          in.close();        
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (ParseException e) {
          e.printStackTrace();
      }
	return joke; 
   }
   
}