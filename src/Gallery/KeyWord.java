/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gallery;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Kevin Blum
 */
public class KeyWord implements Serializable {
    private ArrayList<KeyWord> keywords;
    private String nombreKey;

    
    
    protected String keyword;

    public KeyWord(String keyword) {
        this.keyword = keyword;
    }
    
}
