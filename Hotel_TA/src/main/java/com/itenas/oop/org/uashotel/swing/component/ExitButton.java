/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.swing.component;

import com.itenas.oop.org.uashotel.swing.ExitConfirmation;
import com.itenas.oop.org.uashotel.swing.loginForm;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.*;

/**
 * WButton.java
 * 
 * An extension of JButton but with custom graphics
 *
 */

public class ExitButton extends JButton{
  ExitConfirmation exit;

  public ExitButton(){
    setBorder(BorderFactory.createEmptyBorder());
    setContentAreaFilled(false);
    setCursor(new Cursor(Cursor.HAND_CURSOR));
    exit = new ExitConfirmation();
      addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                exit.setVisible(true);
                exit.setLocationRelativeTo(null);
            }
                
        });
    }
}

