package dao;

import model.MapPoint;

import java.util.List;

public interface MapPointDAO {

    MapPoint create(MapPoint mapPoint);

    MapPoint findById(int id);

    List<MapPoint> findAll();

    MapPoint update(MapPoint mapPoint);

    boolean delete(MapPoint mapPoint);

}
