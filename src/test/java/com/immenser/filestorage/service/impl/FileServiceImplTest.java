package com.immenser.filestorage.service.impl;

import com.immenser.filestorage.exception.NotFoundException;
import com.immenser.filestorage.service.FileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class FileServiceImplTest {

    @Autowired
    private FileService fileService;

    @Test
    public void notExistId() {
        assertThrows(NotFoundException.class, () -> fileService.findById(0));
    }
}
