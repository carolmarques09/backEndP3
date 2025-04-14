package med.voll.api.medico;

public class Medico {
    private String telefone;

    public Medico(DadosCadastroMedico dados) {
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

    public Long getId() {
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.telefone() != null) {
            this.telefone = dados.telefone();
        }
        if (dados.endereco() != null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }
}
