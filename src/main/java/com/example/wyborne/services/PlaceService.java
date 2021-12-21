package com.example.wyborne.services;

import com.example.wyborne.objects.Place;
import com.example.wyborne.repositories.PlaceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlaceService {

    private final PlaceRepository placeRepository;

    public List<Place> getPlace() {
        return placeRepository.findAll();
    }

    public Place getPlaceById(Long id) {
        return placeRepository.getById(id);
    }

    public void addPlace(Place place) {
        placeRepository.save(place);
    }
}
