import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "database_username";
    private static final String password = "database_password";

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection = DriverManager.getConnection(URL,username,password);
            Statement statement = connection.createStatement();
            System.out.println("Database Connected Successfully!");

            Scanner sc = new Scanner(System.in);

            while(true){
                System.out.println("Welcome to Hotel Management System.");
                System.out.println("1. Book a room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservation");
                System.out.println("5. Delete Reservation");
                System.out.println("6. Exit");
                System.out.print("\nPlease choose an option : ");
                int choice = sc.nextInt();
                switch (choice){
                    case 1:
                        roomBook rb = new roomBook(connection,statement,sc);
                        break;
                    case 2:
                        viewReservations vr = new viewReservations(connection,statement);
                        break;
                    case 3:
                        getRoomNum grn = new getRoomNum(connection,statement,sc);
                        break;
                    case 4:
                        updateReservation ur = new updateReservation(connection,statement,sc);
                        break;
                    case 5:
                        deleteReservation dr = new deleteReservation(connection, statement,sc);
                        break;
                    case 6:
                        try{
                            Exit exit = new Exit();
                        } catch(InterruptedException e){
                            System.out.println(e.getMessage());
                        }
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}