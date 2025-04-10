package med.voll.api.endereco;

public record DadosEndereco(String logradouro, String bairro, String cep, String cidade, String uf, String complemento, String numero) {
}

// Pendente: fazer os getters, setters e construtores

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
