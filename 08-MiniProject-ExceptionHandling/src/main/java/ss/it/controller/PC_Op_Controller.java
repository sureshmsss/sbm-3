package ss.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.entity.PC;
import ss.it.exception.PCNotFoundException;
import ss.it.service.I_PC_Service;

@RestController
@RequestMapping("/pc")
public class PC_Op_Controller {

	@Autowired
	private I_PC_Service service;

	@PostMapping("/insert")
	public ResponseEntity<String> insert(@RequestBody PC pc) {
		// use service
		String resultMsg = service.regDetails(pc);
		return new ResponseEntity<String>(resultMsg, HttpStatus.CREATED);// 201 content created successfully

	}

	@GetMapping("/viewAll")
	public ResponseEntity<?> getObjs() {
		List<PC> list = service.getAll();
		return new ResponseEntity<List<PC>>(list, HttpStatus.OK);
	}

	@PostMapping("/get/{id}")
	public ResponseEntity<?> getObj(@PathVariable Integer id) throws Exception {
		PC pc = service.getById(id);
		return new ResponseEntity<PC>(pc, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updatePc(@RequestBody PC pc) throws Exception {
		String msg = service.updatePcDetails(pc);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePC(@PathVariable("id") Integer id) throws Exception {
		// use service
		String msg = service.deleteById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@PatchMapping("/patch/{id}/{hike}")
	public ResponseEntity<String> modifyPC(@PathVariable Integer id, @PathVariable Float hike) throws Exception {

		// use service
		String msg = service.updatePCById(id, hike);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
