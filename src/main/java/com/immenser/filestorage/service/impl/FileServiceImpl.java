package com.immenser.filestorage.service.impl;

import com.immenser.filestorage.entity.File;
import com.immenser.filestorage.exception.NotFoundException;
import com.immenser.filestorage.repository.FileRepository;
import com.immenser.filestorage.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    @Override
    public File findById(long id) {
        Optional<File> optionalFileEntity = fileRepository.findById(id);
        return optionalFileEntity.orElseThrow(() -> new NotFoundException("Файл с идентификатором " + id + " не найден"));
    }

    @Override
    public long saveFile(File file) {
        return fileRepository.save(file).getId();
    }

    @Override
    public Page<File> findAllFiles() {
        var sort = Sort.by(Sort.Order.desc("creationDate"));
        return fileRepository.findAllFiles(PageRequest.of(0, 5, sort));
    }
}
