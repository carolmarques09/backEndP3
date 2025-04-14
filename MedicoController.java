package med.voll.api.controler;

import jakarta.transaction.Transactional;
import med.voll.api.medico.DadosAtualizacaoMedico;
import med.voll.api.medico.DadosCadastroMedico;
import med.voll.api.medico.DadosListagemMedico;
import med.voll.api.medico.Medico;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Scanner;
Scanner repository = null;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(Pageable paginacao) {
        return repository.findByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    public MedicoController() {
    }
}

public void main() {
}

@PutMapping
@Transactional
public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
    var medico = repository.getReferenceById(dados.id());
    medico.atualizarInformacoes(dados);
}


@DeleteMapping("/{id}")
@Transactional
public void excluir(@PathVariable Long id) {
    var medico = repository.getReferenceById(id);
    medico.excluir();
}