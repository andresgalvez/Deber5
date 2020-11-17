/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber5;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author AndresGalvez
 */
public class Deber5 extends Application {
    
    Stage stage;
    
    // Cliente nombre telefono direccion fields
    TextField operacionLabel;
    TextField txtTelefono;
    TextField txtDireccion;
    
    // Tamañó radio buttons
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    
    // Masa radio buttons
    RadioButton rdoDelgada;
    RadioButton rdoGruesa;
    
    // Topping radio buttons
    CheckBox chkPepperoni;
    CheckBox chkSalchicha;
    CheckBox chkAlbahaca;
    CheckBox chkAceitunas;
    CheckBox chkChampiñones;
    CheckBox chkTomates;
    CheckBox chkAnchoas;
    
    
    @Override
    public void start(Stage primaryStage) {
      stage = primaryStage;
        
        // ----- Crear el panel del top -----
        Label txtTitulo = new Label("Super Calculadora ");
        txtTitulo.setId("tituloPrincipal");
        
        Label txtModelo = new Label("FX1250  ");
        txtTitulo.setId("tituloPrincipal");
        /////////////////
        
         
         
        
        ToggleGroup groupTheme = new ToggleGroup();
        RadioButton rdoCielo =  new RadioButton("CIELO");
        rdoCielo.setToggleGroup(groupTheme);
        rdoCielo.setSelected(true);
        
        RadioButton rdoTierra = new RadioButton("TIERRA");
        rdoTierra.setToggleGroup(groupTheme);
       
        
    
        // ---------- Crear el panel de los datos del cliente ----------
        // NOmbre del cliente
        Label lblName = new Label("");
        lblName.setPrefWidth(10);
        operacionLabel = new TextField();
        operacionLabel.setPrefColumnCount(20);
        operacionLabel.setPromptText("Ingrese la operacion");
        operacionLabel.setMaxWidth(Double.MAX_VALUE);
        Button botonApagar = new Button("Apagar");
        botonApagar.setId("shiny-orange");
        botonApagar.setPrefWidth(80);
        botonApagar.setPrefHeight(180);
        
        Button botonCe = new Button("Ce");
        botonCe.setPrefWidth(80);
        botonCe.setPrefHeight(80);
        
        
        Button botonAC = new Button("AC");
        botonAC.setPrefWidth(160);
        botonAC.setPrefHeight(80);
        
        botonApagar.setOnAction(e -> System.out.println("Cedula de "+operacionLabel.getText()) );
       
        
        ToggleGroup groupGrados = new ToggleGroup();
        RadioButton rdoGrados =  new RadioButton("Grados");
        rdoGrados.setToggleGroup(groupGrados);
        rdoGrados.setSelected(true);
        rdoCielo.setOnAction(e -> {
            //CAMBIAR A GRADOS
            setUserAgentStylesheet(STYLESHEET_MODENA);
        });
        RadioButton rdoRadianes = new RadioButton("Radianes");
        rdoRadianes.setToggleGroup(groupGrados);
        rdoRadianes.setOnAction(e -> {
            //CAMBIAR A RADIANES
            setUserAgentStylesheet(STYLESHEET_CASPIAN);
        });
     
        
        Button boton1 = new Button("1");
        boton1.setPrefWidth(80);
        boton1.setPrefHeight(80);
        
        Button boton4 = new Button("4");
        boton4.setPrefWidth(80);
        boton4.setPrefHeight(80);
        
        Button boton7 = new Button("7");
        boton7.setPrefWidth(80);
        boton7.setPrefHeight(80);
        
        Button boton0 = new Button("0");
        boton0.setPrefWidth(160);
        boton0.setPrefHeight(80);
        
       ;
        
        // Panel de masa
        Button boton2 = new Button("2");
        boton2.setPrefWidth(80);
        boton2.setPrefHeight(80);
        Button boton5 = new Button("5");
        boton5.setPrefWidth(80);
        boton5.setPrefHeight(80);
        Button boton8 = new Button("8");
        boton8.setPrefWidth(80);
        boton8.setPrefHeight(80);
        
        
        
        // Panel de  toppings
        Button boton3 = new Button("3");
        boton3.setPrefWidth(80);
        boton3.setPrefHeight(80);
        
        Button boton6 = new Button("6");
        boton6.setPrefWidth(80);
        boton6.setPrefHeight(80);
        
        Button boton9 = new Button("9");
        boton9.setPrefWidth(80);
        boton9.setPrefHeight(80);
        
        Button botonPunto = new Button(".");
        botonPunto.setPrefWidth(80);
        botonPunto.setPrefHeight(80);
        
        Label labelMade = new Label("Made in China");
        labelMade.setPrefWidth(80);
        labelMade.setPrefHeight(80);
        labelMade.setRotate(-90);
        
        
        
         Button botonDividir = new Button("/");
        botonDividir.setPrefWidth(80);
        botonDividir.setPrefHeight(80);
        
        Button botonMultiplicar = new Button("*");
        botonMultiplicar.setPrefWidth(80);
        botonMultiplicar.setPrefHeight(80);
        
        Button botonSumar = new Button("+");
        botonSumar.setPrefWidth(80);
        botonSumar.setPrefHeight(160);
        
       
        
         Button botonPorcentaje = new Button("%");
        botonPorcentaje.setPrefWidth(80);
        botonPorcentaje.setPrefHeight(80);
        
        Button botonMenos = new Button("-");
        botonMenos.setPrefWidth(80);
        botonMenos.setPrefHeight(80);
        
        Button botonIgual = new Button("=");
        botonIgual.setPrefWidth(80);
        botonIgual.setPrefHeight(160);
        
     
        /////////////
        
        
        // ---------- Panel Bottom ----------
        Button btnOK = new Button("OK");
        btnOK.setPrefWidth(80);
        btnOK.setOnAction(e -> btnOK_Click() );
        Button btnCancel = new Button("Cancel");
        //btnCancel.setStyle( " -fx-background-color: cyan;  -fx-border-color:black;"
        //                   + "-fx-border-width:5px; -fx-border-radius:10px;" );
        
        btnCancel.setPrefWidth(80);
        btnCancel.setOnAction( e -> btnCancel_Click() );
        Region spacer = new Region();


        // Panel final
        GridPane panelFinal = new GridPane();
        panelFinal.setHgap(10);
        panelFinal.setVgap(10);
        //                     col fil
        //                       V H espacios
        panelFinal.add(txtTitulo,0,0,4,1);
        panelFinal.add(txtModelo,0,1,4,1);
        
        panelFinal.add(rdoTierra,4,0,2,1);
        panelFinal.add(rdoCielo,4,1,2,1);
        panelFinal.add(operacionLabel,0,2,6,1);
        
        panelFinal.add(rdoGrados,0,3,2,1);
        panelFinal.add(rdoRadianes,0,4,2,1);
        panelFinal.add(botonCe,2,3,1,2);
        panelFinal.add(botonAC,3,3,2,2);
                
        panelFinal.add(boton1,0,5,1,1);
        panelFinal.add(boton2,1,5,1,1);
        panelFinal.add(boton3,2,5,1,1);
        panelFinal.add(boton4,0,6,1,1);
        panelFinal.add(boton5,1,6,1,1);
        panelFinal.add(boton6,2,6,1,1);
        panelFinal.add(boton7,0,7,1,1);
        panelFinal.add(boton8,1,7,1,1);
        panelFinal.add(boton9,2,7,1,1);
        panelFinal.add(boton0,0,8,2,1);
        panelFinal.add(botonPunto,2,8,1,1);
        
        panelFinal.add(botonSumar,3,7,1,2);
        panelFinal.add(botonMenos,4,6,1,1);
        panelFinal.add(botonMultiplicar,3,6,1,1);
        panelFinal.add(botonDividir,3,5,1,1);
        panelFinal.add(botonPorcentaje,4,5,1,1);
        panelFinal.add(botonIgual,4,7,1,2);
        
        panelFinal.add(botonApagar,5,3,1,4);
        panelFinal.add(labelMade,5,7,1,2);
        
        
        Scene scene = new Scene(panelFinal);    
        scene.getStylesheets().add(getClass().getResource("Basico.css").toExternalForm());
        //scene.getStylesheets().add(getClass().getResource("Complejo.css").toExternalForm());
        
        rdoCielo.setOnAction(e -> {
            //scene.getStylesheets().add(getClass().getResource("Complejo.css").toExternalForm());
            System.out.print("Cambiando a Complejo.css");
        });
        
        rdoTierra.setOnAction(e -> {
           //scene.getStylesheets().add(getClass().getResource("Basico.css").toExternalForm());
            System.out.print("Cambiando a Basico.css");
        });
        
   // add a change listener 
        groupTheme.selectedToggleProperty().addListener(new ChangeListener<Toggle>()  
        { 
          @Override
          public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
              RadioButton rb = (RadioButton)groupTheme.getSelectedToggle();
                if(rb.getText() == "Tierra"){
                  scene.getStylesheets().add(getClass().getResource("Complejo.css").toExternalForm());
          }else{
                    scene.getStylesheets().add(getClass().getResource("Basico.css").toExternalForm());
                }
          }
        }); 
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizza");
        primaryStage.show();
    }
    
    public void btnOK_Click()  {
        // Mensaje con la orden del cliente
        String msg = "Cliente:\n\n";
        msg += "\t" + operacionLabel.getText() + "\n";
        msg += "\t" + txtDireccion.getText() + "\n";
        msg += "\tTlf:" + txtTelefono.getText() + "\n\n";
        msg += "Ud. ha ordenado una pizza ";
        
        // Tamaño de la pizza
        if (rdoSmall.isSelected())
            msg += "pequeña ";
        if (rdoMedium.isSelected())
            msg += "mediana ";
        if (rdoLarge.isSelected())
            msg += "grande ";
        
        System.out.println(msg);

    }
    
    public void btnCancel_Click()  {
        stage.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
