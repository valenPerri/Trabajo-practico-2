package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class EmailManager {
    private List<Buzon> buzones;
    private Correo email;


public EmailManager(List<Buzon> buzones,Correo email){
    this.buzones= new ArrayList<>(buzones);
    this.email= email;

}

public EmailManager(){

}

public List<Buzon> getBuzones(){
    return buzones;
}

public Correo getEmail(){
    return email;
}


}

