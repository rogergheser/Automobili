package it.unitn.lingprogmod1.rogergheser.Automobili;

import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;


public abstract class Cella extends Group {
    protected BorderPane bp;
    protected final Integer STD_DIM = 50;
    protected Griglia griglia;
    public Cella(Griglia griglia) {
        bp = new BorderPane();
        this.griglia = griglia;
        this.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> {
           griglia.replaceNode(this);
        });
    }
}
