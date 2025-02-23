import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class updateReservation {
    public updateReservation(Connection connection, Statement statement, Scanner sc) throws SQLException {
        System.out.print("Enter Guest ID : ");
        int guestID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter guest name : ");
        String guestName = sc.next();
        sc.nextLine();
        System.out.print("Enter room number : ");
        int roomNum = sc.nextInt();
        System.out.print("Enter contact number : ");
        int contactNum = sc.nextInt();
        System.out.println();
        String query = "UPDATE reservations SET guest_name = '"+guestName+"', room_num = '"+roomNum+"', contact_num = '"+contactNum+"' WHERE reservation_id = '"+guestID+"';";
        try{
            int affected_rows = statement.executeUpdate(query);
            if(affected_rows > 0){
                System.out.println("Reservation updated successfully!");
            } else{
                System.out.println("Reservation Failed. Please try again.");
            }
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
