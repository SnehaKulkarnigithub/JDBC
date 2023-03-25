import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class MetaDataDemo {

	static void getMetaData()
	{
		
	}
	public static void main(String[] args) {
		Connection con=DBUtil.getMySQLConnection();
		
		try {
			DatabaseMetaData dm=con.getMetaData();
			System.out.println("Driver Name "+dm.getDriverName());
			System.out.println("Driver version "+dm.getDriverVersion());
			System.out.println("Database product name "+dm.getDatabaseProductName());
			System.out.println("User Name "+dm.getUserName());
			System.out.println("Max columns in table "+dm.getMaxColumnsInTable());
			System.out.println("SQL keywards "+dm.getSQLKeywords());
			System.out.println("Connection "+dm.getConnection());
			System.out.println("MaxConnection "+dm.getMaxConnections());
			System.out.println("Catalogs "+dm.getCatalogs());
			System.out.println("Catalog seperator "+dm.getCatalogSeparator());
			System.out.println("Max table in select"+dm.getMaxTablesInSelect());
			System.out.println("numeric functions"+dm.getNumericFunctions());
			System.out.println("String functions"+dm.getStringFunctions());
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
