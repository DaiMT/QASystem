package base;

import com.mongodb.MongoClient;

public class QAMongo {

	private String ip;
	private String port;
	private MongoClient mongo;
	
	public QAMongo(){
		mongo = new MongoClient();
	}
	
	public QAMongo(String ip,String port){
		this.ip = ip;
		this.port = port;
		this.mongo = new MongoClient(ip);
	}
	
	public void close(){
		this.mongo.close();
	}

}
