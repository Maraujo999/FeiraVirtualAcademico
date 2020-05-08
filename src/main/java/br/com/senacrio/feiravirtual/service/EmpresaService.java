package br.com.senacrio.feiravirtual.service;


import br.com.senacrio.feiravirtual.domain.Empresa;
import br.com.senacrio.feiravirtual.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	public Iterable<Empresa> buscarTodasEmpresas() {
		Iterable<Empresa> empresa = empresaRepository.findAll();
		return empresa;
	}

	public void excluirEmpresa(int id) {
		empresaRepository.deleteById(id);
	}

	public Empresa salvar(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
}