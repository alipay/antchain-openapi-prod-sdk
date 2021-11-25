// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteChainSubnetNodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 子链id
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 联盟id
    @NameInMap("consortium_id")
    public String consortiumId;

    // 待删除的节点id
    @NameInMap("node_id")
    public String nodeId;

    public static DeleteChainSubnetNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChainSubnetNodeRequest self = new DeleteChainSubnetNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChainSubnetNodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteChainSubnetNodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteChainSubnetNodeRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DeleteChainSubnetNodeRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DeleteChainSubnetNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
