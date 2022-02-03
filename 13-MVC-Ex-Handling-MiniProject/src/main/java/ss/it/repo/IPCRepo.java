package ss.it.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.it.entity.PC;

public interface IPCRepo extends JpaRepository<PC, Integer> {

}
