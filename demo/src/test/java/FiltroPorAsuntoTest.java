import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Correo;
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
public void test_filtrarPorAsuntoVarios() {

    List<Correo> correos = new ArrayList<>();
    FiltroPorAsunto filtro = new FiltroPorAsunto();
    Correo correo2 = null; // Declarar correo2 fuera del bucle para despues agregar ahi correos
    
        for (int i = 0; i < 5; i++) {
            int num = 1; 
            String numero = "" + num; 
            correo2 = new Correo(numero, numero, numero + "@ucp.com", numero + "@ucp.com");
            correos.add(correo2);
        }
    
    correos.add(correo2);
    correos.add(correo2); // Ahora se puede agregar correos1 por que fueron sacados a la lista correos las veces que queramos
    correos.add(correo2);
        
    String palabraFiltro = "administracion"; 
    List<Correo> correoFiltrado = filtro.filtarPorAsunto(correos, palabraFiltro);
    
    assertNotNull(correoFiltrado);
    assertEquals(8, correoFiltrado.size()); // Debería haber 8, que son 5 del bucle y 3 que agregamos 
    assertEquals("administracion", correoFiltrado.get(0).getAsunto());
     
    }

   








}
    
