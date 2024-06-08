public class Individual extends Competencia {
    String recordMundial, recordPanamericano, observaciones;

    public Individual() {

    }

    public Individual(String disciplina, String rama, String categoria, String fecha, String hora, String ganador,
            String segundoLugar, String tercerLugar, String etapa, String sede, String recordMundial,
            String recordPanamericano,
            String observaciones) {
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
        this.recordMundial = recordMundial;
        this.recordPanamericano = recordPanamericano;
        this.observaciones = observaciones;

    }

    public String getRecordMundial() {
        return recordMundial;
    }

    public void setRecordMundial(String recordMundial) {
        this.recordMundial = recordMundial;
    }

    public String getRecordPanamericano() {
        return recordPanamericano;
    }

    public void setRecordPanamericano(String recordPanamericano) {
        this.recordPanamericano = recordPanamericano;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
