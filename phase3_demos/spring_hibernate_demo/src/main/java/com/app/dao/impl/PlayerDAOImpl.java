package com.app.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.dao.PlayerDAO;
import com.app.model.Player;

public class PlayerDAOImpl implements PlayerDAO {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public Player addPlayer(Player player) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(player);
		transaction.commit();
		session.close();
		return player;
	}

	@Override
	public Player getPlayerById(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Player p = (Player) session.get(Player.class, id);
		transaction.commit();
		session.close();
		return p;
	}

	@Override
	public Player updatePlayer(Player player) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(player);
		transaction.commit();
		session.close();
		return player;
	}

	@Override
	public void deletePlayer(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Player p = new Player();
		p.setId(id);
		session.delete(p);
		transaction.commit();
		session.close();

	}

	@Override
	public List<Player> getAllPlayers() {
		Session session=factory.openSession();
		Query query=session.createQuery("from com.app.model.Player");
		List<Player> players=query.list();
		session.close();
		return players;
	}

	@Override
	public List<Player> getPlayersByAge(int age) {
		//Assignment
		return null;
	}

	@Override
	public List<Player> getPlayersByCity(String city) {
		//Assignment
		return null;
	}

}
