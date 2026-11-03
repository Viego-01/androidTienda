package com.mycompany.tiendita;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextArea txt1;
    @FXML TextField txt2,txt3;

    Producto p=new Producto();
    @FXML
    private void switchToSecondary() throws IOException {
        int a=(Integer.parseInt(txt2.getText()));
        txt3.setText(p.carrito(a));
    }

    public void initialize (){
        int i;
        for(i=0;i<p.lista.length;i++){
        txt1.appendText(p.lista[i].toString()+"\n");
        }

    }
}
