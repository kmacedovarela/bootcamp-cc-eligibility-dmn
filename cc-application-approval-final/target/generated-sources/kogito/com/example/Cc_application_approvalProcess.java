package com.example;

import com.example.Cc_application_approvalModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("cc_application_approval")
@io.quarkus.runtime.Startup()
public class Cc_application_approvalProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.Cc_application_approvalModel> {

    public Cc_application_approvalProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler());
    }

    @jakarta.inject.Inject()
    public Cc_application_approvalProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler creditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler) {
        super(app, java.util.Arrays.asList(creditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler), correlations);
        activate();
    }

    public Cc_application_approvalProcess() {
    }

    @Override()
    public com.example.Cc_application_approvalProcessInstance createInstance(com.example.Cc_application_approvalModel value) {
        return new com.example.Cc_application_approvalProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.Cc_application_approvalProcessInstance createInstance(java.lang.String businessKey, com.example.Cc_application_approvalModel value) {
        return new com.example.Cc_application_approvalProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.Cc_application_approvalProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.Cc_application_approvalModel value) {
        return new com.example.Cc_application_approvalProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.Cc_application_approvalModel createModel() {
        return new com.example.Cc_application_approvalModel();
    }

    public com.example.Cc_application_approvalProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.Cc_application_approvalModel) value);
    }

    public com.example.Cc_application_approvalProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.Cc_application_approvalModel) value);
    }

    public com.example.Cc_application_approvalProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.Cc_application_approvalProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.Cc_application_approvalProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.Cc_application_approvalProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("cc_application_approval", true);
        factory.variable("approval", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("customTags", "output", "approval", "approval", "ItemSubjectRef", "_approvalItem"));
        factory.variable("applicant", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Applicant.class), java.util.Map.of("customTags", "input", "ItemSubjectRef", "_applicantItem", "applicant", "applicant"));
        factory.variable("creditCard", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.CreditCard.class), java.util.Map.of("customTags", "output", "creditCard", "creditCard", "ItemSubjectRef", "_creditCardItem"));
        factory.name("cc-application-approval");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C"));
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.name("Join");
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.type(2);
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.metaData("UniqueId", "_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C");
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.metaData("x", 1054);
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.metaData("width", 56);
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.metaData("y", 497);
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.metaData("height", 56);
        joinNode_5ABDF5A8_11B1_4FD7_A8DD_2E5272B1BE0C.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_506FCFC4-3B1A-4605-8EC2-402E675449E6"));
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.name("Split");
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.type(2);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.metaData("UniqueId", "_506FCFC4-3B1A-4605-8EC2-402E675449E6");
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.metaData("x", 1280);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.metaData("width", 56);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.metaData("y", 333);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.metaData("Default", null);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.metaData("height", 56);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C"), "_FED3653A-4058-4FAF-9E4D-81DE266724B9", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.equals("rejected");
        }, 0, false);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CE41B08B-CCBC-4C8B-8A76-B5DBC2118B27"), "_015941BB-B9D9-4778-B865-BBBFF63AC49B", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.equals("approved");
        }, 0, false);
        splitNode_506FCFC4_3B1A_4605_8EC2_402E675449E6.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_48806F31-5F4F-4914-89E8-14E620A3F7C7"));
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.name("Approved");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.terminate(false);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("UniqueId", "_48806F31-5F4F-4914-89E8-14E620A3F7C7");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("elementname", "Approved");
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("x", 1583);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("width", 56);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("y", 226);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.metaData("height", 56);
        endNode_48806F31_5F4F_4914_89E8_14E620A3F7C7.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09 = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"));
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.name("Generate CC Details");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workName("org.acme.cc_approval.service.CreditCardService_generateCreditCardDetails__55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09_Handler");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("Interface", "org.acme.cc_approval.service.CreditCardService");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("NodeName", "Generate CC Details");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("Operation", "generateCreditCardDetails");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("implementation", "Java");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.CreditCardService");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.workParameter("operationImplementationRef", "generateCreditCardDetails");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("applicant", "applicant", "org.acme.cc_approval.model.Applicant", null)), new org.jbpm.workflow.core.impl.DataDefinition("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09_applicantInputX", "applicant", "org.acme.cc_approval.model.Applicant", null), null, null));
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09_creditCardOutputX", "creditCard", "org.acme.cc_approval.CreditCard", null)), new org.jbpm.workflow.core.impl.DataDefinition("creditCard", "creditCard", "org.acme.cc_approval.model.CreditCard", null), null, null));
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.done();
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("UniqueId", "_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("Implementation", "Java");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("elementname", "Generate CC Details");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("Type", "Service Task");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("OperationRef", "_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09_ServiceOperation");
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("x", 1379);
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("width", 154);
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("y", 203);
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.metaData("height", 102);
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.onActionScript("onEntry", "java", "System.out.println(\"Invoking service task\");", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            System.out.println("Invoking service task");
        });
        workItemNode_55E44BFD_93D1_4A12_94B2_7CFEFE0D6E09.onActionScript("onExit", "java", "System.out.println(\"Card details: \"+ creditCard);", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            org.acme.cc_approval.model.CreditCard creditCard = (org.acme.cc_approval.model.CreditCard) kcontext.getVariable("creditCard");
            System.out.println("Card details: " + creditCard);
        });
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8F9023E9-E9C2-46C6-9D8D-9FDA8EC348E4"));
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.name("rejected");
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.terminate(false);
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.metaData("UniqueId", "_8F9023E9-E9C2-46C6-9D8D-9FDA8EC348E4");
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.metaData("elementname", "rejected");
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.metaData("x", 1054);
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.metaData("width", 56);
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.metaData("y", 582);
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.metaData("height", 56);
        endNode_8F9023E9_E9C2_46C6_9D8D_9FDA8EC348E4.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CE41B08B-CCBC-4C8B-8A76-B5DBC2118B27"));
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.name("Join");
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.type(2);
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.metaData("UniqueId", "_CE41B08B-CCBC-4C8B-8A76-B5DBC2118B27");
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.metaData("x", 1282);
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.metaData("width", 56);
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.metaData("y", 226);
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.metaData("height", 56);
        joinNode_CE41B08B_CCBC_4C8B_8A76_B5DBC2118B27.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F = factory.ruleSetNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B44F71B-A355-43C5-83F2-0718EDE1811F"));
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.name("Credit Card Eligibility");
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.decision("https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28", "Credit Card Eligibility Validation", "Determine Eligibility", () -> {
            return app.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28", "Credit Card Eligibility Validation");
        });
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_fileNameInputX", "fileName", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("8cdb9f9a-0a95-4d06-b96e-6317d2b6b327", "EXPRESSION (CreditCardElibility.dmn)", "java.lang.Object", "CreditCardElibility.dmn"), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_fileNameInputX", "fileName", "java.lang.String", null))), null));
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_namespaceInputX", "namespace", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("b3a9bdc7-87f2-44d7-bcf5-885b14b5d1ab", "EXPRESSION (https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28)", "java.lang.Object", "https://kie.org/dmn/_639D6115-E08E-439D-8D29-45750C32DB28"), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_namespaceInputX", "namespace", "java.lang.String", null))), null));
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_decisionInputX", "decision", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("d02706e8-3055-4d14-a041-846969a2a031", "EXPRESSION (Determine Eligibility)", "java.lang.Object", "Determine Eligibility"), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_decisionInputX", "decision", "java.lang.String", null))), null));
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_modelInputX", "model", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("daec4a5a-9f28-47d0-a92c-b62411df5c8c", "EXPRESSION (Credit Card Eligibility Validation)", "java.lang.Object", "Credit Card Eligibility Validation"), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_modelInputX", "model", "java.lang.String", null))), null));
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("applicant", "applicant", "org.acme.cc_approval.model.Applicant", null)), new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_ApplicantInputX", "Applicant", "org.acme.cc_approval.model.Applicant", null), null, null));
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_4B44F71B-A355-43C5-83F2-0718EDE1811F_IsEligibleOutputX", "IsEligible", "String", null)), new org.jbpm.workflow.core.impl.DataDefinition("approval", "approval", "java.lang.String", null), null, null));
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("UniqueId", "_4B44F71B-A355-43C5-83F2-0718EDE1811F");
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("elementname", "Credit Card Eligibility");
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("x", 598);
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("width", 154);
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("y", 198);
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.metaData("height", 102);
        ruleSetNode_4B44F71B_A355_43C5_83F2_0718EDE1811F.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_943488C9_D20A_495A_B285_426AF8E35F10 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_943488C9-D20A-495A-B285-426AF8E35F10"));
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.name("Split");
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.type(2);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.metaData("UniqueId", "_943488C9-D20A-495A-B285-426AF8E35F10");
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.metaData("x", 828);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.metaData("width", 56);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.metaData("y", 221);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.metaData("Default", null);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.metaData("height", 56);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_305326C0-3480-4026-AD6E-0B00F19159B0"), "_0664C721-BA5F-4859-8366-6F35C31DA275", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("manual");
        }, 0, false);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CE41B08B-CCBC-4C8B-8A76-B5DBC2118B27"), "_2E94496A-BCB1-476F-9E5C-C90FEF28A312", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("approved");
        }, 0, false);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C"), "_73C2E0A0-6A39-4F82-8684-3D5EBBDC58A9", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String approval = (java.lang.String) kcontext.getVariable("approval");
            return approval.toLowerCase().equals("rejected");
        }, 0, false);
        splitNode_943488C9_D20A_495A_B285_426AF8E35F10.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_305326C0-3480-4026-AD6E-0B00F19159B0"));
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.name("Review Application");
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.workParameter("ActorId", "jdoe");
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.workParameter("NodeName", "Review Application");
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.workParameter("Skippable", "false");
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.workParameter("TaskName", "reviewApplication");
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_305326C0-3480-4026-AD6E-0B00F19159B0_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("ad8eedde-ac79-4a8d-8b4d-4e77f93be81a", "EXPRESSION (reviewApplication)", "java.lang.Object", "reviewApplication"), new org.jbpm.workflow.core.impl.DataDefinition("_305326C0-3480-4026-AD6E-0B00F19159B0_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("applicant", "applicant", "org.acme.cc_approval.model.Applicant", null)), new org.jbpm.workflow.core.impl.DataDefinition("_305326C0-3480-4026-AD6E-0B00F19159B0_applicantInputX", "applicant", "org.acme.cc_approval.model.Applicant", null), null, null));
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_305326C0-3480-4026-AD6E-0B00F19159B0_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("e17eebd2-8d72-4911-933a-334ad4252beb", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_305326C0-3480-4026-AD6E-0B00F19159B0_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_305326C0-3480-4026-AD6E-0B00F19159B0_approvalOutputX", "approval", "String", null)), new org.jbpm.workflow.core.impl.DataDefinition("approval", "approval", "java.lang.String", null), null, null));
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.done();
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.metaData("UniqueId", "_305326C0-3480-4026-AD6E-0B00F19159B0");
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.metaData("elementname", "Review Application");
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.metaData("x", 1083);
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.metaData("width", 154);
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.metaData("y", 310);
        humanTaskNode_305326C0_3480_4026_AD6E_0B00F19159B0.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"));
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.name("Log application received");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("UniqueId", "_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("elementname", "Log application received");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("NodeType", "ScriptTask");
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("x", 368);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("width", 154);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("y", 192);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.metaData("height", 102);
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.action(kcontext -> {
            org.acme.cc_approval.model.Applicant applicant = (org.acme.cc_approval.model.Applicant) kcontext.getVariable("applicant");
            System.out.println("Process started for: " + applicant);
        });
        actionNode_1C45642D_12ED_4AA3_AE39_8AF7410FDA1E.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8"));
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.name("Start");
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.interrupting(true);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("UniqueId", "_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8");
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("x", 211);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("width", 56);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("y", 215);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.metaData("height", 56);
        startNode_85AB1CEB_8F7A_4E62_B652_BABEE236ADD8.done();
        org.jbpm.ruleflow.core.factory.BoundaryEventNodeFactory<?> boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD = factory.boundaryEventNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E599C985-518A-4B46-9497-4F11DBCEC7CD"));
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("UniqueId", "_E599C985-518A-4B46-9497-4F11DBCEC7CD");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("EventType", "timer");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("customSLADueDate", "PT120S");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("elementname", "2m");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("x", 1055);
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("width", 56);
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("y", 378);
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("AttachedTo", "_305326C0-3480-4026-AD6E-0B00F19159B0");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("TimeDuration", "PT120S");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("CancelActivity", true);
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.metaData("height", 56);
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.name("2m");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.eventType("Timer-_305326C0-3480-4026-AD6E-0B00F19159B0-PT120S-_E599C985-518A-4B46-9497-4F11DBCEC7CD");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.attachedTo("_305326C0-3480-4026-AD6E-0B00F19159B0");
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.scope(null);
        boundaryEventNode_E599C985_518A_4B46_9497_4F11DBCEC7CD.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_506FCFC4-3B1A-4605-8EC2-402E675449E6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C"), "_FED3653A-4058-4FAF-9E4D-81DE266724B9");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_943488C9-D20A-495A-B285-426AF8E35F10"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C"), "_73C2E0A0-6A39-4F82-8684-3D5EBBDC58A9");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E599C985-518A-4B46-9497-4F11DBCEC7CD"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C"), "_8A4CDF66-68E6-4B18-8A80-D6DEACC59CAF");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_305326C0-3480-4026-AD6E-0B00F19159B0"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_506FCFC4-3B1A-4605-8EC2-402E675449E6"), "_9ADEBDEA-19A3-4468-92D7-9B6C6E7F68B7");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_48806F31-5F4F-4914-89E8-14E620A3F7C7"), "_B44ECAC8-5066-4417-97B0-ED30DC2033E1");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CE41B08B-CCBC-4C8B-8A76-B5DBC2118B27"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_55E44BFD-93D1-4A12-94B2-7CFEFE0D6E09"), "_F1035BFC-AB3F-4A44-B1BB-3625681FC932");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5ABDF5A8-11B1-4FD7-A8DD-2E5272B1BE0C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8F9023E9-E9C2-46C6-9D8D-9FDA8EC348E4"), "_668FD1BB-92A3-4B7D-B413-D07EC989C508");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_506FCFC4-3B1A-4605-8EC2-402E675449E6"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CE41B08B-CCBC-4C8B-8A76-B5DBC2118B27"), "_015941BB-B9D9-4778-B865-BBBFF63AC49B");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_943488C9-D20A-495A-B285-426AF8E35F10"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CE41B08B-CCBC-4C8B-8A76-B5DBC2118B27"), "_2E94496A-BCB1-476F-9E5C-C90FEF28A312");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B44F71B-A355-43C5-83F2-0718EDE1811F"), "_8C6EB85E-8897-4A68-BC2F-70C95A3B03E7");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4B44F71B-A355-43C5-83F2-0718EDE1811F"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_943488C9-D20A-495A-B285-426AF8E35F10"), "_693B534F-1D82-4FE4-8104-327DE47087BC");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_943488C9-D20A-495A-B285-426AF8E35F10"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_305326C0-3480-4026-AD6E-0B00F19159B0"), "_0664C721-BA5F-4859-8366-6F35C31DA275");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_85AB1CEB-8F7A-4E62-B652-BABEE236ADD8"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1C45642D-12ED-4AA3-AE39-8AF7410FDA1E"), "_9B9122D7-42A7-47A9-9A86-A8347025F166");
        factory.validate();
        return factory.getProcess();
    }
}
