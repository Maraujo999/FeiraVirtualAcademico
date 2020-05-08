package br.com.senacrio.feiravirtual.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.senacrio.feiravirtual.domain.Responsavel;
import br.com.senacrio.feiravirtual.repository.ResponsavelRepository;

@Service
public class ResponsavelService {

	@Autowired
	private ResponsavelRepository responsavelRepository;

	public Iterable<Responsavel> searchForResponsible() {
		Iterable<Responsavel> resp = responsavelRepository.findAll();
		return resp;
	}

	public List<Responsavel> searchAll() {
		return responsavelRepository.findAll();
	}

	public Responsavel save(Responsavel responsavel) {
		return responsavelRepository.save(responsavel);
	}

	public List<Responsavel> saveAll(List<Responsavel> responsaveis) {
		return responsavelRepository.saveAll(responsaveis);
	}

}
