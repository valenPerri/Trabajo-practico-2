package com.tp2;

import java.util.ArrayList;
import java.util.List;

public class Buzon {

  private String emailInterno = " ";
  public List<Correo> bandejaDeEntrada;
  public List<Correo> bandejaDeEnviados;


  public Buzon(String emailInterno,List<Correo> bandejaDeEntrada, List<Correo> bandejaDeEnviados){
    this.emailInterno=emailInterno;
    this.bandejaDeEntrada= new ArrayList<>();
    this.bandejaDeEnviados=new ArrayList<>();
  }

  public String getEmailInterno(){
     return emailInterno;
   }

  public List<Correo> getBandejaDeEntrada(){ 
      return bandejaDeEntrada;
    }

  public List<Correo> getBandejaDeEnviados(){ 
      return bandejaDeEnviados;
    }


}
