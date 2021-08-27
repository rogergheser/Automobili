package it.unitn.lingprogmod1.rogergheser.Automobili;

import it.unitn.lingprogmod1.rogergheser.Automobili.Strade.Est;
import it.unitn.lingprogmod1.rogergheser.Automobili.Strade.Nord;
import it.unitn.lingprogmod1.rogergheser.Automobili.Strade.Ovest;
import it.unitn.lingprogmod1.rogergheser.Automobili.Strade.Sud;
import javafx.scene.control.Button;

public class SButton extends Button {
    static Main.SButtons selection = Main.SButtons.NORD;
    Main.SButtons orientation;
    public SButton(String s, Main.SButtons orientation) {
        super(s);
        this.orientation = orientation;

        this.setOnAction(actionEvent -> {
            setDisable(true);
            this.selection = this.orientation;
            System.out.println("Using: " + selection);
        });
    }

    public static Cella getReplacement(Griglia griglia) {
        Cella ret;
        if (selection.equals(Main.SButtons.NORD))
            ret = new Nord(griglia);
        else if (selection.equals(Main.SButtons.EST))
            ret = new Est(griglia);
        else if (selection.equals(Main.SButtons.SUD))
            ret = new Sud(griglia);
        else if (selection.equals(Main.SButtons.OVEST))
            ret = new Ovest(griglia);
        else
            ret = new Prato(griglia);

        return ret;
    }

    @Override
    public String toString() {
        return orientation+"";
    }
}
