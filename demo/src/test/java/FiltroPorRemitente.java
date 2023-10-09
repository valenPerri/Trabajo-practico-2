import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;
import com.tp2.EmailManager;


public class FiltroPorRemitente {


@Test
    public void test_enviaryFiltrarPorRemitente() {

        EmailManager emailManager = new EmailManager();
        Buzon buzon = new Buzon("administracion@ucp.com", new ArrayList<>(), new ArrayList<>());

        Correo correo1 = new Correo("Mesa de examen", "18/12", "administracion@ucp.com", "demo@gmail.com");
        Correo correo2 = new Correo("Pago vencido", " pagar mes septiembre", "administracion@ucp.com", "demo@gmail.com");
        Correo correo3 = new Correo("limpieza", "pasillo 4","servicio@hotmail.com" ,"demo@gmail.com");
        
        emailManager.agregarBuzones(buzon);

        emailManager.enviarCorreo(correo1);
        emailManager.enviarCorreo(correo2);
        emailManager.enviarCorreo(correo3);
        

        FiltroPorRemitente filtro = new FiltroPorRemitente();
        List<Correo> correoFiltrados = filtro.filtroPorRemitente(buzon, "@ucp.com");

       
        assertEquals(2, correoFiltrados.size());

     
    }

private List<Correo> filtroPorRemitente(Buzon buzon, String string) {
    return null;
}



}