// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class DynamicDsl extends TeaModel {
    //  
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    //  
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    //  
    @NameInMap("auto_start")
    @Validation(required = true)
    public Boolean autoStart;

    //  
    @NameInMap("parameters")
    @Validation(required = true)
    public String parameters;

    public static DynamicDsl build(java.util.Map<String, ?> map) throws Exception {
        DynamicDsl self = new DynamicDsl();
        return TeaModel.build(map, self);
    }

    public DynamicDsl setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public DynamicDsl setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DynamicDsl setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }
    public Boolean getAutoStart() {
        return this.autoStart;
    }

    public DynamicDsl setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
