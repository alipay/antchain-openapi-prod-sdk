// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ReinitChainPublicCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizid
    @NameInMap("bizid")
    public String bizid;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static ReinitChainPublicCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitChainPublicCertRequest self = new ReinitChainPublicCertRequest();
        return TeaModel.build(map, self);
    }

    public ReinitChainPublicCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitChainPublicCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReinitChainPublicCertRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ReinitChainPublicCertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
