// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateChainSubnetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 主链id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 子链名称
    @NameInMap("subnet_name")
    public String subnetName;

    // 节点的id
    @NameInMap("node_id")
    public String nodeId;

    // 联盟成员
    @NameInMap("consortium_member")
    public String consortiumMember;

    // 联盟id
    @NameInMap("consortium_id")
    public String consortiumId;

    public static CreateChainSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChainSubnetRequest self = new CreateChainSubnetRequest();
        return TeaModel.build(map, self);
    }

    public CreateChainSubnetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateChainSubnetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateChainSubnetRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CreateChainSubnetRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

    public CreateChainSubnetRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateChainSubnetRequest setConsortiumMember(String consortiumMember) {
        this.consortiumMember = consortiumMember;
        return this;
    }
    public String getConsortiumMember() {
        return this.consortiumMember;
    }

    public CreateChainSubnetRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
