package com.unab.desarrollo.springdata.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.desarrollo.Dao.PersonaDao;

@Controller

public class ControllerPersona {
	@Autowired
	private PersonaDao personadao;
@GetMapping("/")
public String inicio() {
var persona = personadao.findAll();

for(var consulta: persona) {
	System.out.print(consulta.getNombre());
}
	 
	 return "index";
 }
}
