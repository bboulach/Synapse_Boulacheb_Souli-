package fr.synapsegaming.statistiques.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.synapsegaming.statistiques.service.StatistiquesService;

import fr.synapsegaming.user.dao.ClazzDao;
import fr.synapsegaming.user.dao.RaceDao;
import fr.synapsegaming.user.dao.SpecializationDao;
import fr.synapsegaming.user.dao.UserDao;
import fr.synapsegaming.user.entity.Clazz;
import fr.synapsegaming.user.entity.Race;
import fr.synapsegaming.user.entity.Specialization;
import fr.synapsegaming.user.entity.User;






@Service("StatistiquesService")
@Transactional
public class StatistiquesServiceImpl implements StatistiquesService {
	
	@Autowired
    private ClazzDao clazzDao;
	@Autowired
	private RaceDao raceDao;
	@Autowired
	private SpecializationDao specializationDao;
	@Autowired
	private UserDao userDao;
	
	private static final int MOST_PLAYED_CLASSES = 5;
	private static final int MOST_PLAYED_RACES = 5;
	private static final int MOST_PLAYED_SPECIALIZATION = 5;
	private static final int NB_USER_MOST_ACTIVE = 5;
	

	@Override
	public List<Clazz> getClazzMostPlayed() {
		List<Clazz> test = clazzDao.listMostPlayed( MOST_PLAYED_CLASSES);
		if( test.isEmpty() == true){
			System.out.println("Liste classe les plus joué vide");
		}
		return test;
	}
	
	@Override
	public List<Race> getRaceMostPlayed() {
		List<Race> test = raceDao.listMostPlayed( MOST_PLAYED_RACES);
		if( test.isEmpty() == true){
			System.out.println("Liste Race les plus joué vide");
		}
		return test;
	}
	
	@Override
	public List<Specialization> getSpecializationMostPlayed() {
		List<Specialization> test = specializationDao.listMostPlayed( MOST_PLAYED_SPECIALIZATION);
		if( test.isEmpty() == true){
			System.out.println("Liste des spécialisations les plus joué vide");
		}
		return test;
	}
	
	@Override
	public List<User> getUsersWithoutPicture() {
		List<User> test = userDao.listUsersWithoutPicture();
		if( test.isEmpty() == true){
			System.out.println("Liste des utilisateurs sans avatar vide");
		}
		return test;
	}
	
	@Override
	public List<User> getUsersMostActive() {
		List<User> test = userDao.listUsersMostActive(NB_USER_MOST_ACTIVE);
		if( test.isEmpty() == true){
			System.out.println("Liste des utilisateurs les plus actifs vide");
		}
		return test;
	}
	
}
