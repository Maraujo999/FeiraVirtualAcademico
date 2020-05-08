package br.com.senacrio.feiravirtual.service;

import br.com.senacrio.feiravirtual.domain.Stand;
import br.com.senacrio.feiravirtual.repository.StandRepository;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StandService {

	@Autowired
	private StandRepository standRepository;

	public Iterable<Stand> buscarTodosStands() {
		Iterable<Stand> stand = standRepository.findAll();
		return stand;

	}

	public Stand buscaPorID(Integer id) throws ObjectNotFoundException{
		Optional<Stand> stand = standRepository.findById(id);
		return stand.orElseThrow(() -> new ObjectNotFoundException("Stand não encontrado. id: " +id));
	}

	public Stand salvar(Stand stand) {
		return standRepository.save(stand);
	}

	public void excluir(int id) {
		standRepository.deleteById(id);
	}

	public Stand salvarAlteracao(Stand standAlterado) throws ObjectNotFoundException {
		Stand stand = buscaPorID(standAlterado.getStand_id());
		stand.setStand_id(standAlterado.getStand_id());
		stand.setStand_nome(standAlterado.getStand_nome());
		stand.setStand_link_apresentacao(standAlterado.getStand_link_apresentacao());
		stand.setStand_link_chat(standAlterado.getStand_link_chat());
		stand.setStand_status(standAlterado.getStand_status());
		stand.setStand_link_logomarca(standAlterado.getStand_link_logomarca());
		stand.setEmpresa(standAlterado.getEmpresa());
		return salvar(stand);
	}

}
