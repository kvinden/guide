package com.example.guide;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GuideController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}