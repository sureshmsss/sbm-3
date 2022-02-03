package ss.it.service;

import java.util.List;

import ss.it.entity.PC;
import ss.it.exception.PCNotFoundException;

public interface I_PC_Service {
	public String regDetails(PC pc);

	public List<PC> getAll();

	public PC getById(Integer id) throws PCNotFoundException;

	public String updatePcDetails(PC pc) throws PCNotFoundException;

	public String deleteById(Integer id) throws PCNotFoundException;
	
	public String updatePCById(Integer id,Float hike) throws PCNotFoundException;
}
