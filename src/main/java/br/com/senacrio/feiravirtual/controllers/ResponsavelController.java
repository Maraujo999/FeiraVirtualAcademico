package br.com.senacrio.feiravirtual.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senacrio.feiravirtual.domain.Responsavel;
import br.com.senacrio.feiravirtual.service.EmpresaService;
import br.com.senacrio.feiravirtual.service.ResponsavelService;

@Controller
@RequestMapping("/responsavel")
public class ResponsavelController {

	@Autowired
	private ResponsavelService responsavelService;

	@Autowired
	private EmpresaService empresaService;

	@GetMapping("/listarResponsavel")
	public ModelAndView listarResponsavel() {
		ModelAndView mv = new ModelAndView("responsavel/listarResponsavel");
		mv.addObject("responsavel", responsavelService.searchForResponsible());
		return mv;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrarResponavel() {
		ModelAndView mv = new ModelAndView("responsavel/cadastraResponsavel");
		mv.addObject("empresas", empresaService.buscarTodasEmpresas());
		mv.addObject("responsavel", new Responsavel());
		return mv;

	}

	@PostMapping("/salvar")
	public ModelAndView salvarResponsavel(Responsavel responsavel) {
		responsavelService.save(responsavel);
		return listarResponsavel();
	}

}
