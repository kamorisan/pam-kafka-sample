package com.myspace.pam_kafka_message;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class RequestData implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("ID")
	private java.lang.Long id;
	@org.kie.api.definition.type.Label("Status")
	private java.lang.String status;
	@org.kie.api.definition.type.Label("Score")
	private java.lang.Long score;

	public RequestData() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.Long getScore() {
		return this.score;
	}

	public void setScore(java.lang.Long score) {
		this.score = score;
	}

	public RequestData(java.lang.Long id, java.lang.String status,
			java.lang.Long score) {
		this.id = id;
		this.status = status;
		this.score = score;
	}

}