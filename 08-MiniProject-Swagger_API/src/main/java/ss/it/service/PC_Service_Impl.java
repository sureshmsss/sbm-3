package ss.it.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ss.it.entity.PC;
import ss.it.exception.PCNotFoundException;
import ss.it.repo.I_PC_Repo;

@Service("service")
public class PC_Service_Impl implements I_PC_Service {
	@Autowired
	private I_PC_Repo repo;

	@Override
	public String regDetails(PC pc) {
		int idVal = repo.save(pc).getId();
		return "PC details are registered : " + idVal;
	}

	@Override
	public List<PC> getAll() {
		List<PC> list = repo.findAll();
		list.sort((t1, t2) -> (t1.getId().compareTo(t2.getId())));
		return list;
	}

	@Override
	public PC getById(Integer id) throws PCNotFoundException {

		return repo.findById(id)
				.orElseThrow(() -> new PCNotFoundException("sorry the given id " + id + " is not valid"));
	}

	@Override
	public String updatePcDetails(PC pc) throws PCNotFoundException {
		Optional<PC> optional = repo.findById(pc.getId());
		if (optional.isPresent()) {
			repo.save(pc);
			return pc.getId() + " is updated";
		} else {
			throw new PCNotFoundException(pc.getId() + " is no found");
		}

	}

	@Override
	public String deleteById(Integer id) throws PCNotFoundException {
		Optional<PC> pc = repo.findById(id);
		if (pc.isPresent()) {
			repo.deleteById(id);
			return id + "pc is deleted";
		} // if
		else {
			throw new PCNotFoundException("requested " + id + " is not found");
		}
	}

	@Override
	public String updatePCById(Integer id, Float hike) throws PCNotFoundException {
		Optional<PC> opt = repo.findById(id);
		if (opt.isPresent()) {

			// use service
			PC pc = opt.get();
			pc.setBudget(pc.getBudget() * (pc.getBudget() / 100) * (hike));
			repo.save(pc);
			return "pc is updated by " + id;
		} else {
			throw new PCNotFoundException(id + " is not found");
		}
	}

}
