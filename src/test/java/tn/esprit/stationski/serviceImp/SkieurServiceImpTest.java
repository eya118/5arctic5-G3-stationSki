package tn.esprit.stationski.serviceImp;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.stationski.entities.Skieur;
import tn.esprit.stationski.serviceInterface.IskieurService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import static org.mockito.Mockito.*;
@SpringBootTest
@ExtendWith(MockitoExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)

class SkieurServiceImpTest {
    @Autowired
    private IskieurService iskieurService ;


    @Mock
    private IskieurService iskieurServicemock;

    @InjectMocks
    private SkieurServiceImp skieurServiceImp;
    @Test
    void retrieveAllSkieurs() {
    }

    @Test
    void addSkieur() {

        Skieur skieur = new Skieur();
        skieur.setNomS("eya");
        iskieurService.addSkieur(skieur);
        Skieur retrievskieur = iskieurService.retrieveSkieur(skieur.getNumSkieur());
        assertNotNull(retrievskieur);
        assertEquals("eya",retrievskieur.getNomS());

    }

    @Test
    public void testAddSkieurMockito() {
        // Arrange
        Skieur skieur = new Skieur();
        skieur.setNomS("John");

        // Mock the behavior of the service
        when(iskieurServicemock.addSkieur(skieur)).thenReturn(skieur);

        // Act
        Skieur result = iskieurServicemock.addSkieur(skieur); // Call the service method

        // Assert
        assertEquals(skieur, result); // Validate that the returned object is the same as the input
        verify(iskieurServicemock, times(1)).addSkieur(skieur); // Verify that the method was called once
    }
    @Test
    void updateSkieur() {
    }

    @Test
    void retrieveSkieur() {
    }

    @Test
    void removeSkieur() {
    }

    @Test
    void addSkierAndAssignToCourse() {
    }
}