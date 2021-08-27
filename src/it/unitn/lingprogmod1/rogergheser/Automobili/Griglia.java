package it.unitn.lingprogmod1.rogergheser.Automobili;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

import java.util.List;

public class Griglia extends GridPane {
    private final int STD_DIM = 10;

    public Griglia() {
        for(int i=0; i<STD_DIM; i++){
            for (int j=0; j<STD_DIM; j++)
                this.add(new Prato(this), j, i);
        }
    }

    public void replaceNode(Cella cella) {
        Cella replacement = SButton.getReplacement(this);
        for (int i=0; i<STD_DIM; i++){
            for (int j=0; j<STD_DIM; j++){
                if (this.getChildren().get(i*STD_DIM+j) == cella){
                    this.getChildren().set(i*STD_DIM+j, replacement);

                    System.out.println(this.getChildren().get(i*STD_DIM+j) + " " + cella);
                    System.out.println("Colonna: "+j+ " Riga: "+i );
                }
            }
        }
    }
}
