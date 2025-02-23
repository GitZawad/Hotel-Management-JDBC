# Hotel Management System using JDBC

![Java](https://img.shields.io/badge/Java-17-blue)
![JDBC](https://img.shields.io/badge/JDBC-MySQL-orange)
![License](https://img.shields.io/badge/License-MIT-green)

A **Hotel Management System** built using **Java** and **JDBC** for database connectivity. This application allows users to manage hotel operations such as room booking, guest management, and billing.

---

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Setup Instructions](#setup-instructions)
4. [Database Schema](#database-schema)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)

---

## Features
- **Guest Management:**
  - Add, update, and delete guest records.
  - View guest details.
- **Room Management:**
  - Add, update, and delete room records.
  - Check room availability.
- **Booking Management:**
  - Book rooms for guests.
  - Check-in and check-out functionality.
- **Billing:**
  - Generate bills for guests.
  - View payment history.
- **User Authentication:**
  - Secure login for admin and staff.

---

## Technologies Used
- **Programming Language:** Java (JDK 17)
- **Database:** MySQL
- **Database Connectivity:** JDBC (Java Database Connectivity)
- **IDE:** IntelliJ IDEA / Eclipse
- **Build Tool:** Maven (optional)

---

## Setup Instructions

### Prerequisites
1. **Java Development Kit (JDK):**
   - Ensure JDK 17 or higher is installed.
   - Download from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.org/).

2. **MySQL Database:**
   - Install MySQL Server and MySQL Workbench.
   - Download from [MySQL](https://dev.mysql.com/downloads/).

3. **IDE:**
   - Use IntelliJ IDEA, Eclipse, or any Java-supported IDE.

### Steps to Run the Project
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/GitZawad/Hotel-Management-JDBC.git
   cd Hotel-Management-JDBC
   ```

2. **Set Up the Database:**
   - Open MySQL Workbench or any MySQL client.
   - Create a new database named `hotel_management`.
   - Run the SQL script provided in the `database_schema.sql` file to create tables and insert sample data.

3. **Configure Database Connection:**
   - Open the `DatabaseConnection.java` file.
   - Update the following variables with your MySQL credentials:
     ```java
     private static final String URL = "jdbc:mysql://localhost:3306/hotel_management";
     private static final String USER = "your_mysql_username";
     private static final String PASSWORD = "your_mysql_password";
     ```

4. **Run the Application:**
   - Open the project in your IDE.
   - Navigate to the `Main.java` file and run it.

---

## Database Schema
The database consists of the following tables:

### Tables
1. **Guests:**
   - `guest_id` (Primary Key)
   - `full_name`
   - `email`
   - `phone_number`
   - `address`

2. **Rooms:**
   - `room_id` (Primary Key)
   - `room_number`
   - `room_type`
   - `price_per_night`
   - `is_available`

3. **Bookings:**
   - `booking_id` (Primary Key)
   - `guest_id` (Foreign Key)
   - `room_id` (Foreign Key)
   - `check_in_date`
   - `check_out_date`
   - `total_cost`

4. **Payments:**
   - `payment_id` (Primary Key)
   - `booking_id` (Foreign Key)
   - `payment_date`
   - `amount`

---

## Usage
1. **Admin Login:**
   - Use the default admin credentials to log in:
     - Username: `admin`
     - Password: `admin123`

2. **Guest Management:**
   - Add new guests, update guest details, or delete guest records.

3. **Room Management:**
   - Add new rooms, update room details, or delete room records.
   - Check room availability.

4. **Booking Management:**
   - Book rooms for guests.
   - Perform check-in and check-out operations.

5. **Billing:**
   - Generate bills for guests.
   - View payment history.

---

## Contributing
Contributions are welcome! If you'd like to contribute to this project, please follow these steps:
1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes.
4. Push your branch and submit a pull request.

---

## License
This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for details.

---

## Acknowledgments
- Thanks to [Java](https://www.java.com/) and [MySQL](https://www.mysql.com/) for providing the tools to build this project.
- Special thanks to all contributors and users of this repository.

---

## Contact
For any questions or feedback, feel free to reach out:
- **GitHub:** [GitZawad](https://github.com/GitZawad)
- **Email:** [zawaduddin@gmail.com]

---

Enjoy using the **Hotel Management System**! 🏨
