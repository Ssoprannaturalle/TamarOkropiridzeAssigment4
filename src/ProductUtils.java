import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

public class ProductUtils {
    private ProductUtils() {
    }

    public static void createTable() {

        String createSql = "CREATE TABLE PRODUCT (" +
                "PRICE INTEGER NOT NULL AUTO_INCREMENT, " +
                "NAME VARCHAR(255), " +
                "SIZE VARCHAR(255)," +
                "TERM INTEGER NOT NULL," +
                "PRIMARY KEY(ID))";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }

    public static void insert(Product product) {

        String insertSql = "INSERT INTO PRODUCT(NAME, SIZE, TERM) VALUES(" +
                "'" + product.getname() + "', " +
                "'" + product.getsize() + "', " +
                "" + product.getterm() + ")";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Product> getAllProduct() {

        String selectSql = "SELECT * FROM PRODUCT";

        List<Product> product = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                product.add(new Product(
                        resultSet.getLong("price"),
                        resultSet.getString("name"),
                        resultSet.getString("size"),
                        resultSet.getLong("term")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return product;

    }

    public static void updateProduct(Integer price, String name) {

        String updateSql = "UPDATE PRODUCT SET NAME = '" + name + "' WHERE ID = " + name;

        try {
            JDBCUtil.getStatement().executeUpdate(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteProduct(Integer size) {

        String deleteAll = "DELETE FROM PRODUCT WHERE ID = " + size;

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

   public static void deleteAll() {

        String deleteAll = "DELETE FROM PRODUCT";

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

