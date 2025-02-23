import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class roomBook {
    public roomBook(Connection connection, Statement statement, Scanner sc) throws SQLException {
        System.out.print("Enter guest name : ");
        String guestName = sc.next();
        sc.nextLine();
        System.out.print("Enter room number : ");
        int roomNum = sc.nextInt();
        System.out.print("Enter contact number : ");
        String contactNum = sc.next();
        sc.nextLine();

        String query = "INSERT INTO reservations(guest_name, room_num, contact_num) VALUES ('"+guestName+"', '"+roomNum+"', '"+contactNum+"');";

        int affected_rows = statement.executeUpdate(query);
        if(affected_rows > 0){
            System.out.println("Room no "+roomNum+" booked Successfully 😊");
        } else {
            System.out.println("Failed to book room no "+roomNum);
        }

    }
}
