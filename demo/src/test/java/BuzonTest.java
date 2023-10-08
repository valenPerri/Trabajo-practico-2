

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;


public class BuzonTest {   //generalmente utilizamos un buzon de prueba

 private Buzon buzon;

@Test
public void test_getEmailInterno(){

    String emailInterno = "demo@ucp.com";
    List<Correo> bandejaDeEntrada = new ArrayList<>();
    List<Correo> bandejaDeEnviados = new ArrayList<>(); 
    buzon = new Buzon(emailInterno, bandejaDeEntrada, bandejaDeEnviados);

    assertEquals("demo@ucp.com", buzon.getEmailInterno());
  
    }

@Test
public void test_getBandejadeEntrada(){

    String emailInterno = "demo@ucp.com";
    List<Correo> bandejaDeEntrada = new ArrayList<>();
    List<Correo> bandejaDeEnviados = new ArrayList<>();
    buzon = new Buzon(emailInterno, bandejaDeEntrada, bandejaDeEnviados);

    assertNotNull(buzon.getBandejaDeEntrada());
    assertEquals(0, buzon.getBandejaDeEntrada().size()); // bandeja vacia al inicio
}

         
@Test
public void test_getBandejadeEnviados(){

    String emailInterno = "demo@ucp.com";
    List<Correo> bandejaDeEntrada = new ArrayList<>();
    List<Correo> bandejaDeEnviados = new ArrayList<>();
    buzon = new Buzon(emailInterno, bandejaDeEntrada, bandejaDeEnviados);

    assertNotNull(buzon.getBandejaDeEnviados());
    assertEquals(0, buzon.getBandejaDeEnviados().size()); //bandeja vacia 
}

@Test
public void test_crearBuzon(){

    Buzon buzon = new Buzon("demo@ucp.com", null, null);

    assertNotNull(buzon.getBandejaDeEntrada());
    assertNotNull(buzon.getBandejaDeEnviados());
    assertTrue(buzon.getBandejaDeEntrada().isEmpty());
    assertTrue(buzon.getBandejaDeEnviados().isEmpty());
}

@Test
public void test_crearBuzon2(){
    Buzon buzon = new Buzon("depto1@gmail.com", null, null);

    assertNotNull(buzon);
}

@Test
 public void test_agregarCorreoBdeEntrada() {
    
    String emailInterno = "demo@ucp.com";
    List<Correo> bandejaDeEntrada = new ArrayList<>();
    List<Correo> bandejaDeEnviados = new ArrayList<>();
    buzon = new Buzon(emailInterno, bandejaDeEntrada, bandejaDeEnviados);
        
        
    Correo correo = new Correo("Urgente", "pago vencido", "Administracion");
    buzon.getBandejaDeEntrada().add(correo);

    assertEquals(1, buzon.getBandejaDeEntrada().size()); 
    assertTrue(buzon.getBandejaDeEntrada().contains(correo)); // correo agregado a bandeja de entrada
    }

@Test
 public void test_agregarCorreoBdeEnviados() {
    
    String emailInterno = "demo@ucp.com";
    List<Correo> bandejaDeEntrada = new ArrayList<>();
    List<Correo> bandejaDeEnviados = new ArrayList<>();
    buzon = new Buzon(emailInterno, bandejaDeEntrada, bandejaDeEnviados);
            
    Correo correo = new Correo("Realizacion del pago", "estoy al dia con el pago", "Alumno");
    buzon.getBandejaDeEnviados().add(correo);

    assertEquals(1, buzon.getBandejaDeEnviados().size()); 
    assertTrue(buzon.getBandejaDeEnviados().contains(correo)); // correo agregado a bandeja de enviados
    }



}

