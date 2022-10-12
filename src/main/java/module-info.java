module com.sopvn.demosingleton {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.microsoft.sqlserver.jdbc;
    requires java.sql;
    
    opens com.sopvn.demosingleton to javafx.fxml;
    exports com.sopvn.demosingleton;
}
