package com.example.EXBonus4.Services;

import com.example.EXBonus4.Entity.Clienti;
import com.example.EXBonus4.Repositories.ClientiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientiService {
	 @Autowired
	private ClientiRepository clientiRepository;

	 public Clienti createCliente (Clienti clienti){
		 return clientiRepository.save(clienti);
	 }

	 public List<Clienti> getAllCliente(){
		 return clientiRepository.findAll();
	 }

	 public Optional<Clienti> getClienteById(Long idCliente) {
		 if (clientiRepository.existsById(idCliente)) {
			 return clientiRepository.findById(idCliente);
		 }
		 throw new RuntimeException("Cliente id non trovato " + idCliente);
	 }

	 public Clienti modifyClienteById(Long idCliente, Clienti cliente){
		 if(clientiRepository.existsById(idCliente)){
			 Clienti newCliente = new Clienti();
			 newCliente.setNome(cliente.getNome());
			 newCliente.setCognome(cliente.getCognome());
			 newCliente.setEmail(cliente.getEmail());
			 return clientiRepository.save(cliente);
		 }
		 throw new RuntimeException("Cliente id non trovato " + idCliente);
	 }

	 public void deleteClienteById(Long idCliente) {
		 if (clientiRepository.existsById(idCliente)) {
			 clientiRepository.deleteById(idCliente);
		 }
		 throw new RuntimeException("Cliente id non trovato " + idCliente);
	 }
}
