import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.tp2.Correo;
import com.tp2.Filtro;
import com.tp2.FiltroCorreo;

public class FiltroCorreoTest {

     private FiltroCorreo filtroCorreo;
    

 @Test
public void test_filtrarCorreos() {

        Filtro filtro = new Filtro();
        List<Correo> correos = new ArrayList<>();
        Correo correo1 = new Correo("Mesa de examen", "18/12", "Profesor 1"); //prueba de correos
        Correo correo2 = new Correo("Inscripcion", "aprobada", "Profesor  2");

        correos.add(correo1);
        correos.add(correo2);
        List<String> palabrasFiltradas = Arrays.asList("Mesa de examen", "Profesor 2");
        List<Correo> correoFiltrado = filtro.filtarCorreo(correos, palabrasFiltradas);

        assertEquals(1, correoFiltrado.size()); // Ambos correos deben coincidir
    }
    

@Test
public void test_contienePalabraDeFiltro(){
        Filtro filtro = new Filtro();
        Correo correo = new Correo("Mesa de examen", "18/12", "Profesor titular"); //prueba

        List<String> palabrasFiltradas = new ArrayList<>();
        palabrasFiltradas.add("examen");   //lista de palabras que filtraremos
        palabrasFiltradas.add("Profesor");

        boolean resultado = filtro.contienePalabrasFiltros(correo, palabrasFiltradas); //verificacion

        assertTrue(resultado); // true por que se encuentran esas palabras
    }

@Test
public void test_NOcontienePalabraDeFiltro(){
        Filtro filtro = new Filtro();
        Correo correo = new Correo("Mesa de examen", "18/12", "Profesor titular");

        List<String> palabrasFiltradas = new ArrayList<>();
        palabrasFiltradas.add("tema");
        palabrasFiltradas.add("administracion");

        boolean resultado = filtro.contienePalabrasFiltros(correo, palabrasFiltradas);

        assertFalse(null, resultado); // false por que no se encuentran esas palabras
    }

    @Test
    public void test_CorreoEntero(){

        filtroCorreo = new FiltroCorreo();
        List<Correo> correos = new ArrayList<>();

         Correo correo1 = new Correo("Mesa de examen", "fecha 18/12", "Ingluis@ucp.com");
         Correo correo2 = new Correo("Pago", "debe mes de septiembre", "demo@ucp.com");  //correos prueba
        
         correos.add(correo1);
         correos.add(correo2);

       
         List<String> palabrasFiltradas = new ArrayList<>();   //palabras que filtraremos
         palabrasFiltradas.add("fecha"); 
         palabrasFiltradas.add("demo@ucp.com");
 
         List<Correo> correoFiltrado = filtroCorreo.filtarCorreos(correos, palabrasFiltradas);
         assertEquals(2, correoFiltrado.size()); // verifica y mantiene todos los correos
     }
    
    
        
    }







