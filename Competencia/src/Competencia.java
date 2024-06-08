public class Competencia {
    String disciplina, rama, categoria, fecha, hora, ganador, segundoLugar, tercerLugar, etapa, sede;

    public Competencia() {

    }

    public Competencia(String disciplina, String rama, String categoria, String fecha, String hora, String ganador,
            String segundoLugar, String tercerLugar, String etapa, String sede) {
        this.disciplina = disciplina;
        this.rama = rama;
        this.categoria = categoria;
        this.fecha = fecha;
        this.hora = hora;
        this.ganador = ganador;
        this.segundoLugar = segundoLugar;
        this.tercerLugar = tercerLugar;
        this.etapa = etapa;
        this.sede = sede;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getRama() {
        return rama;
    }

    public void setRama(String rama) {
        this.rama = rama;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getSegundoLugar() {
        return segundoLugar;
    }

    public void setSegundoLugar(String segundoLugar) {
        this.segundoLugar = segundoLugar;
    }

    public String getTercerLugar() {
        return tercerLugar;
    }

    public void setTercerLugar(String tercerLugar) {
        this.tercerLugar = tercerLugar;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

}
