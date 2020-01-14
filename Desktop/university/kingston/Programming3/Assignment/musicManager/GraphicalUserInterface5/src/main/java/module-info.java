/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

module GUI5 {
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;
    requires javafx.controlsEmpty;
    requires javafx.controls;
//    requires jdom;
    
    requires BL5;
    
    exports ku.piii2019.gui5;
//    exports javafx.graphics;
    opens ku.piii2019.gui5;
}
