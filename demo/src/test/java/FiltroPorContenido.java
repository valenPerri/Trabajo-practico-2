import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.tp2.Correo;
import com.tp2.Filtro;

public class FiltroPorContenido {

 @Test
public void test_filtrarPorContenido() {
    Filtro filtro = new Filtro();
    List<Correo> correos = new ArrayList<>();
    Correo correo1 = new Correo("Mesa de examen", "18/12", "Profesor 1"); 
    Correo correo2 = new Correo("Inscripcion", "aprobada", "Profesor 2");

    correos.add(correo1);
    correos.add(correo2);
    List<Correo> correoFiltrado = filtro.filtarPorContenido(correos, "aprobada"); //contenido filtrado

    assertEquals(1, correoFiltrado.size()); // Solo debe coincidir solo correo 2
    assertEquals(correo2, correoFiltrado.get(0));
}


}
