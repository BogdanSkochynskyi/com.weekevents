package com.weekevents.dao;

import com.weekevents.model.MapPoint;

import java.util.List;

public interface MapPointDAO {

    void create(MapPoint mapPoint);

    MapPoint findById(int id);

    List<MapPoint> findAll();

    void update(MapPoint mapPoint);

    void delete(MapPoint mapPoint);

}
