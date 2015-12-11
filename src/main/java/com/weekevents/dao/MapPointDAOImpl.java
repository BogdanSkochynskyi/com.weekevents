package com.weekevents.dao;

import com.weekevents.model.MapPoint;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class MapPointDAOImpl implements MapPointDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void create(MapPoint mapPoint) {
        sessionFactory.getCurrentSession().save(mapPoint);
    }

    @Transactional
    public MapPoint findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(MapPoint.class);
        criteria.add(Restrictions.eq("id", id));
        return (MapPoint) criteria.uniqueResult();
    }

    @Transactional
    @SuppressWarnings("unchecked")
    public List<MapPoint> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(MapPoint.class).list();
    }

    public void update(MapPoint mapPoint) {
        sessionFactory.getCurrentSession().update(mapPoint);
    }

    public void delete(MapPoint mapPoint) {
        sessionFactory.getCurrentSession().delete(mapPoint);
    }
}
