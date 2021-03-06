package com.revature.hydra.curriculum.pojos;

import com.revature.hydra.curriculum.bean.Curriculum;

public class MetaDTO {

	private Curriculum curriculum;

	public MetaDTO(){
		
	}

	public MetaDTO(Curriculum curriculum) {
		super();
		this.curriculum = curriculum;
	}

	public Curriculum getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	@Override
	public String toString() {
		return "MetaDTO [curriculum=" + curriculum + "]";
	}
	
}
