package geiffel.da4.issuetracker.projet;




import geiffel.da4.issuetracker.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class ProjetServiceTest {

    private ProjetService projetService;
    private List<Projet> projets;


    @BeforeEach
    void setUp(){
        List<Projet> projets = new ArrayList<>(){{
            add(new Projet(1L,"test"));
            add(new Projet(2L,"test"));
            add(new Projet(3L,"test"));
            add(new Projet(4L, "test"));
        }};
        projetService = new ProjetLocalService(projets);
    }


    @Test
    void testGetAll(){
        List<Projet> lesProjets = projetService.getAll();
        assertEquals(4, lesProjets.size());
    }
/*
    @Test
    void testGetByID(){
        assertAll(
                () -> assertEquals(projets.get(4), projetService.getById(3L)),
                () -> assertEquals(projets.get(0), projetService.getById(1L))
        );


    }

 */
}
