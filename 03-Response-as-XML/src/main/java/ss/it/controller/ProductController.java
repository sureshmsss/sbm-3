package ss.it.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.HardWare;
import ss.it.model.PC;
import ss.it.model.Product;
import ss.it.model.Software;

@RestController
public class ProductController {

	// not Recommended
	// and
	// default response status code 200 will be taken
	@GetMapping("/data")
	public Product getDetails() {
		Product product = new Product("laptop", 30000.0f, "Technology");
		return product;
	}

	// Recommended approach is taking return type as ResponseEntity<>
	// becoz we can have the control of response status code

	@GetMapping("/data2")
	public ResponseEntity<Product> getDetails2() {
		Product product = new Product("Biryani", 250f, "food");
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	@GetMapping("/pc")
	public ResponseEntity<PC> getData(String user) {

		// get PC object
		PC pc = new PC("dell", "45000", "laptop", new HardWare("1TB", "15.9'", "8GB", "5000"),
				new Software("i3", "10", "3.0", "yes", "yes"));

		// response status
		HttpStatus status = HttpStatus.OK;
		return new ResponseEntity<PC>(pc, status);

	}

}
