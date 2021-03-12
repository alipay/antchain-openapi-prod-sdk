// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateChainNameAntRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // ant_chain_name
    @NameInMap("ant_chain_name")
    @Validation(required = true)
    public String antChainName;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static UpdateChainNameAntRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChainNameAntRequest self = new UpdateChainNameAntRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChainNameAntRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateChainNameAntRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateChainNameAntRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateChainNameAntRequest setAntChainName(String antChainName) {
        this.antChainName = antChainName;
        return this;
    }
    public String getAntChainName() {
        return this.antChainName;
    }

    public UpdateChainNameAntRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
