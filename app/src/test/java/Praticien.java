import java.io.Serializable;

public class Praticien implements Serializable{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getPra_coefnotoriete() {
        return pra_coefnotoriete;
    }

    public void setPra_coefnotoriete(int pra_coefnotoriete) {
        this.pra_coefnotoriete = pra_coefnotoriete;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    private int id;
    private String nom;
    private String prenom;
    private String diplome;
    private String tel;
    private int pra_coefnotoriete;
    private String mail;

    public Praticien(int id, String nom, String prenom, String diplome, String tel, int pra_coefnotoriete, String mail) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.diplome = diplome;
        this.tel = tel;
        this.pra_coefnotoriete = pra_coefnotoriete;
        this.mail = mail;
    }
}
