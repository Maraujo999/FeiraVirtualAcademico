package br.com.senacrio.feiravirtual.controllers;

import br.com.senacrio.feiravirtual.domain.Empresa;
import br.com.senacrio.feiravirtual.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;

	@GetMapping("/listarEmpresas")
	public ModelAndView listarTodosEmpresas() {
		ModelAndView mv = new ModelAndView("empresa/listarEmpresa");
		mv.addObject("empresas", empresaService.buscarTodasEmpresas());
		return mv;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrarEmpresa() {
		ModelAndView mv = new ModelAndView("empresa/cadastraEmpresa");
		mv.addObject("empresa", new Empresa());
		return mv;
	}

	@PostMapping("/excluir/{id}")
	public ModelAndView excluirAluno(@PathVariable("id") int id) {
		empresaService.excluirEmpresa(id);
		return listarTodosEmpresas();
	}

	@PostMapping("/salvar")
	public ModelAndView salvarEmpresa(Empresa empresa) {
		empresaService.salvar(empresa);
		return listarTodosEmpresas();
	}
}