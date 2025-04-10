package med.voll.api.medico;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Especialidade especialidade) {



    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}

// no Insomnia, colocar o id e o nome da médica como 12 e Ana Maria Luiza Carlos, a resposta tem que dar 200. 
