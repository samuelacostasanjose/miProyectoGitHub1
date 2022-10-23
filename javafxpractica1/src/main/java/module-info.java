module javafxpractica1.javafxpractica1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens javafxpractica1.javafxpractica1 to javafx.fxml;
    exports javafxpractica1.javafxpractica1;
}