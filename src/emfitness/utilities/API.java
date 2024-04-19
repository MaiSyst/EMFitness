/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emfitness.utilities;

import com.maisyst.fetch.MaiFetch;
import com.maisyst.fetch.utils.Authorization;

/**
 *
 * @author orion90
 */
public class API {
    public static MaiFetch fetch(Authorization authorization){
        return MaiFetch.create(Constants.API_URL,authorization);
    }
    public static MaiFetch fetch(){
        return MaiFetch.create(Constants.API_URL);
    }
}
