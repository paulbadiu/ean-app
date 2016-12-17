package main.api.autocomplete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RegionCenterCoordinatesListDAO {

    public List<RegionCenterCoordinates> getRegion(String region) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

        List<RegionCenterCoordinates> rcclList = new ArrayList<>();
        Database db = new Database();
        Connection connection = db.getConnection();

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM regioncentercoordinateslist WHERE RegionName like ? LIMIT 4");
        ps.setString(1, region + "%");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            RegionCenterCoordinates item = new RegionCenterCoordinates();
            item.setRegionId(rs.getInt("RegionId"));
            item.setRegionName(rs.getString("RegionName"));
            item.setCenterlatitude(rs.getDouble("CenterLatitude"));
            item.setCenterlongitude(rs.getDouble("CenterLongitude"));
            rcclList.add(item);
        }
        return rcclList;
    }
}
