// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class FlowInstanceStatus extends TeaModel {
    //  
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    //  
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    //  
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    //  
    @NameInMap("consent_on")
    @Validation(required = true)
    public Boolean consentOn;

    //   
    @NameInMap("auto_start")
    @Validation(required = true)
    public Boolean autoStart;

    //  
    @NameInMap("static_parameters")
    @Validation(required = true)
    public String staticParameters;

    //  
    @NameInMap("dynamic_parameters")
    @Validation(required = true)
    public String dynamicParameters;

    //  
    @NameInMap("total_components")
    @Validation(required = true)
    public Long totalComponents;

    //  
    @NameInMap("completed_components")
    @Validation(required = true)
    public Long completedComponents;

    //  
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    //  
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    //  
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    public static FlowInstanceStatus build(java.util.Map<String, ?> map) throws Exception {
        FlowInstanceStatus self = new FlowInstanceStatus();
        return TeaModel.build(map, self);
    }

    public FlowInstanceStatus setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public FlowInstanceStatus setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public FlowInstanceStatus setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FlowInstanceStatus setConsentOn(Boolean consentOn) {
        this.consentOn = consentOn;
        return this;
    }
    public Boolean getConsentOn() {
        return this.consentOn;
    }

    public FlowInstanceStatus setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public FlowInstanceStatus setStaticParameters(String staticParameters) {
        this.staticParameters = staticParameters;
        return this;
    }
    public String getStaticParameters() {
        return this.staticParameters;
    }

    public FlowInstanceStatus setDynamicParameters(String dynamicParameters) {
        this.dynamicParameters = dynamicParameters;
        return this;
    }
    public String getDynamicParameters() {
        return this.dynamicParameters;
    }

    public FlowInstanceStatus setTotalComponents(Long totalComponents) {
        this.totalComponents = totalComponents;
        return this;
    }
    public Long getTotalComponents() {
        return this.totalComponents;
    }

    public FlowInstanceStatus setCompletedComponents(Long completedComponents) {
        this.completedComponents = completedComponents;
        return this;
    }
    public Long getCompletedComponents() {
        return this.completedComponents;
    }

    public FlowInstanceStatus setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FlowInstanceStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public FlowInstanceStatus setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
