// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ReinitChainPublicRestRequest extends TeaModel {
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

    // vcode
    @NameInMap("vcode")
    @Validation(required = true)
    public String vcode;

    public static ReinitChainPublicRestRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitChainPublicRestRequest self = new ReinitChainPublicRestRequest();
        return TeaModel.build(map, self);
    }

    public ReinitChainPublicRestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitChainPublicRestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReinitChainPublicRestRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ReinitChainPublicRestRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ReinitChainPublicRestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReinitChainPublicRestRequest setVcode(String vcode) {
        this.vcode = vcode;
        return this;
    }
    public String getVcode() {
        return this.vcode;
    }

}
