// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class FlowInstanceLocator extends TeaModel {
    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

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

    public static FlowInstanceLocator build(java.util.Map<String, ?> map) throws Exception {
        FlowInstanceLocator self = new FlowInstanceLocator();
        return TeaModel.build(map, self);
    }

    public FlowInstanceLocator setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public FlowInstanceLocator setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public FlowInstanceLocator setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public FlowInstanceLocator setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
