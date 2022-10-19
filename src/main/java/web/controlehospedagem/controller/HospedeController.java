package web.controlehospedagem.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.controlehospedagem.model.Hospede;
import web.controlehospedagem.model.Status;
import web.controlehospedagem.pagination.PageWrapper;


@Controller
@RequestMapping("/hospedes")
public class HospedeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HospedeController.class);
//	@Autowired
//	private HospedeRepository hospedeRepository;
//	
//	@Autowired
//	private HospedeService hospedeService;
//	
//	
//	@GetMapping("/abrirpesquisar")
//	public String abrirPesquisar() {
//		return "hospede/pesquisar";
//	}
//	
//	@GetMapping("/pesquisar")
//	public String pesquisar(HospedeFilter filtro, Model model,
//			          @PageableDefault(size = 5) 
//                      @SortDefault(sort = "codigo", direction = Sort.Direction.ASC)
//                      Pageable pageable, HttpServletRequest request) {
//		Page<Hospede> pagina = hospedeRepository.pesquisar(filtro, pageable);
//		PageWrapper<Hospede> paginaWrapper = new PageWrapper<>(pagina, request);
//		model.addAttribute("pagina", paginaWrapper);
//		return "hospede/mostrarhospedes";
//	}
//	
//	@GetMapping("/cadastrar")
//	public String abrirCadastrar(Hospede hospede) {
//		return "hospede/cadastrar";
//	}
//	
//	@PostMapping("/cadastrar")
//	public String cadastrar(@Valid Hospede hospede, BindingResult resultado) {
//		if(resultado.hasErrors()) {
//			logger.info("A hospede recebida para cadastrar não é válida.");
//			logger.info("Erros encontrados:");
//			for (FieldError erro : resultado.getFieldErrors()) {
//				logger.info("{}", erro);
//			}
//			return "hospede/cadastrar";
//		}else {
//			hospedeService.salvar(hospede);
//			return "redirect:/hospedes/cadastrosucesso";
//		}	
//	}
//	
//	@GetMapping("/cadastrosucesso")
//	public String mostrarCadastroSucesso(Model model) {
//		model.addAttribute("mensagem", 
//				"Cadastro de hospede efetuado com sucesso.");
//		return "mostrarmensagem";
//	}
//	
//	@PostMapping("/abriralterar")
//	public String abrirAlterar(Hospede hospede) {
//		return "hospede/alterar";
//	}
//	
//	@PostMapping("/alterar")
//	public String alterar(@Valid Hospede hospede, BindingResult resultado) {
//		if(resultado.hasErrors()) {
//			logger.info("A hospede recebida para alterar não é válida.");
//			logger.info("Erros encontrados:");
//			for (FieldError erro : resultado.getFieldErrors()) {
//				logger.info("{}", erro);
//			}
//			return "hospede/alterar";
//		}else {
//			hospedeService.salvar(hospede);
//			return "redirect:/hospedes/alterarsucesso";
//		}	
//	}
//	
//	@GetMapping("/alterarsucesso")
//	public String mostrarAlterarSucesso(Model model) {
//		model.addAttribute("mensagem", 
//				"Alteração de hospede efetuada com sucesso.");
//		return "mostrarmensagem";
//	}
//	
//	@PostMapping("/confirmarremocao")
//	public String confirmarRemocao(Hospede hospede) {
//		return "hospede/confirmarremocao";
//	}
//	
//	@PostMapping("/remover")
//	public String remover(Hospede hospede) {
//		hospede.setStatus(Status.INATIVO);
//		hospedeService.alterar(hospede);
//		return "redirect:/hospedes/remocaosucesso";
//	}
//	
//	@GetMapping("/remocaosucesso")
//	public String mostrarRemocaoSucesso(Model model) {
//		model.addAttribute("mensagem", 
//				"Remoção de hospede efetuada com sucesso.");
//		return "mostrarmensagem";
//	}

}
