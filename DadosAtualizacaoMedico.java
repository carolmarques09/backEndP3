package med.voll.api.medico;

import org.antlr.v4.runtime.misc.NotNull;

public record DadosAtualizacaoMedico(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {
}
