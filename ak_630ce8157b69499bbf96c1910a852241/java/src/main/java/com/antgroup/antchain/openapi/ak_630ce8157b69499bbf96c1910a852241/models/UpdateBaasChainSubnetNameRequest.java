// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class UpdateBaasChainSubnetNameRequest extends TeaModel {
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

    public static UpdateBaasChainSubnetNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBaasChainSubnetNameRequest self = new UpdateBaasChainSubnetNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBaasChainSubnetNameRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBaasChainSubnetNameRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBaasChainSubnetNameRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateBaasChainSubnetNameRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public UpdateBaasChainSubnetNameRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

}
