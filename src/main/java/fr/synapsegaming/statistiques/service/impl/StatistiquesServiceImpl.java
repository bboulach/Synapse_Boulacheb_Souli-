package fr.synapsegaming.statistiques.service.impl;

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
		return clazzDao.listMostPlayed( MOST_PLAYED_CLASSES);
	}
	
	@Override
	public List<Race> getRaceMostPlayed() {
		return raceDao.listMostPlayed( MOST_PLAYED_RACES);
	}
	
	@Override
	public List<Specialization> getSpecializationMostPlayed() {
		return specializationDao.listMostPlayed( MOST_PLAYED_SPECIALIZATION);
	}
	
	@Override
	public List<User> getUsersWithoutPicture() {
		return userDao.listUsersWithoutPicture();
	}
	
	@Override
	public List<User> getUsersMostActive() {
		List<User> test = userDao.listUsersMostActive(NB_USER_MOST_ACTIVE);
		if(test == null)
			System.out.println("La liste userActive est vide.");
		return test;
	}
	
}
