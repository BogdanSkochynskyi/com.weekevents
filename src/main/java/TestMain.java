import com.weekevents.dao.MapPointDAO;
import com.weekevents.dao.MapPointDAOImpl;
import com.weekevents.model.MapPoint;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");

        applicationContext.registerShutdownHook();

        MapPointDAO dao = (MapPointDAOImpl) applicationContext.getBean("mapPointDaoImpl");

        MapPoint mapPoint = new MapPoint();
        mapPoint.setLat(115.123);
        mapPoint.setLng(225.343);
        dao.create(mapPoint);
    }
}
