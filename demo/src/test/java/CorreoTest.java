import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;

public class CorreoTest {

@Test
 public void test_crearCorreo(){
  
      Buzon buzon1 = new Buzon("demo@ucp.com", null, null);
      Buzon buzon2 = new Buzon("depto1@gmail.com", null, null);
      List<Buzon> para = new ArrayList<>();

      para.add(buzon1);
      para.add(buzon2);

      Correo correo = new Correo("Fecha de entrega", "14/11/23", "IngLuis@ucp.com", "AlumnaMaria@gmail.com");
      Correo email1 = new Correo();
      assertNotEquals(correo,email1);
   }

@Test
public void test_unicoDestinatario(){

      String asunto = "Fecha de entrega";
      String contenido = "14//11/23";
      String remitente = "Profesor";
      String paraUnico = "Alumno";

      Correo correo = new Correo(asunto, contenido, remitente, paraUnico);

      assertEquals(asunto, correo.getAsunto());
      assertEquals(contenido, correo.getContenido());
      assertEquals(remitente, correo.getRemitente());
      List<String> para = correo.getPara();
      assertEquals(1, para.size());
      assertEquals(paraUnico, para.get(0));
   }

@Test
public void test_variosDestinatarios(){

        String asunto = "Fecha de entrega";
        String contenido = "14/11/23";
        String remitente = "Profesor";
        List<String> paraVarios = new ArrayList<>();
        paraVarios.add("Alumno 1");
        paraVarios.add("Alumno 2");

        Correo correo = new Correo(asunto, contenido, remitente, paraVarios);

        assertEquals(asunto, correo.getAsunto());
        assertEquals(contenido, correo.getContenido());
        assertEquals(remitente, correo.getRemitente());
        List<String> para = correo.getPara();
        assertEquals(paraVarios, para);  
   }

@Test
public void test_sinDestinatario(){

        String asunto = "Fecha de entrega";
        String contenido = "14/11/23";
        String remitente = "Profesor";

        Correo correo = new Correo(asunto, contenido, remitente);

        assertEquals(asunto, correo.getAsunto());
        assertEquals(contenido, correo.getContenido());
        assertEquals(remitente, correo.getRemitente());
        List<String> para = correo.getPara();
        assertNull(para); // null por que no tiene destinatario
    }

@Test
public void  test_getAsunto(){

    String asunto = "Fecha de entrega";
    Correo correo = new Correo(asunto, "14/11/23", "Profesor");
    assertEquals(asunto, correo.getAsunto());   
  }

@Test
public void  test_getContenido(){

    String contenido = "14//11/23";
    Correo correo = new Correo("Fecha de entrega", contenido, "Profesor");
    assertEquals(contenido, correo.getContenido());
  }
  
@Test
public void  test_getRemitente(){
    String remitente = "Alumno";
        Correo correo = new Correo("Fecha de entrega", "14/11/23", remitente);
        assertEquals(remitente, correo.getRemitente());  
  }
  
@Test
public void test_getParaVarios(){

     List<String> paraVarios = new ArrayList<>();
        paraVarios.add("Alumno 1");
        paraVarios.add("Alumno 2");
        Correo correo = new Correo("Fecha de entrega", "14/11/23", "Profesor", paraVarios);
        assertEquals(paraVarios, correo.getPara());


  }

}
