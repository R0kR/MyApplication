import com.mongodb.MongoClient;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hi Team! Let's start the mission guys");
        
        		MongoClient client = new MongoClient("ds115579.mlab.com",15579);
        		String connectPoint = client.getConnectPoint();
        		System.out.println(connectPoint);
        		client.close();
        	
         
        
	}

}
