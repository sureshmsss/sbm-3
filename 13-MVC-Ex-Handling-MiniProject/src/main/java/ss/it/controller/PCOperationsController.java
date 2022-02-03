package ss.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.entity.PC;
import ss.it.service.IPCMgmtService;

@RestController
@RequestMapping("/pc")
public class PCOperationsController {
	@Autowired
	private IPCMgmtService service;

	/*
	 * @PostMapping("/register") public ResponseEntity<String>
	 * enrollTourist(@RequestBody PC pc) throws Exception { // use service String
	 * resultMsg = service.registerTourist(pc); return new
	 * ResponseEntity<String>(resultMsg, HttpStatus.CREATED); // 201 content created
	 * successfully
	 * 
	 * }// method
	 */
	@GetMapping("/findAll")
	public ResponseEntity<List<PC>> displayPcs() throws Exception {
		List<PC> list = service.fetchAllPcs();
		return new ResponseEntity<List<PC>>(list, HttpStatus.OK);
	}
	/*
	 * @GetMapping("/find/{id}") public ResponseEntity<?>
	 * displayTouristById(@PathVariable("id") Integer id) throws Exception { Tourist
	 * tourist = service.fetchTouristById(id); return new
	 * ResponseEntity<Tourist>(tourist, HttpStatus.OK);
	 * 
	 * }// method
	 * 
	 * @PutMapping("/modify") public ResponseEntity<String>
	 * modifyTourist(@RequestBody Tourist tourist) throws Exception { String msg =
	 * service.updateTouristDetails(tourist); return new ResponseEntity<String>(msg,
	 * HttpStatus.OK);
	 * 
	 * }
	 * 
	 * @DeleteMapping("/delete/{id}") public ResponseEntity<String>
	 * removeToursit(@PathVariable("id") Integer id) throws Exception { // use
	 * service String msg = service.deleteTourist(id); return new
	 * ResponseEntity<String>(msg, HttpStatus.OK);
	 * 
	 * }// method
	 * 
	 * @PatchMapping("/budgetModify/{id}/{hike}") public ResponseEntity<String>
	 * modifyTouristBudgetById(@PathVariable("id") Integer id,
	 * 
	 * @PathVariable("hike") Float hikePercent) throws Exception { // use service
	 * String msg = service.updateTouristBudgetById(id, hikePercent); return new
	 * ResponseEntity<String>(msg, HttpStatus.OK); }
	 */
}// class
