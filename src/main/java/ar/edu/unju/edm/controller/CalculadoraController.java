package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Calculadora;
@Controller
public class CalculadoraController {
	@Autowired
	Calculadora unaCalculadora;
	@GetMapping("/calculadora")
	public String Menu( ) {
		return "operacionesmen";
	}
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") double num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		double resultadoSuma = unaCalculadora.sumar();
		
		ModelAndView modelView = new ModelAndView("resultados");
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;
	}
	@GetMapping("/calculoResta")
	public ModelAndView getCalculoResta(@RequestParam (name = "num1") double num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		double resultadoResta = unaCalculadora.restar();
		
		ModelAndView modelView = new ModelAndView("resultados");
		modelView.addObject("resultadoResta", resultadoResta);
		
		return modelView;
	}
	@GetMapping("/calculoDivision")
	public ModelAndView getCalculoDivision(@RequestParam (name = "num1") double num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		double resultadoDivision = unaCalculadora.div();
		
		ModelAndView modelView = new ModelAndView("resultados");
		modelView.addObject("resultadoDivision", resultadoDivision);
		
		return modelView;
	}
	@GetMapping("/calculoMulti")
	public ModelAndView getCalculoMulti(@RequestParam (name = "num1") double num1 , @RequestParam (name = "num2") double num2){
		
		unaCalculadora.setNum1(num1);
		unaCalculadora.setNum2(num2);
		
		double resultadoMulti = unaCalculadora.multi();
		
		ModelAndView modelView = new ModelAndView("resultados");
		modelView.addObject("resultadoMulti", resultadoMulti);
		
		return modelView;
	}
}
