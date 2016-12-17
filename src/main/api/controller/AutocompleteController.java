package main.api.controller;

import main.api.autocomplete.RegionCenterCoordinates;
import main.api.autocomplete.RegionCenterCoordinatesListDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;


@Controller
public class AutocompleteController {

    @Autowired
    private RegionCenterCoordinatesListDAO regionCenterCoordinatesListDAO;

    @RequestMapping(value = "/auto", method = RequestMethod.GET)
    @ResponseBody
    public List<RegionCenterCoordinates> doGet(@RequestParam String term) {
        List<RegionCenterCoordinates> regions = null;
        try {
            regions = regionCenterCoordinatesListDAO.getRegion(term);
        } catch (InstantiationException | SQLException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return regions;
    }
}
