import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.tp2.Contacto;

public class ContactoTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

@Test
   public void test_crearContacto(){

      Contacto contacto = new Contacto("Juan", "Rodriguez", "juan91@gmail.com"); 
        assertEquals("Juan", contacto.getNombre());
        assertEquals("Rodriguez", contacto.getApellido());
        assertEquals("juan91@gmail.com", contacto.getEmail());
    }

@Test
   public void test_ContactoSinNombre(){
      Contacto contacto = new Contacto( "juan91@gmail.com"); 
        assertEquals("juan91@gmail.com", contacto.getEmail());
    }


@Test
   public void  test_setNombre(){
       Contacto contacto = new Contacto("Juan", "Rodriguez","juan91@gmail.com");
       assertEquals("Juan", contacto.getNombre());
       contacto.setNombre("Martin"); //modificamos el nombre inicial y lo setteamos
       assertEquals("Martin", contacto.getNombre()); //comprobamos
   }

@Test
   public void  test_setApellido(){
      Contacto contacto = new Contacto("Juan", "Rodriguez","juan91@gmail.com");
       assertEquals("Rodriguez", contacto.getApellido());
       contacto.setNombre("Gomez"); //modificamos el apellido inicial y lo setteamos
       assertEquals("Gomez", contacto.getNombre()); //comprobamos 
   }


   @Test
   public void  test_getNombre(){
      Contacto contacto = new Contacto("Juan", "Rodriguez","juan91@gmail.com");
      String nombre = contacto.getNombre();
      assertEquals("Juan", nombre);
  }

   @Test
   public void  test_getApellido(){
      Contacto contacto = new Contacto("Juan", "Rodriguez","juan91@gmail.com");
      String apellido = contacto.getApellido();
      assertEquals("Rodriguez", apellido);
  }

  @Test
   public void  test_getEmail(){
      Contacto contacto = new Contacto("demo@ucp.com");
      String email = contacto.getEmail();
      assertEquals("demo@ucp.com", email);
  }

 @Test
    public void test_CorreoNoValido(){
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("El correo electrónico no es válido");
        new Contacto("memo");
 }

@Test
    public void test_CorreoValido() {
        Contacto c1= new Contacto("demo@ucp.com");
        assertEquals("demo@ucp.com", c1.getEmail());

    }
}