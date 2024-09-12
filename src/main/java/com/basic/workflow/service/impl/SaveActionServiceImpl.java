package com.basic.workflow.service.impl;

import com.basic.workflow.service.WorkflowAction;
import org.springframework.stereotype.Service;

@Service
public class SaveActionServiceImpl implements WorkflowAction {
    @Override
    public void execute() {
        // Save logic
        System.out.println("Saving...");
    }
}
