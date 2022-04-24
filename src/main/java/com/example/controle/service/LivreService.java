package com.example.controle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.example.controle.entities.Livre;
import com.example.controle.repos.LivreRepo;

@Service
public class LivreService {
	
	@Autowired
	private LivreRepo repos;
	
	public Livre saveLivre(Livre livre) {
		return repos.save(livre);		
	}
	
	public List<Livre> getLivres(){
		return repos.findAll(Sort.by(Order.asc("titre")));
	}
	
	/*public Livre getLivreById(int id){
	//	return repos.findById(id).orElse(null);
	}*/
	
	public Livre getLivreById(int id){
		Optional<Livre> livre = repos.findById(id);
		if(livre.isPresent()){
			return livre.get();
		}
		throw new RuntimeException("Livre not found");
	}
	
	/*public String deleteLivre(int id) {
	//	repos.deleteById(id);
	//	return "Livre supprimé"+ id;
	}*/
	
	public String deleteLivre(int id) {
		Optional<Livre> livre = repos.findById(id);
		if(livre.isPresent()){
			repos.deleteById(id);
			return "Livre supprimé "+ id;
		}
		throw new RuntimeException("Livre not found");
	}
	
	
	
	public Livre updateLivre(int id, Livre livre) {
		Livre Oldvrs = repos.findById(livre.getId()).orElse(null);
		Oldvrs.setTitre(livre.getTitre());
		//Oldvrs.setMaisonEdit(livre.getMaisonEdit());
		Oldvrs.setDateSortie(livre.getDateSortie());
		Oldvrs.setAuteur(livre.getAuteur());
		Oldvrs.setNbrPage(livre.getNbrPage());
		//Oldvrs.setISBN(livre.getISBN());
		Oldvrs.setDateConsult(livre.getDateConsult());
		Oldvrs.setDispo(livre.isDispo());
		return repos.save(Oldvrs);
	}
	
	
	
	

}
