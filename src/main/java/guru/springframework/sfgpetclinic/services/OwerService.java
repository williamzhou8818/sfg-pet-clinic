package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwerService {
	
	  Owner findByLastName(String lastName);
	
	  Owner findById(Long id);
	  
	  Owner save(Owner owner);
	  
	  Set<Owner> findAll(); 	  
	  

}
