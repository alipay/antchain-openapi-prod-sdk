// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class RegisterPartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 参与方的partyId
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    // 描述party
    @NameInMap("party_desc")
    @Validation(required = true)
    public String partyDesc;

    // 节点的nodeId
    @NameInMap("node_id")
    @Validation(required = true)
    public String nodeId;

    public static RegisterPartyRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterPartyRequest self = new RegisterPartyRequest();
        return TeaModel.build(map, self);
    }

    public RegisterPartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterPartyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterPartyRequest setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public RegisterPartyRequest setPartyDesc(String partyDesc) {
        this.partyDesc = partyDesc;
        return this;
    }
    public String getPartyDesc() {
        return this.partyDesc;
    }

    public RegisterPartyRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
