package com.tap.project1.MasterListController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tap.project1.MasterListService.MasterListService;
import com.tap.project1.model.MasterList;


import java.util.List;

@RestController
@RequestMapping("/v2/master_list")
public class MasterListController {
    
    @Autowired
    private MasterListService service;

    @PostMapping
    public MasterList createMasterList(@RequestBody MasterList masterList) {
        return service.saveMasterList(masterList);
    }

    @GetMapping
    public List<MasterList> getMasterLists() {
        return service.getAllMasterLists();
    }
}
