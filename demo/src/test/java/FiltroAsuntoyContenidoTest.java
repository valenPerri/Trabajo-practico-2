import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;
import com.tp2.EmailManager;
import com.tp2.FiltroAsuntoyContenido;

public class FiltroAsuntoyContenidoTest {

    @Test
public void TestFilterAsuntoContenidos1() {

    Buzon buzon = new Buzon("administracion@ucp.com", null, null);
    FiltroAsuntoyContenido filtro = new FiltroAsuntoyContenido();
     Correo correo1 = new Correo("Mesa de examen", "aprobado fecha 18/12 ", "administracion@ucp.com", "demo@gmail.com");
    Correo correo2 = new Correo("limpieza", "pasillo 2", "administracion@ucp.com", "demo@gmail.com");
    Correo correo3 = new Correo("Resultado examen", "examen aprobado", "administracion@ucp.com", "demo@gmail.com");
      

    buzon.getBandejaDeEntrada().add(correo1);
    buzon.getBandejaDeEntrada().add(correo2);
    buzon.getBandejaDeEntrada().add(correo3);

    String palabraClaveAsunto = "examen";
    String palabraClaveContenido = "aprobado";

    List<Correo> correosFiltrados = filtro.filtrarPorAsuntoyContenido(buzon, palabraClaveAsunto, palabraClaveContenido);

    assertNotNull(correosFiltrados);
    assertEquals(2, correosFiltrados.size());
    assertEquals("examen", correosFiltrados.get(0).getAsunto());
    assertEquals("e", correosFiltrados.get(1).getAsunto());
}

@Test
    public void test_enviaryFiltrarAsuntoyContenido() {

      EmailManager emailManager = new EmailManager();
        Buzon buzon = new Buzon("administracion@ucp.com", new ArrayList<>(), new ArrayList<>());
        
        Correo correo1 = new Correo("Mesa de examen", "aprobado fecha 18/12 ", "administracion@ucp.com", "demo@gmail.com");
        Correo correo2 = new Correo("limpieza", "pasillo 2", "administracion@ucp.com", "demo@gmail.com");
        Correo correo3 = new Correo("Resultado examen", "examen aprobado", "administracion@ucp.com", "demo@gmail.com");
      
        
        emailManager.agregarBuzones(buzon);
        
        emailManager.enviarCorreo(correo1);
        emailManager.enviarCorreo(correo2);
        emailManager.enviarCorreo(correo3);
        
       
        

        FiltroAsuntoyContenido filtro = new FiltroAsuntoyContenido();
        List<Correo> correosFiltrados = filtro.filtrarPorAsuntoyContenido(buzon, "examen","aprobado");

        assertEquals(2, correosFiltrados.size());
     

       }
    
}
