// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class StopFlowinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    //  
    @NameInMap("space_id")
    @Validation(required = true)
    public String spaceId;

    //  
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    //  
    @NameInMap("flow_id")
    @Validation(required = true)
    public String flowId;

    //  
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static StopFlowinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopFlowinstanceRequest self = new StopFlowinstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopFlowinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StopFlowinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StopFlowinstanceRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public StopFlowinstanceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public StopFlowinstanceRequest setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public StopFlowinstanceRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public StopFlowinstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
