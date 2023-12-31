import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Buzon;
import com.tp2.Correo;
import com.tp2.EmailManager;


public class EmailManagerTest {

@Test
public void test_enviarCorreo() {

    EmailManager EmailManager = new EmailManager();
    Buzon buzon = new Buzon("AlumnoJorgito@gmail.com", new ArrayList<>(), new ArrayList<>());
    
    Correo correo1 = new Correo("Pago", "Pago vencido", "pagos@ucp.com", "AlumnoJorgito@gmail.com");
    EmailManager.agregarBuzones(buzon);
    EmailManager.enviarCorreo(correo1);

     assertEquals(0, buzon.getBandejaDeEnviados().size());
    }

 @Test
public void test_enviarCorreoDesdeBuzon1() {

    EmailManager EmailManager = new EmailManager(); 
    Buzon buzon1 = new Buzon("depto5@gmail.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon2 = new Buzon("depto1@gmail.com", new ArrayList<>(), new ArrayList<>());
    
    Correo correo1 = new Correo("Expensa", "Pago al dia", "Administracion@gmail.com", "depto5@gmail.com");
    Correo correo2 = new Correo("Expensa", "debe mes Septiembre", "Administracion@example.com", "depto3@gmail.com");
       
    EmailManager.agregarBuzones(buzon1); 
    EmailManager.agregarBuzones(buzon2);  // Agregamos los buzones a la lista de buzones de Email Manager
      
    EmailManager.enviarCorreo(correo1);   //email manager envia el correo
    EmailManager.enviarCorreo(correo2);
       
    assertEquals(0, buzon1.getBandejaDeEnviados().size()); //se envio desde el primer buzon
    assertEquals(0, buzon2.getBandejaDeEntrada().size()); //recibido en el segundo
       
    }

@Test
public void test_enviarCorreoBuzon1yNoEnviarCorreoBuzon2() {

    EmailManager EmailManager = new EmailManager(); 
    Buzon buzon1 = new Buzon("depto@gmail.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon2 = new Buzon("depto1@gmail.com", new ArrayList<>(), new ArrayList<>());
    
    Correo correo1 = new Correo("Expensa", "Pago al dia", "Administracion@gmail.com", "depto5@gmail.com");
    Correo correo2 = new Correo("Expensa", "debe mes Septiembre", "Administracion@example.com", "depto3@gmail.com");
    
    EmailManager.agregarBuzones(buzon1);  // Agregamos los buzones a la lista de buzones de Email Manager
    EmailManager.agregarBuzones(buzon2); 

    EmailManager.enviarCorreo(correo1);  //email manager envia el correo
    EmailManager.enviarCorreo(correo2);
    
    assertEquals(0, buzon1.getBandejaDeEnviados().size());  // Se envio desde el primer buzon
    assertEquals(0, buzon2.getBandejaDeEntrada().size()); // Se recibio en el segundo
    assertEquals(0, buzon2.getBandejaDeEnviados().size());  //no se envio nada desde el segundo
}

 @Test
public void test_getPara() {

        EmailManager EmailManager = new EmailManager();
        List<Buzon> buzones = new ArrayList<>();
        Buzon buzon1 = new Buzon("depto@gmail.com", new ArrayList<>(), new ArrayList<>());
        Buzon buzon2 = new Buzon("depto1@gmail.com", new ArrayList<>(), new ArrayList<>());

        EmailManager.agregarBuzones(buzon1);  
        EmailManager.agregarBuzones(buzon2); 

        EmailManager.setPara(buzones); //establecer lista de buzones en el emailManager
        List<Buzon> buzonesObtenidos = EmailManager.getPara(); //obtener lista
        assertEquals(buzones, buzonesObtenidos); //verificar
    }

@Test
public void testSetPara() {
        EmailManager EmailManager = new EmailManager();
        List<Buzon> nuevoBuzon = new ArrayList<>();
        Buzon buzon1 = new Buzon("depto@gmail.com", new ArrayList<>(), new ArrayList<>());
        Buzon buzon2 = new Buzon("depto1@gmail.com", new ArrayList<>(), new ArrayList<>());

    
        nuevoBuzon.add(buzon1);
        nuevoBuzon.add(buzon2);

        EmailManager.setPara(nuevoBuzon); //establecer lista usando set
        List<Buzon> buzonSet = EmailManager.getPara(); //obtener lista
        assertEquals(nuevoBuzon, buzonSet);
    }
        
@Test
public void test_getCorreo() {
    EmailManager EmailManager = new EmailManager();
    EmailManager.getCorreo();
    }

 @Test
public void test_buscarCorreo() {
    EmailManager EmailManager = new EmailManager();
    EmailManager.buscarCorreo();   
    }

@Test
public void test_ListaDeBuzones() {
        
    List<Buzon> buzones = new ArrayList<>();
    Buzon buzon1 = new Buzon("depto@gmail.com", new ArrayList<>(), new ArrayList<>());
    Buzon buzon2 = new Buzon("depto1@gmail.com", new ArrayList<>(), new ArrayList<>());
    buzones.add(buzon1);
    buzones.add(buzon2);

    EmailManager emailManager = new EmailManager(buzones);
    List<Buzon> buzonesEnEmailManager = emailManager.getPara();
    assertEquals(buzones, buzonesEnEmailManager);
    }



}