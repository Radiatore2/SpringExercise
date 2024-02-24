package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")

public class Controller {
	List<Libri> listaLibri = new ArrayList<>();

	public Controller(){
		listaLibri.add(new Libri(1,"Ciliegio in fiore", "Franco Rosso"));
		listaLibri.add(new Libri(2, "Betulla verde", "Marcello Bianchi"));
		listaLibri.add(new Libri(3,"Computer con CD", "Andrea Rossi"));
	}
	@GetMapping("/tutti-libri")
	public List<Libri> fullListBook(){
		return listaLibri;
	}
	@PutMapping("/libro-modificato/{id}")
	public Libri updateBook(@PathVariable int id, @RequestBody Libri updateBook){
		for(Libri libro : listaLibri){
			if(libro.getId() == id){
				libro.setTitolo(updateBook.getTitolo());
				libro.setAutore(updateBook.getAutore());
				return libro;
			}
		}
		return null;
	}
}
