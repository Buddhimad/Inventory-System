/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.malintha_agency.view.validation;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Dell
 */
public class Validation {

    public static void phoneNumber(JTextField textField, KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
        }
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[0-9]{0,10}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textField.setText(txt);
            textField.setCaretPosition(caretPosition - 1);
        }

    }

    /**
     * Validate text to accept a price
     */
    public static void priceText(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]+[.]?[0-9]{0,2}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept a limited number of integers
     */
    public static void limitesIntegers(JTextField textField, int value) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[0-9]{0," + value + "}$")) {
            txt = txt.substring(0, caretPosition - 1) + txt.substring(caretPosition);
            textField.setText(txt);
            textField.setCaretPosition(caretPosition - 1);
        }
    }

//   
//    public static void engineCapacity(JTextField textField) {
//        String text = textField.getText();
//        if (!text.isEmpty()) {
//            boolean res = text.matches("[0-9]{0,4}");//[c]{0,2} if "CC" is needed
//            if (!res) {
//                textField.setText(text.substring(0, text.length() - 1));
//            }
//        }
//    }
    /**
     * Validate text to accept a year
     */
    public static void textYear(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]{0,4}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    /**
     * Validate text to accept letters only
     */
    public static void name(JTextField textField) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[A-Za-z// ]*$")) {
            textField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

    /**
     * Validate text to accept numbers only
     */
    public static void numberOnly(JTextField textField) {
        String txt = textField.getText();
        int caretPosition = textField.getCaretPosition();
        if (!txt.matches("^[\\d]*")) {
            textField.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            textField.setCaretPosition(caretPosition - 1);
        }
    }

}
