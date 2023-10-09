import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;
import com.tp2.EmailManager;
import com.tp2.Filtro;
import com.tp2.FiltroPorAsunto;

public class FiltroPorAsuntoTest {
    

@Test
public void test_filtrarPorAsunto() {

    Filtro filtro = new Filtro();
    List<Correo> correos = new ArrayList<>();
    Correo correo1 = new Correo("Mesa de examen", "18/12", "Profesor  1"); 
    Correo correo2 = new Correo("Inscripcion", "aprobada", "Profesor 2");

    correos.add(correo1);
    correos.add(correo2);
    List<Correo> correoFiltrado = filtro.filtarPorAsunto(correos, "examen"); //asunto filtrado

    assertEquals(1, correoFiltrado.size()); // Solo debe coincidir un solo correo 1
    assertEquals(correo1, correoFiltrado.get(0));
}

  @Test
public void TestPorAsuntoVarios() {

    Buzon buzon = new Buzon("administracion@ucp.com", null, null);
    FiltroPorAsunto filtro = new FiltroPorAsunto();
    Correo correo1 = new Correo("examen", "llamado 1", "administracion@ucp.com", "alberto@gmail.com");
    Correo correo2 = new Correo("Inscripcion", "aprobada", "administracion@ucp.com", "juana@gmail.com");
    

    buzon.getBandejaDeEntrada().add(correo1);
    buzon.getBandejaDeEntrada().add(correo2);
   

    String palabraClave = "examen";

    List<Correo> correoFiltrado = filtro.filtrarPorAsunto(buzon, palabraClave);

    assertNotNull(correoFiltrado);
    assertEquals(1, correoFiltrado.size());
    assertEquals("examen", correoFiltrado.get(0).getAsunto());
}

@Test
    public void testEnviarYFiltrarPorAsunto() {

        EmailManager emailManager= new EmailManager();
        Buzon buzon1 = new Buzon("administracion@ucp.com", new ArrayList<>(), new ArrayList<>());
        Buzon buzon2 = new Buzon("valentina@gmail.com", new ArrayList<>(), new ArrayList<>());

        // Crear instancias de Correo
        Correo correo1 = new Correo("Mesa de examen", "aprobado para rendir", "administracion@ucp.com", "valentina@gmail.com");
        Correo correo2 = new Correo("pago", "pago fuera de termino", "administracion@ucp.com", "valentina@gmail.com");
        Correo correo3 = new Correo("resultado examen", "aprobado", "administracion@ucp.com", "valentina@gmail.com");
    
       emailManager.agregarBuzones(buzon1);
       emailManager.agregarBuzones(buzon2);

      
       emailManager.enviarCorreo(correo1);
       emailManager.enviarCorreo(correo2);
       emailManager.enviarCorreo(correo3);
       

        FiltroPorAsunto filtro = new FiltroPorAsunto();
        List<Correo> correoFiltrado1 = filtro.filtrarPorAsunto(buzon1, "examen");
        List<Correo> correoFiltrado2 = filtro.filtrarPorAsunto(buzon2, "pago");

       
        assertEquals(2, correoFiltrado1.size());
         assertEquals(1, correoFiltrado2.size());

     
    }


}

   







    
