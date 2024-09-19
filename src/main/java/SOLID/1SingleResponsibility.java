package SOLID;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class SingleResponsibility {
    public static void main(String[] args) {
        MySqlOrderRepository orderRepository = new MySqlOrderRepository();
        orderRepository.save();
    }
}

class MySqlOrderRepository {
    private static final String URL = "jdbc:mysql://localhost:3306/SOLIDTest";
    private static final String USER = "root";
    private static final String PASSWORD = "nurdin";

    public boolean save(){
        try {
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            System.out.println("DB is connect success!");
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
}

class ConfirmEmailSender {
    private final String username = "nurdin@gmail.com";
    private final String password = "nurdin";

    public void sendEmail() {
        System.out.println(username + " sending email" + password);
    }
}