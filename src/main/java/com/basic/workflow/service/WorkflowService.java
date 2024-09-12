package com.basic.workflow.service;

import com.basic.workflow.factory.ActionFactory;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {
    private final ActionFactory actionFactory;

    public WorkflowService(ActionFactory actionFactory) {
        this.actionFactory = actionFactory;
    }

    public void performAction(String actionType) {
        WorkflowAction action = actionFactory.getAction(actionType);
        action.execute();
    }
}
