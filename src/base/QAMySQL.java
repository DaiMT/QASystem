package base;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class QAMySQL {

	private String ip;
	private String port;
	private Connection connection;
	
	public QAMySQL(){
		connection = null;
	}
	
	public QAMySQL(String ip,String port)throws Exception{
		this.ip = ip;
		this.port = port;
		StringBuffer url = new StringBuffer();
		url.append("jdbc:mysql://");
		url.append(this.ip);
		url.append(":");
		url.append(this.port);
		url.append("/mybase?"
				+"user=root&password=root&useUnicode=true&characterEncoding=UTF8");
		this.connection = (Connection) DriverManager.getConnection(url.toString());
	}
	
	public void close(){
		try{
			this.connection.close();
		}catch (SQLException e) {
			
		}
	}
}
