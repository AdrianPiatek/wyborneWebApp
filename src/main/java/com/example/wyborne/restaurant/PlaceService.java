package com.example.wyborne.restaurant;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlaceService {

    private final PlaceRepository placeRepository;

    public List<Place> getPlace() {
        return placeRepository.findAll();
    }

    public void addPlace(Place place) {
        placeRepository.save(place);
    }
}
