package com.mohit.springec2docker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FileData")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileUpload {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String type;
	@Lob
	@Column(name = "file", length = 1000)
	private byte[] fileData;

}
