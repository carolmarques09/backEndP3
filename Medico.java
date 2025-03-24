package med.voll.api.medico;

public class Medico {
    public Medico() {
    }

    public String getNome() {
        return "";
    }


    public String getEmail() {
        return "";
    }


    public String getCrm() {
        return "";
    }


    public Especialidade getEspecialidade() {
        return null;
    }

    private Long id;
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private Endereco endereco;
}
