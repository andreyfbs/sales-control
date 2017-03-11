package br.com.sinergiavirtual.sc.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import br.com.sinergiavirtual.sc.model.entity.Seller;
import br.com.sinergiavirtual.sc.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public List<Seller> sellerList(String sellerName) {
        return sellerRepository.findByName(sellerName);
    }

    @Override
    public List<Seller> getAllSellers(String sellerName) {
        return sellerRepository.findAll();
    }

}
