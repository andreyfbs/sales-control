package br.com.sinergiavirtual.sc.repository;

import java.util.List;

import br.com.sinergiavirtual.sc.model.entity.Seller;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Long> {

    List<Seller> findByName(String name);

}
