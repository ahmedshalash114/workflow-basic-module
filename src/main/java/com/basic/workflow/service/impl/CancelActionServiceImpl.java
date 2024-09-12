package com.basic.workflow.service.impl;

import com.basic.workflow.service.WorkflowAction;
import org.springframework.stereotype.Service;

@Service
public class CancelActionServiceImpl implements WorkflowAction {
    @Override
    public void execute() {
        // Cancelling logic
        System.out.println("Cancelling...");
    }
}
