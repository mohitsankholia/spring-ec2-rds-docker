package com.mohit.springec2docker.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileUploadService {

	public String uploadImage(MultipartFile file) throws IOException;

	public byte[] downloadImage(String fileName);

}
