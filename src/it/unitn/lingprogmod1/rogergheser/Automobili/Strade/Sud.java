package it.unitn.lingprogmod1.rogergheser.Automobili.Strade;

import it.unitn.lingprogmod1.rogergheser.Automobili.Griglia;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Sud extends Strada{
    public Sud(Griglia griglia) {
        super(griglia);

        Rectangle rect = new Rectangle(0, 0, 48, 28);
        rect.setStroke(Color.GRAY);
        rect.setVisible(false);
        bp.setCenter(rect);
        int radius=10;
        bp.setStyle("-fx-background-color: #666666;");
        circle.setRadius(radius);
        circle.setStroke(Color.YELLOW);
        bp.setAlignment(circle, Pos.CENTER);
        bp.setBottom(circle);

        this.getChildren().add(bp);
    }
}
