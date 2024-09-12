package com.basic.workflow.controller;

import com.basic.workflow.service.WorkflowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workflow")
public class WorkflowController {
    private final WorkflowService workflowService;

    public WorkflowController(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    @PostMapping("/action")
    public ResponseEntity<String> performAction(@RequestParam String actionType) {
        workflowService.performAction(actionType);
        return ResponseEntity.ok("Action performed: " + actionType);
    }
}
