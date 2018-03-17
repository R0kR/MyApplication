import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hi Team! Let's start the mission guys");
        MongoClientURI uri = new MongoClientURI("mongodb://test:test@ds217349.mlab.com:17349/mymongodb"); 
        
        		MongoClient client = new MongoClient(uri);
        		MongoDatabase db = client.getDatabase(uri.getDatabase());
        		
        		
      
        	      
        	      //System.out.println(db.listCollectionNames());
        	     db.createCollection("myCollection");
        	    
        	      /*
        	      MongoCollection<Document> collection = db.getCollection("test"); 
        	     
        	      
        	      Document document = new Document("title", "MongoDB").append("id", 1)
        	    	      .append("description", "database") 
        	    	      .append("likes", 100) 
        	    	      .append("url", "http://www.tutorialspoint.com/mongodb/") 
        	    	      .append("by", "tutorials point");  
        	      
        	    	      collection.insertOne(document); 
        	    	      System.out.println("Document inserted successfully");

        	      
        	     */
        	      
        	      client.close();	
         
        
	}

}
