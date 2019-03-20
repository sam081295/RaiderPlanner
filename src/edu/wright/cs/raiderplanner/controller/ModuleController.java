package edu.wright.cs.raiderplanner.controller;

import edu.wright.cs.raiderplanner.model.Module;
import edu.wright.cs.raiderplanner.model.Person;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


/**
 * Created by natedunn2230
 */
public class ModuleController implements Initializable {
    private Module module;
    private boolean success = false;

    /**
     * Standard method for getting module
     * @return module that was created
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * Getter for checking if module controller initialized successful.
     * @return boolean bases on initialized success
     */
    public boolean isSuccess() {
        return success;
    }

    // Panes:
    @FXML
    private GridPane pane;

    // Buttons:
    @FXML private Button submit;
    @FXML private Button quit;

    // Text:
    @FXML private TextArea details;
    @FXML private TextField name;
    @FXML private TextField code;
    @FXML private TextField organizer;
    @FXML private TextField salutation;
    @FXML private TextField organizerName;

    // Labels:
    @FXML private Label title;

    // Tooltips:
    @FXML private Label nameTooltip;
    @FXML private Label codeTooltip;
    @FXML private Label headingTooltip;
    @FXML private Label organizerTooltip;

    /**
     * Handle changes to the input fields.
     */
    public void handleChange() {
        // Check the input fields:
        if (!this.name.getText().trim().isEmpty()
                && !this.code.getText().trim().isEmpty()
                && !this.salutation.getText().isEmpty()
                && !this.organizerName.getText().trim().isEmpty()) {
            this.submit.setDisable(false);
        }
    }

    /**
     * Submit the form and create a new module.
     */
    public void handleSubmit() {
        if (this.module == null) {
            // Create a new Module
            Person organizer = new Person(this.salutation.getText(),
                    this.organizerName.getText(), true);

            this.module = new Module(organizer, this.code.getText());
            this.module.setName(this.name.getText());
            this.module.setDetails(this.details.getText());

        } else {

            Person organizer = new Person(this.salutation.getText(),
                    this.organizerName.getText(), true);

            // Update the current Milestone:
            this.module.setOrganiser(organizer);
            this.module.setModuleCode(this.code.getText());
            this.module.setName(this.name.getText());
            this.module.setDetails(this.details.getText());
        }

        this.success = true;
        Stage stage = (Stage) this.submit.getScene().getWindow();
        stage.close();
    }

    /**
     * Handle Quit button.
     */
    public void handleQuit() {
        Stage stage = (Stage) this.quit.getScene().getWindow();
        stage.close();
    }

    // Constructors:

    /**
     * Constructor for the MilestoneController.
     */
    public ModuleController() {
    }

    @Override public void initialize(URL location, ResourceBundle resources) {

        // Initialize tooltip messages:
        nameTooltip.setTooltip(new Tooltip("Enter the name of the module."));
        codeTooltip.setTooltip(new Tooltip("Enter the code of the module."));
        organizerTooltip.setTooltip(new Tooltip("Enter the name of the module " +
                "organizer."));
        headingTooltip.setTooltip(new Tooltip("A Module is synonymous to a class. " +
                "A module is composed of assignments in which a student can create study " +
                "plans for."));

        Platform.runLater(() -> this.pane.requestFocus());
    }

}
