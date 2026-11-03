module com.mycompany.tiendita {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tiendita to javafx.fxml;
    exports com.mycompany.tiendita;
}
