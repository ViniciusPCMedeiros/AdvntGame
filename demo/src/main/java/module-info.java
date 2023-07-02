module vini.pcm {
    requires javafx.controls;
    requires javafx.fxml;

    opens vini.pcm to javafx.fxml;
    exports vini.pcm;
}
