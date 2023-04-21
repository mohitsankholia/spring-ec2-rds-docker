package com.mohit.springec2docker.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohit.springec2docker.entity.FileUpload;

public interface FileUploadRepository extends JpaRepository<FileUpload, Long> {

	Optional<FileUpload> findByName(String fileName);

}
