import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;



public class Main {
    public static void main(String[] args) {

        ProductUtils.getAllProduct()
                .stream()
                .forEach(product -> System.out.println(product));

        ProductUtils.updateProduct(2, "Kuuu");

        ProductUtils.getAllProduct()
                .stream()
                .forEach(product -> System.out.println(product));

    }
}



