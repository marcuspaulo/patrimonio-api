package br.com.mp.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mp.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
