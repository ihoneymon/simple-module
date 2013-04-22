package kr.pe.ihoney.module.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
@EqualsAndHashCode(of={"name", "email"}, callSuper=false)
@ToString
public class User implements Serializable{
	private static final long serialVersionUID = 7798638513982324337L;
	
	private Long id;
	
	private String name;
	
	private String email;
}
