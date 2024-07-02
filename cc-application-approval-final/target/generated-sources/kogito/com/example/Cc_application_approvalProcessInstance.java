package com.example;

import com.example.Cc_application_approvalModel;

public class Cc_application_approvalProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<Cc_application_approvalModel> {

    public Cc_application_approvalProcessInstance(com.example.Cc_application_approvalProcess process, Cc_application_approvalModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public Cc_application_approvalProcessInstance(com.example.Cc_application_approvalProcess process, Cc_application_approvalModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public Cc_application_approvalProcessInstance(com.example.Cc_application_approvalProcess process, Cc_application_approvalModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public Cc_application_approvalProcessInstance(com.example.Cc_application_approvalProcess process, Cc_application_approvalModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public Cc_application_approvalProcessInstance(com.example.Cc_application_approvalProcess process, Cc_application_approvalModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(Cc_application_approvalModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(Cc_application_approvalModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
