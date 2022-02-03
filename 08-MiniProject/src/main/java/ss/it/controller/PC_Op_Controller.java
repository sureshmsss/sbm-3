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
import ss.it.service.I_PC_Service;

@RestController
@RequestMapping("/pc")
public class PC_Op_Controller {

	@Autowired
	private I_PC_Service service;

	@PostMapping("/insert")
	public ResponseEntity<String> insert(@RequestBody PC pc) {
		try {

			// use service
			String resultMsg = service.regDetails(pc);
			return new ResponseEntity<String>(resultMsg, HttpStatus.CREATED);// 201 content created successfully
		} catch (Exception e) {
			return new ResponseEntity<String>("problem in details entering", HttpStatus.INTERNAL_SERVER_ERROR);
			// 500 error
		}

	}

	@GetMapping("/viewAll")
	public ResponseEntity<?> getObjs() {
		try {
			List<PC> list = service.getAll();
			return new ResponseEntity<List<PC>>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("error in the server getting objects", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/get/{id}")
	public ResponseEntity<?> getObj(@PathVariable Integer id) {
		try {
			PC pc = service.getById(id);
			return new ResponseEntity<PC>(pc, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("we are sorry, server error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<String> updatePc(@RequestBody PC pc) {
		try {
			String msg = service.updatePcDetails(pc);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deletePC(@PathVariable("id") Integer id) {
		try {
			// use service
			String msg = service.deleteById(id);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PatchMapping("/patch/{id}/{hike}")
	public ResponseEntity<String> modifyPC(@PathVariable Integer id, @PathVariable Float hike) {

		try {
			// use service
			String msg = service.updatePCById(id, hike);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
