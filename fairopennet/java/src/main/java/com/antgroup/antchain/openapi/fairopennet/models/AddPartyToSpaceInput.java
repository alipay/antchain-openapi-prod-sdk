// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class AddPartyToSpaceInput extends TeaModel {
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

    public static AddPartyToSpaceInput build(java.util.Map<String, ?> map) throws Exception {
        AddPartyToSpaceInput self = new AddPartyToSpaceInput();
        return TeaModel.build(map, self);
    }

    public AddPartyToSpaceInput setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public AddPartyToSpaceInput setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public AddPartyToSpaceInput setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public AddPartyToSpaceInput setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

}
