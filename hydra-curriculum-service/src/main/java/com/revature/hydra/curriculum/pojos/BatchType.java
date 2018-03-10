package com.revature.hydra.curriculum.pojos;

public class BatchType {

	private Integer id;

	private String name;

	private Integer length = 10; // In the future, this field can be editable.

	public BatchType() {
		super();
	}

	public BatchType(Integer id, String name, Integer length) {
		super();
		this.id = id;
		this.name = name;
		this.length = length;
	}

	public BatchType(String name, Integer length) {
		super();
		this.name = name;
		this.length = length;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "BatchType [id=" + id + ", name=" + name + ", length=" + length + "]";
	}

}
