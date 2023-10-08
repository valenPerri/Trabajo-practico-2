package com.tp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmailManager {
    private List<Buzon> buzones = new ArrayList<>();
   

public EmailManager(){
}

public EmailManager(List<Buzon> buzones){
    this.buzones= new ArrayList<>(buzones);
}

public void agregarBuzones(Buzon usuario){
    buzones.add(usuario);
}

public List<Buzon> getPara(){
    return buzones;
}

public void setPara(List<Buzon> para) {
    this.buzones = para;
}

public void getCorreo(){
}

public void buscarCorreo(){
    
}

public void enviarCorreo(Correo email){
    String remitenteCorreo =email.getRemitente();

    Optional<Buzon> buzonRemitente = buzones.stream()
    .filter(buzon -> buzon.getEmailInterno().equals(remitenteCorreo))
    .findFirst();


    buzonRemitente.ifPresent(remitente -> remitente.getBandejaDeEnviados().add(email));
    List<String> destinatarios= email.getPara();

    for(String destinatarioCorreo : destinatarios){
        Optional<Buzon> buzonDestinatarios = buzones.stream()
            .filter(buzon -> buzon.getEmailInterno().equals(destinatarioCorreo))
            .findFirst();

            buzonDestinatarios.ifPresent(destinatario -> destinatario.getBandejaDeEntrada().add(email));
    }
    
}




}
