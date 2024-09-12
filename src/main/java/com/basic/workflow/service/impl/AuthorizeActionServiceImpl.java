package com.basic.workflow.service.impl;

import com.basic.workflow.service.WorkflowAction;
import org.springframework.stereotype.Service;

@Service
public class AuthorizeActionServiceImpl implements WorkflowAction {
    @Override
    public void execute() {
        // Authorizing logic
        System.out.println("Authorizing...");
    }
}
