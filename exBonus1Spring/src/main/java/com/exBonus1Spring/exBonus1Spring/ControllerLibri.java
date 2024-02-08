package com.exBonus1Spring.exBonus1Spring;

import org.springframework.web.bind.annotation.*;

import javax.swing.border.LineBorder;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerLibri {

	List <Libro> listaLibri = new ArrayList<>();

	public ControllerLibri(){
		   listaLibri.add(new Libro(1,"Codice da Vinci", "Dan Brown", "giallo"));
		   listaLibri.add(new Libro(2,"Il signore degli anelli", "J.Tolkien", "fantasy"));
			listaLibri.add(new Libro(1,"1984", "George Orwell","fantascienza"));
	}

	@GetMapping("/libri")
	public List<Libro> fullList(){
		return fullList();
	}
	@GetMapping("/libri/{id}")
	public List<Libro> bookId(@PathVariable int id){

		for(Libro libro : listaLibri){
			if (libro.getId() == id){
				return listaLibri;
			}
		}
		return null;
	}
	@GetMapping("/libri/genere/{genere}")
	public List<Libro> bookGenere(@PathVariable String genere) {

		for (Libro libro : listaLibri) {
			if (libro.getGenere().equals(genere)) {
				return listaLibri;
			}
		}
		return null;
	}
	@PostMapping("/libri/add")
	public String addBook(@RequestBody Libro addedBook){
		listaLibri.add(addedBook);
		return addedBook.toString();
	}
}
