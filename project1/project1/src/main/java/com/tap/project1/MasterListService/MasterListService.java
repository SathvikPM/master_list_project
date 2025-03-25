package com.tap.project1.MasterListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tap.project1.repository.MasterListRepository;
import com.tap.project1.model.MasterList;

import java.util.List;

@Service
public class MasterListService {
    
    @Autowired
    private MasterListRepository repository;

    public List<MasterList> getAllMasterLists() {
        return repository.findAll();
    }

    public MasterList saveMasterList(MasterList masterList) {
        return repository.save(masterList);
    }
}
