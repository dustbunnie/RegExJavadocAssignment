module com.example.regexjavadocassignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.regexjavadocassignment to javafx.fxml;
    exports com.example.regexjavadocassignment;
}