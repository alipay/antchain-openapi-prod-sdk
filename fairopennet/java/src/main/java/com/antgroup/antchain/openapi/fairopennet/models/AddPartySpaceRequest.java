// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class AddPartySpaceRequest extends TeaModel {
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
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    //  
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    public static AddPartySpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPartySpaceRequest self = new AddPartySpaceRequest();
        return TeaModel.build(map, self);
    }

    public AddPartySpaceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddPartySpaceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddPartySpaceRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public AddPartySpaceRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public AddPartySpaceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AddPartySpaceRequest setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

}
