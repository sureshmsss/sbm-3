package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.PC;

public interface I_PC_Repo extends JpaRepository<PC, Integer> {
	

}
