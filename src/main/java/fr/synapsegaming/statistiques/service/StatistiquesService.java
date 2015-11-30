package fr.synapsegaming.statistiques.service;

import java.util.List;

import fr.synapsegaming.user.entity.Clazz;
import fr.synapsegaming.user.entity.Race;
import fr.synapsegaming.user.entity.Specialization;
import fr.synapsegaming.user.entity.User;

public interface StatistiquesService {
	
	
	public List<Clazz> getClazzMostPlayed();
	
	public List<Race> getRaceMostPlayed();
	
	public List<Specialization> getSpecializationMostPlayed();
	
	public List<User> getUsersWithoutPicture();
	
	public List<User> getUsersMostActive();
	
}
