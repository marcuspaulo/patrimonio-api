package br.com.mp.patrimonio.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mp.patrimonio.model.Item;
import br.com.mp.patrimonio.repository.ItemRepository;

@RestController("/itens")
@CrossOrigin("${origem-permitida}")
public class ItemResource {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping
	public List<Item> listar() {
		return itemRepository.findAll();
	}
	
	@PostMapping
	public Item adicionar(@RequestBody @Valid Item item) {
		return itemRepository.save(item);
	}
}
