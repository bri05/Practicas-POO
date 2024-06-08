public class Atletismo extends Individual {
    String prueba, juezArbitro, juezArbitroSalida, juecesLlegada, juecesAuxiliares, cronometradores;
    int hits;
    float tiempoGanador, tiempo2doLugar, tiempo3erLugar;

    public Atletismo() {

    }

    public Atletismo(String disciplina, String rama, String categoria, String fecha, String hora, String ganador,
            String segundoLugar, String tercerLugar, String etapa, String sede, String recordMundial,
            String recordPanamericano,
            String observaciones, String prueba, String juezArbitro, String juezArbitroSalida, String juecesLlegada,
            String juecesAuxiliares, String cronometradores, int hits, float tiempoGanador, float tiempo2doLugar,
            float tiempo3erLugar) {
        super.disciplina = disciplina;
        super.rama = rama;
        super.categoria = categoria;
        super.fecha = fecha;
        super.hora = hora;
        super.ganador = ganador;
        super.segundoLugar = segundoLugar;
        super.tercerLugar = tercerLugar;
        super.etapa = etapa;
        super.sede = sede;
        super.recordMundial = recordMundial;
        super.recordPanamericano = recordPanamericano;
        super.observaciones = observaciones;
        this.prueba = prueba;
        this.juezArbitro = juezArbitro;
        this.juezArbitroSalida = juezArbitroSalida;
        this.juecesLlegada = juecesLlegada;
        this.juecesAuxiliares = juecesAuxiliares;
        this.cronometradores = cronometradores;
        this.hits = hits;
        this.tiempoGanador = tiempoGanador;
        this.tiempo2doLugar = tiempo2doLugar;
        this.tiempo3erLugar = tiempo3erLugar;

    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getJuezArbitro() {
        return juezArbitro;
    }

    public void setJuezArbitro(String juezArbitro) {
        this.juezArbitro = juezArbitro;
    }

    public String getJuezArbitroSalida() {
        return juezArbitroSalida;
    }

    public void setJuezArbitroSalida(String juezArbitroSalida) {
        this.juezArbitroSalida = juezArbitroSalida;
    }

    public String getJuecesLlegada() {
        return juecesLlegada;
    }

    public void setJuecesLlegada(String juecesLlegada) {
        this.juecesLlegada = juecesLlegada;
    }

    public String getJuecesAuxiliares() {
        return juecesAuxiliares;
    }

    public void setJuecesAuxiliares(String juecesAuxiliares) {
        this.juecesAuxiliares = juecesAuxiliares;
    }

    public String getCronometradores() {
        return cronometradores;
    }

    public void setCronometradores(String cronometradores) {
        this.cronometradores = cronometradores;
    }

    public int getHits() {
        return hits;
    }

    public void sethits(int hits) {
        this.hits = hits;
    }

    public float getTiempoGanador() {
        return tiempoGanador;
    }

    public void setTiempoGanador(float tiempoGanador) {
        this.tiempoGanador = tiempoGanador;
    }

    public float getTiempo2doLugar() {
        return tiempo2doLugar;
    }

    public void setTiempo2doLugar(float tiempo2doLugar) {
        this.tiempo2doLugar = tiempo2doLugar;
    }

    public float getTiempo3erLugar() {
        return tiempo3erLugar;
    }

    public void setTiempo3erLugar(float tiempo3erLugar) {
        this.tiempo3erLugar = tiempo3erLugar;
    }

    public void NvoRecordMundial() {
        System.out.println("Se batió un nuevo Record Mundial en Atletismo");
    }

    public void NvoRecordPanam() {
        System.out.println("Se batió un nuevo Record Panamericano en Altletismo");
    }

    public void setDatosPrueba() {
        System.out.println("Se ingresaron los datos de la prueba");
    }

    public void getDatosPrueba() {
        System.out.println("Los datos ingresados de la prueba son: ");
    }

    public void setResultadosFinales() {
        System.out.println("Se ingresaron los resultados finales");
    }

    public void getResultadosFinales() {
        System.out.println("Estos son los resultados finales");
    }

}
