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
