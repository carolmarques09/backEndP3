package med.voll.api.medico;

import jakarta.transaction.Transactional;
import med.voll.api.controler.Valid;
import med.voll.api.endereco.DadosEndereco;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
    public String telefone() {
    }
}