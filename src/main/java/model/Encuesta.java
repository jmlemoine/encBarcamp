package model;

import javax.persistence.*;

@Entity
@Table(name = "encuest")
public class Encuesta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "pregunta1")
    private int pregunta1;

    @Column(name = "pregunta2")
    private int pregunta2;

    @Column(name = "pregunta3")
    private int pregunta3;

    @Column(name = "pregunta4")
    private int pregunta4;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(int pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public int getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(int pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public int getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(int pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public int getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(int pregunta4) {
        this.pregunta4 = pregunta4;
    }

}
