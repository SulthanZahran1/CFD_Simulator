module sulthan_zahran.cfd_simulator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens sulthan_zahran.cfd_simulator to javafx.fxml;
    exports sulthan_zahran.cfd_simulator;
}