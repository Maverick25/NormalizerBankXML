/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.normalizer.main;

import dk.normalizer.controller.NormalizeFromBankXML;
import java.io.IOException;

/**
 *
 * @author marekrigan
 */
public class NormalizerBankXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        NormalizeFromBankXML.receiveMessages();
    }
    
}
