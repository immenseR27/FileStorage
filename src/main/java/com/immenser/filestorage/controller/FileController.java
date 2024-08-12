package com.immenser.filestorage.controller;

import com.immenser.filestorage.entity.File;
import com.immenser.filestorage.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping("/{id}")
    public File findById(@PathVariable long id) {
        return fileService.findById(id);
    }

    @PostMapping
    public long saveFile(@RequestBody File file) {
        return fileService.saveFile(file);
    }

    @GetMapping()
    public Page<File> findAllFiles() {
        return fileService.findAllFiles();
    }
}
