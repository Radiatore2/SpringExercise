package com.example.EXBonus4.Controllers;

import com.example.EXBonus4.Entity.Clienti;
import com.example.EXBonus4.Services.ClientiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clienti")
public class ClientiController {

	@Autowired
	private ClientiService clientiService;

	@PostMapping("/new-clienti")
	public Clienti createClente(@RequestBody Clienti cliente){
		return clientiService.createCliente(cliente);
	}

	@GetMapping("/all-clienti")
	public List<Clienti> getAllClienti(){
		return clientiService.getAllCliente();
	}

	@GetMapping("/get-cliente/{id}")
		public Optional<Clienti> getClientiById(@PathVariable Long idCliente){
		return clientiService.getClienteById(idCliente);
	}

	@PutMapping("/modify-cliente")
	public Clienti modifyClienteById(@PathVariable Long idCliente, @RequestBody Clienti cliente) throws Exception{
		return clientiService.modifyClienteById(idCliente, cliente);
	}

	@DeleteMapping("/delete-cliente/{id}")
	public void deleteClienteById(@PathVariable Long idCliente){
		clientiService.deleteClienteById(idCliente);
	}
}
