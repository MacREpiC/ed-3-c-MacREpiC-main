import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoblacionTest {

    @Test
    public void testClasifica() throws EdadErroneaException, GeneroErroneoException {
        assertEquals("trabajador", Poblacion.clasifica(50,'h'));
        assertEquals("trabajadora", Poblacion.clasifica(50,'m'));
        assertEquals("jubilado", Poblacion.clasifica(70,'h'));
        assertEquals("jubilada", Poblacion.clasifica(70,'m'));
        try{
            Poblacion.clasifica(7, 'h');
        }catch (EdadErroneaException ex){
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void testClasificaA01() throws EdadErroneaException, GeneroErroneoException
    {
        Assertions.assertThrows(EdadErroneaException.class,() -> {
            Poblacion.clasifica(-7, 'h');
        });
    }
    @Test
    public void testClasificaA12() throws EdadErroneaException, GeneroErroneoException {
        Assertions.assertThrows(EdadErroneaException.class, () -> {
            Poblacion.clasifica(126, 'o');
        });
    }
    @Test
    public void testClasificaB01() throws EdadErroneaException, GeneroErroneoException
    {
        Assertions.assertThrows(GeneroErroneoException.class,()-> {
            Poblacion.clasifica(50, '?');
        });
    }
    @Test
    public void testClasificaB12() throws EdadErroneaException, GeneroErroneoException
    {
        Assertions.assertThrows(GeneroErroneoException.class,()-> {
            Poblacion.clasifica(70, '?');
        });
    }
}