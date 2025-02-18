import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class deleteReservation {
    public deleteReservation(Connection connection, Statement statement, Scanner sc) throws SQLException{
        System.out.print("Enter the Guest ID you want to delete : ");
        int guestID = sc.nextInt();
        String query = "DELETE FROM reservations WHERE reservation_id = '"+guestID+"';";
        try{
            int affected_rows = statement.executeUpdate(query);
            if(affected_rows > 0){
                System.out.println("Deletion succeeded.");
            } else {
                System.out.println("Failed to delete reservation.");
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
