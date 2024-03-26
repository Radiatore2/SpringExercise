package com.example.Progetto3Prova.Users;

import com.example.Progetto3Prova.Users.Users;
import com.example.Progetto3Prova.Users.UsersRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UsersService {
	private UsersRepository usersRepository;
	//Cancellare la propria utenza (Customer)
	//      ------ METODO------

	//Modificare i dati dell’utente (Customer)
	//      ------ METODO------
	//Cancellare un utente (Admin)
	public void deleteACustomers(@PathVariable Long id){
		usersRepository.deleteById(id);
	}

	//Modificare un utente (Admin)
	private Users updateUserCustomer(@PathVariable Long id, @RequestBody Users user){
		Optional<Users> optionalUser = usersRepository.findById(id);
		if (optionalUser.isPresent()){
			user.setName(user.getName());
			user.setSurname(user.getSurname());
			user.setPhoneNumber(user.getPhoneNumber());
			user.setEmail(user.getEmail());
			user.setPassword(user.getPassword());
			return usersRepository.save(user);
		}else return new Users();
	}

	//Cancellare un venditore (Admin)
	public void deleteASeller(@PathVariable Long id){
		usersRepository.deleteById(id);
	}

	//Modificare un venditore (Admin)
	private Users updateUserSeller(@PathVariable Long id, @RequestBody Users user){
		Optional<Users> optionalUser = usersRepository.findById(id);
		if (optionalUser.isPresent()){
			user.setName(user.getName());
			user.setSurname(user.getSurname());
			user.setPhoneNumber(user.getPhoneNumber());
			user.setEmail(user.getEmail());
			user.setPassword(user.getPassword());
			return usersRepository.save(user);
		}else return new Users();
	}
}
