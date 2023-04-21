package com.mohit.springec2docker.serviceimpl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mohit.springec2docker.entity.FileUpload;
import com.mohit.springec2docker.repository.FileUploadRepository;
import com.mohit.springec2docker.service.FileUploadService;
import com.mohit.springec2docker.utlis.FileUtils;

@Service
public class FileUploadServiceImpl implements FileUploadService {

	@Autowired
	FileUploadRepository fileUploadRepository;

	public String uploadImage(MultipartFile file) throws IOException {

		FileUpload fileData = fileUploadRepository.save(FileUpload.builder().name(file.getOriginalFilename())
				.type(file.getContentType()).fileData(FileUtils.compressImage(file.getBytes())).build());
		if (fileData != null) {
			return "file uploaded successfully : " + file.getOriginalFilename();
		}
		return null;
	}

	public byte[] downloadImage(String fileName) {
		Optional<FileUpload> dbFileData = fileUploadRepository.findByName(fileName);
		byte[] images = FileUtils.decompressImage(dbFileData.get().getFileData());
		return images;
	}

}
