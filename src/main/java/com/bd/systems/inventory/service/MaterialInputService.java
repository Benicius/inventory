package com.bd.systems.inventory.service;

import com.bd.systems.inventory.domains.ItemReceived;
import com.bd.systems.inventory.domains.MaterialInput;
import com.bd.systems.inventory.domains.Product;
import com.bd.systems.inventory.repository.ItemReceivedRepository;
import com.bd.systems.inventory.repository.MaterialInputRepository;
import com.bd.systems.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaterialInputService {

    private ItemReceivedRepository itemReceivedRepository;

    private MaterialInputRepository materialInputRepository;

    private ProductRepository productRepository;

    @Autowired
    public MaterialInputService(ItemReceivedRepository itemReceivedRepository, MaterialInputRepository materialInputRepository, ProductRepository productRepository) {
        this.itemReceivedRepository = itemReceivedRepository;
        this.materialInputRepository = materialInputRepository;
        this.productRepository = productRepository;
    }

    public MaterialInput saveMaterial(MaterialInput materialInput){

        for (ItemReceived item: materialInput.getItems()) {
            Optional<Product> productTemp = productRepository.findById(item.getProduct().getId());
        }
        return materialInputRepository.save(materialInput);
    }
}
