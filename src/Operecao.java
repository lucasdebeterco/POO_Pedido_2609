import java.util.Date;

public class Operecao {
    private Date dtInicio;
    private Date dtFim;

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    @Override
    public String toString() {
        return "Operecao{" +
                "dtInicio=" + dtInicio +
                ", dtFim=" + dtFim +
                '}';
    }
}
