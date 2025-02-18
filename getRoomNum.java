import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class getRoomNum {
    public getRoomNum(Connection connection, Statement statement, Scanner sc) throws SQLException{
        System.out.print("Enter Guest ID : ");
        int guestID = sc.nextInt();
        String query = "SELECT room_num FROM reservations WHERE reservation_id = "+guestID+";";
        try{
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                int roomNum = resultSet.getInt("room_num");
                System.out.println("Room number "+roomNum+" is occupied by guest ID : "+guestID);
            } else{
                System.out.println("No room reserved with the provided guest ID.");
            }

        } catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
