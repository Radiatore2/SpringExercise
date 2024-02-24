package com.example.demoIDUHDSHUDH;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ControllerProdotto {

	List<Prodotto> listaProdotti = new ArrayList<>();

	public ControllerProdotto(){
		listaProdotti.add(new Prodotto(1, "Pane", 1.99));
		listaProdotti.add(new Prodotto(2, "Carne", 2.99));
		listaProdotti.add(new Prodotto(3, "Frutta", 0.99));
	}

	@GetMapping("/tuttiProdotti")
	public List<Prodotto> tuttiProdotti(){
		return listaProdotti;
	}
	@GetMapping("/prodotto/{id}")
	public Prodotto prodottoId(@PathVariable Integer id){
		for (Prodotto prodotto : listaProdotti){
			if (prodotto.getId().equals(id)){
				return prodotto;
			}
		}
		return null;
	}
}
