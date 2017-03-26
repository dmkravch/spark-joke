package com.ciscospark;

import java.net.URI;
import java.util.Arrays;

import com.ciscospark.*;

class call {
    public static void main(String[] args) {
        // To obtain a developer access token, visit http://developer.ciscospark.com
        String accessToken = "NDdiMDk1YTYtZGZhYy00MzYyLThhMmQtYTA4NzA1OTVmODYxMTA5MWJhODItMTM4";

        // Initialize the client
        Spark spark = Spark.builder()
                .baseUrl(URI.create("https://api.ciscospark.com/v1"))
                .accessToken(accessToken)
                .build();

        // List the rooms that I'm in
  /**      spark.rooms()
                .iterate()
                .forEachRemaining(room -> {
                    System.out.println(room.getTitle() + ", created " + room.getCreated() + ": " + room.getId());
                });
 
        // Create a new room
        spark.rooms().iterate().forEachRemaining(room -> {
        	System.out.println(room.getTitle());
        });
 */
        Message message = new Message();
        message.setRoomId("Y2lzY29zcGFyazovL3VzL1JPT00vYWNhYzZmNzQtNWVlZi0zNmE1LWJhNjgtNmFiNzg5NmIyMjBl");
        message.setText("Hello World!");
        spark.messages().post(message);
        /**       
        Room room = new Room();
        room.setId("Y2lzY29zcGFyazovL3VzL1JPT00vYWNhYzZmNzQtNWVlZi0zNmE1LWJhNjgtNmFiNzg5NmIyMjBl");
   */     
        
        
        	
        



    }
}
