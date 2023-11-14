package geiffel.da4.issuetracker.projet;

public class Projet {

    private Long idProjet;
    private String libelle;

    public Projet(Long idProjet, String libelle) {

        this.idProjet = idProjet;
        this.libelle = libelle;
    }

    public Long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
