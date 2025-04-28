package med.voll.api.medico;

package.med.voll.api.endereco.DadosEndereco;

public record DadosDetalhamentoMedico(Long id, String nome, String email,
                                      String crm, String telefone, Especialidade especialidade,
                                      Endereco endereco) {
    public DadosDetalhamentoMedico(Medico medico) {
    }
}


