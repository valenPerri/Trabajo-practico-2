import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.EmailManager;
import com.tp2.Correo;
import com.tp2.FiltroPorRemitente;


public class FiltroPorRemitenteTest {

@Test
public void Test_Remitente() {

    Buzon buzon = new Buzon("demo@ucp.com", null, null);
    FiltroPorRemitente filtro = new FiltroPorRemitente();

    Correo correo1 = new Correo("pago", "pago vencido", "demo1@ucp.com", "correo1@example.com");
    Correo correo2 = new Correo("pago", "pago al dia", "demo2@ucp.com", "correo1@example.com");
    Correo correo3 = new Correo("examen", "aprobado", "demo3@ucp.com", "correo1@example.com");

    buzon.getBandejaDeEntrada().add(correo1);
    buzon.getBandejaDeEntrada().add(correo2);
    buzon.getBandejaDeEntrada().add(correo3);

    String palabraFiltro = "@";

    List<Correo> correoFiltrados = filtro.filtroPorRemitente(buzon, palabraFiltro);

    assertNotNull(correoFiltrados);
    assertEquals(3, correoFiltrados.size());
    assertEquals("demo1@ucp.com", correoFiltrados.get(0).getRemitente());
}

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





}