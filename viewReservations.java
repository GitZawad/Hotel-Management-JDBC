import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class viewReservations {
    public viewReservations(Connection connection, Statement statement) throws SQLException {
        String query = "SELECT* FROM reservations;";
        ResultSet resultSet = statement.executeQuery(query);
        System.out.println("Current Reservations:");
        System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
        System.out.println("| Reservation ID | Guest           | Room Number   | Contact Number      | Reservation Date        |");
        System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
        while(resultSet.next()){
            int reservationID = resultSet.getInt("reservation_id");
            String guestName = resultSet.getString("guest_name");
            int roomNum = resultSet.getInt("room_num");
            String contactNum = resultSet.getString("contact_num");
            String timeStamp = String.valueOf(resultSet.getTimestamp("reservation_date"));
            System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-19s   |\n",reservationID, guestName, roomNum, contactNum, timeStamp);
        }
        System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");

    }
}
