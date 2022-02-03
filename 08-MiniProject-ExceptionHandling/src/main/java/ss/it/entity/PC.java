package ss.it.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name="REST_PC")
public class PC {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	@NonNull
	private String company;

	@Column
	@NonNull
	private String processor;

	@Column
	@NonNull
	private Double budget;
}
