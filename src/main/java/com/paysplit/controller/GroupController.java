package com.paysplit.controller;
import org.springframework.http.ResponseEntity;

import com.paysplit.model.Group;
import com.paysplit.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/groups")
public class GroupController {

    @PostMapping
    public ResponseEntity<String> createGroup(@RequestBody Group group) {
        // Save group using service (to be added)
        return ResponseEntity.ok("Group created successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getGroup(@PathVariable Long id) {
        // Return group details
        return ResponseEntity.ok("Group details for ID: " + id);
    }
}

