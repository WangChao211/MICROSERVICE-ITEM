package cn.wang.microservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import cn.wang.microservice.pojo.Item;
import cn.wang.microservice.service.ItemService;
@RestController
public class ItemController {
	@Autowired
	ItemService service;
	@GetMapping(value="/item/{id}")
	public Item queryById(@PathVariable("id") Long id){
		return service.queryItemById(id);
	}
}
