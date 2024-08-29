import java.sql.*;

public class DemoJdbc {

    public static void main(String []args) throws ClassNotFoundException, SQLException {
        /*
        * Import package
        * Load and Register
        * Create Connection
        * Create Statement
        * Execute Statement
        * Process the results
        * Close
        */

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String uName = "postgres";
        String pass = "0000";
        String getQuery = "select sname from student where sid = 1";
        String insertQuery = "insert into student values(5, 'John', 50)";
        String updateQuery = "update student set sname='Max' where sid = 5";
        String deleteQuery = "delete from where sid = 5";
        boolean statusForInsert;
        boolean statusForUpdate;
        boolean statusForDelete;

        Connection con = DriverManager.getConnection(url,uName,pass);
        Statement st = con.createStatement();

        ResultSet getSet = st.executeQuery(getQuery);
        System.out.println(getSet);
        System.out.println(getSet.next());

        PreparedStatement ps = con.prepareStatement(insertQuery);

        statusForInsert = st.execute(insertQuery);
        if(!statusForInsert){
            System.out.println("Row inserted");
        }
        else {
            System.out.println("Statement is not executed");
        }

        statusForUpdate = st.execute(updateQuery);
        if(!statusForUpdate){
            System.out.println("Row inserted");
        }
        else {
            System.out.println("Statement is not executed");
        }

        statusForDelete = st.execute(deleteQuery);
        if(!statusForDelete){
            System.out.println("Row inserted");
        }
        else {
            System.out.println("Statement is not executed");
        }

//        set.next();
//        String columnName = set.getString("sname");
//        System.out.println("The name of the student is : "+columnName);

        while(getSet.next()){
            System.out.print(getSet.getInt(1)+ " - ");
            System.out.print(getSet.getInt(2)+ " - ");
            System.out.println(getSet.getString(3));
        }

        con.close();
        System.out.println("Connection Established");



    }

}
