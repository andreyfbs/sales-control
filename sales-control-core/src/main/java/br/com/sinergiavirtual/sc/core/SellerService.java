package br.com.sinergiavirtual.sc.core;

import java.util.ArrayList;
import java.util.List;

import br.com.sinergiavirtual.sc.model.entity.Seller;
import br.com.sinergiavirtual.sc.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> sellerList(String sellerName) {
        return sellerRepository.findByName(sellerName);
    }

    public List<Seller> getAllSellers(String sellerName) {

        Iterable<Seller> iterable = sellerRepository.findAll();

        //ArrayList<Seller> a = iterable;

        //return iterable;
        return null;
    }

}
