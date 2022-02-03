package ss.it.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ss.it.model.Details;
import ss.it.model.UserData;

@RestController
public class CustomerData {
	
	@GetMapping("/data1")
	public ResponseEntity<UserData> getDetails(){
		UserData userData=new UserData("sures",12354,"deve",new String[]{"a","b","c"},
				List.of("ssc","10+2","b.tech"),Set.of(1234,12354,56412),
				Map.of("name","suresh","age","27","weight","60"),new Details("12-abc","srnagar",452654,"hyd"));
		return new ResponseEntity<UserData>(userData,HttpStatus.OK);
	}

}
