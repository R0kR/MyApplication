import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hi Team! Let's start the mission guys");
        
        		MongoClient client = new MongoClient("ds115749.mlab.com",15749);
        		String connectPoint = client.getConnectPoint();
        		System.out.println(connectPoint);
        		
        		 // Creating Credentials 
        	      MongoCredential credential = MongoCredential.createCredential("admin", "blackjack", 
        	         "adminadmin".toCharArray()); 
        	      System.out.println("Connected to the database successfully"); 
        	      
        	      //Accessing the database 
        	      MongoDatabase database = client.getDatabase("blackjack");  
        	      System.out.println(database);
        	      
        	      
        	      MongoCollection<Document> collection = database.getCollection("bokachod"); 
        	      System.out.println("Collection :"+collection); 
        	      
        	      Document document = new Document("title", "MongoDB").append("id", 1)
        	    	      .append("description", "database") 
        	    	      .append("likes", 100) 
        	    	      .append("url", "http://www.tutorialspoint.com/mongodb/") 
        	    	      .append("by", "tutorials point");  
        	      
        	    	      collection.insertOne(document); 
        	    	      System.out.println("Document inserted successfully");

        	      
        	     
        	      
        	      client.close();
        	
         
        
	}

}
