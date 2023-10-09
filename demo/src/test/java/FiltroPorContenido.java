import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;
import com.tp2.EmailManager;


public class FiltroPorContenido {


@Test
    public void test_porContenido() {
    
    Buzon buzon = new Buzon("administracion@ucp.com", null, null);
    FiltroPorContenido filtro = new FiltroPorContenido();
    Correo correo1 = new Correo("pago", "vencido", "administracion@ucp.com", "luis@gmail.com");
    Correo correo2 = new Correo("estado de examen", "examen", "administracion@ucp.com", "maria@gmail.com");
    Correo correo3 = new Correo("mesa", "regular", "administracion@ucp.com", "valentina@gmail.com");

    buzon.getBandejaDeEntrada().add(correo1);
    buzon.getBandejaDeEntrada().add(correo2);
    buzon.getBandejaDeEntrada().add(correo3);

    String contenido = "examen";

    
    List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, contenido);
    assertNotNull(correosFiltrados);
    assertEquals(1, correosFiltrados.size());
    assertEquals("examen", correosFiltrados.get(0).getContenido());
}


    @Test
    public void test_enviaryFiltrarContenido() {

        EmailManager emailManager = new EmailManager();
        Buzon buzon = new Buzon("correo@gmail.com", new ArrayList<>(), new ArrayList<>());

        Correo correo1 = new Correo("pago", "vencido", "administracion@ucp.com", "luis@gmail.com");
        Correo correo2 = new Correo("estado de examen", "examen", "administracion@ucp.com", "maria@gmail.com");
        Correo correo3 = new Correo("mesa", "regular", "administracion@ucp.com", "valentina@gmail.com");
        
        emailManager.agregarBuzones(buzon);

      
        emailManager.enviarCorreo(correo1);
        emailManager.enviarCorreo(correo2);
        emailManager.enviarCorreo(correo3);

        FiltroPorContenido filtro = new FiltroPorContenido();
        List<Correo> correosFiltrados = filtro.filtrarPorContenido(buzon, "examen");


       
        assertEquals(2, correosFiltrados.size());
     
    }

  
}


