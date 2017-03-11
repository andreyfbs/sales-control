package br.com.sinergiavirtual.sc.core;

import java.util.List;

import br.com.sinergiavirtual.sc.model.entity.Seller;


public interface SellerService {

    List<Seller> sellerList(String sellerName);

    List<Seller> getAllSellers(String sellerName);
}