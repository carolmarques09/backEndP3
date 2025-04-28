package med.voll.api.medico;

import jakarta.persistence.Embedded;
import lombok.Setter;

public class Medico {
    @Setter
    private String telefone;

    public Medico(DadosCadastroMedico dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
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

    @Setter
    private Long id;
    @Setter
    private String nome;
    @Setter
    private String email;
    @Setter
    private String crm;
    @Setter
    private Especialidade especialidade;
    @Setter
    @Embedded
    private Endereco endereco;
    private Boolean ativo;

    public Long getId() {
        return 0L;
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

    public void setAtivo(Boolean ativo) {
        this.ativo = true;
    }

    public void excluir() {
        this.ativo = false;
    }

    public String getTelefone() {
    }

    public String getEndereco() {
    }
}
