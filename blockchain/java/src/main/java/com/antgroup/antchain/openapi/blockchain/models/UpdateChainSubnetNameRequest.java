// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateChainSubnetNameRequest extends TeaModel {
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

    // 子链名称
    @NameInMap("subnet_name")
    public String subnetName;

    public static UpdateChainSubnetNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainSubnetNameRequest self = new UpdateChainSubnetNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChainSubnetNameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChainSubnetNameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChainSubnetNameRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateChainSubnetNameRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public UpdateChainSubnetNameRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

}
