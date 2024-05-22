package Es3;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String nomeCognome;
    private String email;
    private Date dataIscrizione;

    public Cliente(int codiceCliente, String nomeCognome, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nomeCognome = nomeCognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNomeCognome() {
        return nomeCognome;
    }

    public void setNomeCognome(String nomeCognome) {
        this.nomeCognome = nomeCognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(Date dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
}
