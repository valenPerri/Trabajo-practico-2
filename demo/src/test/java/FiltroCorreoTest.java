import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotEquals;


import java.util.ArrayList;

import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;



public class FiltroCorreoTest {

@Test
   public void test_CrearCorreo() {
      
      Buzon buzon1 = new Buzon("administracion@ucp.com", null, null);
      Buzon buzon2 = new Buzon("luis@gmail.com", null, null);
      List<Buzon> para = new ArrayList<>();

      para.add(buzon1);
      para.add(buzon2);

      Correo correo = new Correo("Mesa de examen", "18/12", "administracion@ucp.com", "luis@gmail.com");
      Correo email = new Correo();
      assertNotEquals(correo,email);

   }

@Test
   public void test_CorreoParaUnico() {
      Correo email = new Correo();
      Correo correo = new Correo("Mesa de examen", "18/12", "administracion@ucp.com", "luis@gmail.com");

       assertNotEquals(correo,email);
   }

@Test
   public void test_correoAsunto() {

       Correo correo = new Correo("Mesa de examen", "18/12", "administracion@ucp.com", "luis@gmail.com");
       assertEquals("Mesa de examen",correo.getAsunto());
   }

@Test
   public void test_correoContenido() {

    Correo correo = new Correo("Mesa de examen", "18/12", "administracion@ucp.com", "luis@gmail.com");
     assertEquals("18/12",correo.getContenido());
   }

 @Test
   public void test_correoParaVarios() {

      List<String> para = new ArrayList<>();
      
      para.add("demo@ucp.com");
      para.add("administracion@ucp.com");
      para.add("valentina@gmail.com");
      para.add("hola");


      Correo correo = new Correo("Mesa de examen", "18/12", "administracion@ucp.com", para);

      
      assertEquals(4,correo.getPara().size());
   }
        

}







