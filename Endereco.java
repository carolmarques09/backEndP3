package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null) {
            this.cep = dados.cep();
        }
        if (dados.uf() != null) {
            this.uf = dados.uf();
            if (dados.cidade() != null) {
                this.cidade = dados.cidade();
            }
            if (dados.numero() != null) {
                this.numero = dados.numero();
            }
            if (dados.complemento() != null) {
                this.complemento = dados.complemento();
            }
        }
    }
}
