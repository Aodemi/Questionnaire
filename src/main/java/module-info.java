module coursjavafx.questionnaire {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens coursjavafx.questionnaire to javafx.fxml;
    exports coursjavafx.questionnaire;
}