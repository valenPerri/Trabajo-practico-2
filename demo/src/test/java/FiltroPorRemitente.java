import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Correo;
import com.tp2.Filtro;

public class FiltroPorRemitente {

 @Test
public void test_filtroPorRemitente() {
    Filtro filtro = new Filtro();
    List<Correo> correos = new ArrayList<>();
    Correo correo1 = new Correo("Mesa de examen", "18/12", "Profesor 1"); 
    Correo correo2 = new Correo("Inscripcion", "aprobada", "Profesor 2");

    correos.add(correo1);
    correos.add(correo2);
    List<Correo> correoFiltrado = filtro.filtarPorRemitente(correos, "Profesor 1");

    assertEquals(1, correoFiltrado.size()); // Solo debe coincidir correo 1
    assertEquals(correo1, correoFiltrado.get(0));
}

@Test
public void test_filtroPorRemitente_NoEncontrado() {
    Filtro filtro = new Filtro();
    List<Correo> correos = new ArrayList<>();
    Correo correo1 = new Correo("Mesa de examen", "18/12", "Profesor 1"); 
    Correo correo2 = new Correo("Inscripcion", "aprobada", "Profesor 2");

    correos.add(correo1);
    correos.add(correo2);
    
    List<Correo> correoFiltrado = filtro.filtarPorRemitente(correos, "NoExistente"); //usamos un remitente que no existe

    assertEquals(0, correoFiltrado.size()); // No debe coincidir ningún correo
}


}