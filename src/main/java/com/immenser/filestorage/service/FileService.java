package com.immenser.filestorage.service;

import com.immenser.filestorage.entity.File;
import org.springframework.data.domain.Page;

public interface FileService {

    File findById(long id);
    long saveFile(File file);
    Page<File> findAllFiles();

}
