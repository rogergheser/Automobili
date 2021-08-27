package it.unitn.lingprogmod1.rogergheser.Automobili;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

public class Prato extends Cella{
    public Prato(Griglia griglia) {
        super(griglia);
        Rectangle rect = new Rectangle(0, 0, STD_DIM, STD_DIM);
        rect.setFill(Color.GREEN);
        rect.setStroke(Color.GRAY);
        rect.setStrokeType(StrokeType.INSIDE);
        bp.setCenter(rect);

        this.getChildren().add(bp);
    }
}
