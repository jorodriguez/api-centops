package net.api.centops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.api.centops.model.Usuario;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/root")
public class RootController {
	
	@GetMapping
	public ResponseEntity<String> getRoot() {
		return ResponseEntity.ok().body("Api corriendo..");
	}

}
