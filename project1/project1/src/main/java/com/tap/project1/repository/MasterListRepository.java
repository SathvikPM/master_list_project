package com.tap.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tap.project1.model.MasterList;

public interface MasterListRepository extends JpaRepository<MasterList, Long> {
}
