package it.unitn.lingprogmod1.rogergheser.Automobili.Strade;

import it.unitn.lingprogmod1.rogergheser.Automobili.Cella;
import it.unitn.lingprogmod1.rogergheser.Automobili.Griglia;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public abstract class Strada extends Cella {
    protected Circle circle = new Circle();

    public Strada(Griglia griglia) {
        super(griglia);

    }
}
