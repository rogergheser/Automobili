package it.unitn.lingprogmod1.rogergheser.Automobili;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class Main extends Application {

    enum SButtons {
        NORD,
        OVEST,
        SUD,
        EST,
        PRATO
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        // -------BUTTONS
        // -- L-SIDE BUTTONS
        Button ovest = new SButton("Strada OVEST", SButtons.OVEST);
        Button nord =  new SButton("Strada NORD", SButtons.NORD);
        Button est = new SButton("Strada EST", SButtons.EST);
        Button sud = new SButton("Strada SUD", SButtons.SUD);
        Button prato = new SButton("PRATO", SButtons.PRATO);
        GridPane leftButtons = new GridPane();
        leftButtons.add(ovest, 0, 1);
        leftButtons.add(nord, 1, 0);
        leftButtons.add(est, 2, 1);
        leftButtons.add(sud, 1, 2);
        leftButtons.add(prato, 1, 1);
        // -- R-SIDE BUTTONS
        Button addCar = new Button("Aggiungi auto");
        Button moveCar = new Button("Muovi auto");
        Button reset = new Button("Reset");
        VBox rightButtons = new VBox(addCar, moveCar, reset);
        rightButtons.setSpacing(0);
        // PUTTING TOGETHER
        HBox buttons = new HBox(leftButtons, rightButtons);
        buttons.setSpacing(50);
        buttons.setAlignment(Pos.CENTER);
        Rectangle rect = new Rectangle(0, 0, 500, 100);
        rect.setFill(Color.GRAY);

        //Button logic
        String selectedButton = nord.toString();
        for (Node button : leftButtons.getChildren()){
            button.addEventFilter(ActionEvent.ANY, actionEvent -> {
                for (Node button1: leftButtons.getChildren()) {
                    if (button1 instanceof Button && button1.isDisabled())
                        button1.setDisable(false);
                }
            });
        }

        BorderPane root = new BorderPane();
        root.setCenter(new Griglia());
        root.setBottom(new Group(rect, buttons));

        primaryStage.setTitle("Amir Gheser");
        primaryStage.setScene(new Scene(root, 500, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}