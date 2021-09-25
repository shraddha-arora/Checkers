package com.company;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;

import java.awt.*;
import java.util.ArrayList;

public class CheckerBoardGrid {

    @FXML
    Pane pane;

    private final int size = 400;
    private final int numberOfSquares = 8;
    private final int squareSize = size/numberOfSquares;
    private ArrayList<Piece> pieces= new ArrayList();
    @FXML
    public void initialize(){
        for(int i=0; i<size; i+=squareSize){
            for(int j=0; j<size; j+=squareSize){
                Rectangle rectangle = new Rectangle(i, j, squareSize, squareSize);
                if((i+j)%100 == 0) {
                    rectangle.setFill(Color.LIGHTBLUE);
                }
                else
                    rectangle.setFill(Color.LIGHTCORAL);
                rectangle.setStroke(Color.BLACK);
                pane.getChildren().add(rectangle);

            }
        }
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if((i+j)%2!=0 && i!=3 && i!=4){
                    Circle circle = new Circle();
                    double radius = squareSize/3.0;
                    int x = squareSize/2 + squareSize*(j);
                    int y = squareSize/2 + squareSize*(i);
                    if(i<3)
                        circle.setFill(Color.BLACK);
                    else
                        circle.setFill(Color.WHITE);
                    circle.setStroke(Color.BLACK);
                    Piece piece = new Piece(x, y, radius, circle);
                    pieces.add(piece);
                    pane.getChildren().add(circle);
                    piece.draw();
                }
            }

        }
    }


}
