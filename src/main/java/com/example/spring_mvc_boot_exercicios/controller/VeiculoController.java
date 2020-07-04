package com.example.spring_mvc_boot_exercicios.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.spring_mvc_boot_exercicios.Veiculo;
import com.example.spring_mvc_boot_exercicios.VeiculoRepository;

@Controller
public class VeiculoController {

	@Autowired
	private VeiculoRepository veiculoRep;
	


	@GetMapping("/veiculos")
	public ModelAndView listarVeiculo()
	{
		
		ModelAndView mv =  new ModelAndView("veiculolist");

		List<Veiculo> veiculos = veiculoRep.findAll();
		mv.addObject(new Veiculo());

		mv.addObject("veiculos", veiculos);
		return mv;
	}
	
	@PostMapping("/veiculos")
	public String salvar(Veiculo veiculoN) 
	{
	
		if(!veiculoRep.findById(veiculoN.getId()).isPresent())
		{	

			veiculoRep.save(veiculoN);			
		}
		return "redirect:/veiculos";
	} 
	
}
