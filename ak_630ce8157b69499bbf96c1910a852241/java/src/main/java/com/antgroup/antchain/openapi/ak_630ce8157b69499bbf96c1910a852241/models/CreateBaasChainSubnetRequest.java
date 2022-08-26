// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class CreateBaasChainSubnetRequest extends TeaModel {
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

    public static CreateBaasChainSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBaasChainSubnetRequest self = new CreateBaasChainSubnetRequest();
        return TeaModel.build(map, self);
    }

    public CreateBaasChainSubnetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateBaasChainSubnetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateBaasChainSubnetRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public CreateBaasChainSubnetRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

    public CreateBaasChainSubnetRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public CreateBaasChainSubnetRequest setConsortiumMember(String consortiumMember) {
        this.consortiumMember = consortiumMember;
        return this;
    }
    public String getConsortiumMember() {
        return this.consortiumMember;
    }

    public CreateBaasChainSubnetRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
