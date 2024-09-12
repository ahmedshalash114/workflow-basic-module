package com.basic.workflow.factory;

import com.basic.workflow.service.WorkflowAction;
import com.basic.workflow.service.impl.AuthorizeActionServiceImpl;
import com.basic.workflow.service.impl.CancelActionServiceImpl;
import com.basic.workflow.service.impl.SaveActionServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class ActionFactory {
    public WorkflowAction getAction(String actionType) {
        switch (actionType) {
            case "save":
                return new SaveActionServiceImpl();
            case "authorize":
                return new AuthorizeActionServiceImpl();
            case "cancel":
                return new CancelActionServiceImpl();
            // Add more cases as needed
            default:
                throw new IllegalArgumentException("Invalid action type");
        }
    }
}
