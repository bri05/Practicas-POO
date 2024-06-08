public class Natacion extends Individual {
    String estilo, oficialMayor, juecesSalida, juecesNado, inspectoresVueltas;
    float distancia, tiempoGanador, tiempo2doLugar, tiempo3erLugar;
    int hits;

    public Natacion() {

    }

    public Natacion(String disciplina, String rama, String categoria, String fecha, String hora, String ganador,
            String segundoLugar, String tercerLugar, String etapa, String sede, String recordMundial,
            String recordPanamericano,
            String observaciones, String estilo, float distancia, float tiempoGanador, float tiempo2doLugar,
            float tiempo3erLugar, String oficialMayor, String juecesSalida,
            String juecesNado, String inspectoresVueltas, int hits) {
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
        this.estilo = estilo;
        this.distancia = distancia;
        this.oficialMayor = oficialMayor;
        this.juecesSalida = juecesSalida;
        this.juecesNado = juecesNado;
        this.inspectoresVueltas = inspectoresVueltas;
        this.hits = hits;
        this.tiempoGanador = tiempoGanador;
        this.tiempo2doLugar = tiempo2doLugar;
        this.tiempo3erLugar = tiempo3erLugar;

    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getOficialMayor() {
        return oficialMayor;
    }

    public void setOficialMayor(String oficialMayor) {
        this.oficialMayor = oficialMayor;
    }

    public String getJuecesSalida() {
        return juecesSalida;
    }

    public void setJuecesSalida(String juecesSalida) {
        this.juecesSalida = juecesSalida;
    }

    public String getJuecesNado() {
        return juecesNado;
    }

    public void setJuecesNado(String juecesNado) {
        this.juecesNado = juecesNado;
    }

    public String getInspectoresVueltas() {
        return inspectoresVueltas;
    }

    public void setInspectoresVueltas(String inspectoresVueltas) {
        this.inspectoresVueltas = inspectoresVueltas;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
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

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void NvoRecordMundial() {
        System.out.println("Se batió un nuevo Record Mundial en Natación");
    }

    public void NvoRecordPanam() {
        System.out.println("Se batió un nuevo Record Panamericano en Natación");
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
