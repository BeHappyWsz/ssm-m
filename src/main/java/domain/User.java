package domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Setter
	@Getter
	private int id;
	
	@Setter
	@Getter
	private String username;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + "]";
	}
}
