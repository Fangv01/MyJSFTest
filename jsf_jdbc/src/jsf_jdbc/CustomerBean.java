package jsf_jdbc;

import java.io.Serializable;
import java.sql.*;
import java.util.*;

import javax.faces.bean.*;

@ManagedBean(name="customer")
@SessionScoped
public class CustomerBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private static String url = "jdbc:postgresql://127.0.0.1:5432/testdb";
	private static String user = "postgres";
	private static String password = "211511";

	
	public List<Customer> getCustomerList() throws SQLException{
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con = DriverManager.getConnection(url, user, password);
		if (con==null) {
			throw new SQLException("Can't get database connection");
		}
		PreparedStatement ps = con.prepareStatement(
			"select id, name, address, created_date from customer");
		ResultSet result = ps.executeQuery();
		List<Customer> list = new ArrayList<Customer>();
		while(result.next()){
			Customer cu = new Customer();
			cu.setId(result.getLong("id"));
			cu.setName(result.getString("name"));
			cu.setAddress(result.getString("address"));
			cu.setCreated_date(result.getDate("created_date"));
			list.add(cu);
		}
		return list;
	}
}
