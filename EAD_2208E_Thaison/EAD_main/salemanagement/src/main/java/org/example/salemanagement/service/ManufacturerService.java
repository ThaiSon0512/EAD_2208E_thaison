package org.example.salemanagement.service;

import org.example.salemanagement.entity.Manufacturer;
import org.example.salemanagement.repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public List<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.findAll();
    }

    public Manufacturer addManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    public Manufacturer updateManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.save(manufacturer);
    }

    public void deleteManufacturer(Long id) {
        Manufacturer manufacturer = manufacturerRepository.findById(id).orElse(null);
        if (manufacturer != null && (manufacturer.getProducts() == null || manufacturer.getProducts().isEmpty())) {
            manufacturerRepository.delete(manufacturer);
        } else {
            throw new RuntimeException("Cannot delete manufacturer with existing products");
        }
    }
}
