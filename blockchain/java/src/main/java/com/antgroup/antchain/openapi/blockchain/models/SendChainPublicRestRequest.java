// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SendChainPublicRestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // access_id
    @NameInMap("access_id")
    @Validation(required = true)
    public String accessId;

    // bizid
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    public static SendChainPublicRestRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChainPublicRestRequest self = new SendChainPublicRestRequest();
        return TeaModel.build(map, self);
    }

    public SendChainPublicRestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SendChainPublicRestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SendChainPublicRestRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SendChainPublicRestRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public SendChainPublicRestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
