package br.com.senacrio.feiravirtual.controllers;


import br.com.senacrio.feiravirtual.domain.Stand;
import br.com.senacrio.feiravirtual.service.EmpresaService;
import br.com.senacrio.feiravirtual.service.StandService;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/stand")
public class StandController {

	@Autowired
	private EmpresaService empresaService;

	@Autowired
	private StandService standService;

	@GetMapping("/listarStands")
	public ModelAndView listarTodosStands() {
		ModelAndView mv = new ModelAndView("stand/listarStand");
		mv.addObject("stands", standService.buscarTodosStands());
		return mv;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrarStand() {
		ModelAndView mv = new ModelAndView("stand/cadastraStand");
		mv.addObject("empresas", empresaService.buscarTodasEmpresas());
		mv.addObject("stand", new Stand());
		return mv;
	}

	@PostMapping("/salvar")
	public ModelAndView salvarStand(Stand stand) {
		standService.salvar(stand);
		return listarTodosStands();
	}

	@GetMapping("/excluir/{id}")
	public ModelAndView excluirAluno(@PathVariable("id") int id) {
		standService.excluir(id);
		return listarTodosStands();
	}

	@GetMapping("/alterar/{id}")
	public ModelAndView alterarStand(@PathVariable("id") Integer idStand) throws ObjectNotFoundException {
		ModelAndView mv = new ModelAndView("stand/alteraStand");
		mv.addObject("empresas", empresaService.buscarTodasEmpresas());
		mv.addObject("stand", standService.buscaPorID(idStand));
		return mv;
	}

	@PostMapping("/alterar")
	public ModelAndView alterar(Stand standAlterado) throws ObjectNotFoundException{
		standService.salvarAlteracao(standAlterado);
		return listarTodosStands();
	}

}
