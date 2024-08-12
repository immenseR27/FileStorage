package com.immenser.filestorage.repository;

import com.immenser.filestorage.entity.File;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FileRepository extends JpaRepository<File, Long> {

    @Query("SELECT f FROM File f")
    Page<File> findAllFiles(Pageable pageable);
}
