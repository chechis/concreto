package silicato_gris.myapplication.apoyo;

public class Concreto {

    private int id;
    private int resistencia;
    private int factor;
    private int elemento;
    private int tmn;
    private int pesoConcrto;
    private int pesoSueltoFino;
    private int pesoCompactadoFino;
    private int pesoSueltoGrueso;
    private int pesoCompactadoGrueso;

    public Concreto() {
    }

    public Concreto(int id, int resistencia, int factor, int elemento, int tmn, int pesoConcrto, int pesoSueltoFino, int pesoCompactadoFino, int pesoSueltoGrueso, int pesoCompactadoGrueso) {
        this.id = id;
        this.resistencia = resistencia;
        this.factor = factor;
        this.elemento = elemento;
        this.tmn = tmn;
        this.pesoConcrto = pesoConcrto;
        this.pesoSueltoFino = pesoSueltoFino;
        this.pesoCompactadoFino = pesoCompactadoFino;
        this.pesoSueltoGrueso = pesoSueltoGrueso;
        this.pesoCompactadoGrueso = pesoCompactadoGrueso;
    }

    public Concreto(int resistencia, int factor, int elemento, int tmn, int pesoConcrto, int pesoSueltoFino, int pesoCompactadoFino, int pesoSueltoGrueso, int pesoCompactadoGrueso) {
        this.resistencia = resistencia;
        this.factor = factor;
        this.elemento = elemento;
        this.tmn = tmn;
        this.pesoConcrto = pesoConcrto;
        this.pesoSueltoFino = pesoSueltoFino;
        this.pesoCompactadoFino = pesoCompactadoFino;
        this.pesoSueltoGrueso = pesoSueltoGrueso;
        this.pesoCompactadoGrueso = pesoCompactadoGrueso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public int getTmn() {
        return tmn;
    }

    public void setTmn(int tmn) {
        this.tmn = tmn;
    }

    public int getPesoConcrto() {
        return pesoConcrto;
    }

    public void setPesoConcrto(int pesoConcrto) {
        this.pesoConcrto = pesoConcrto;
    }

    public int getPesoSueltoFino() {
        return pesoSueltoFino;
    }

    public void setPesoSueltoFino(int pesoSueltoFino) {
        this.pesoSueltoFino = pesoSueltoFino;
    }

    public int getPesoCompactadoFino() {
        return pesoCompactadoFino;
    }

    public void setPesoCompactadoFino(int pesoCompactadoFino) {
        this.pesoCompactadoFino = pesoCompactadoFino;
    }

    public int getPesoSueltoGrueso() {
        return pesoSueltoGrueso;
    }

    public void setPesoSueltoGrueso(int pesoSueltoGrueso) {
        this.pesoSueltoGrueso = pesoSueltoGrueso;
    }

    public int getPesoCompactadoGrueso() {
        return pesoCompactadoGrueso;
    }

    public void setPesoCompactadoGrueso(int pesoCompactadoGrueso) {
        this.pesoCompactadoGrueso = pesoCompactadoGrueso;
    }
}
