// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ReinitChainRestAntRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // access_id
    @NameInMap("access_id")
    @Validation(required = true)
    public String accessId;

    // ant_chain_id
    @NameInMap("ant_chain_id")
    @Validation(required = true)
    public String antChainId;

    // consortium_id
    @NameInMap("consortium_id")
    @Validation(required = true)
    public String consortiumId;

    // region_id
    @NameInMap("region_id")
    public String regionId;

    // vcode
    @NameInMap("vcode")
    @Validation(required = true)
    public String vcode;

    public static ReinitChainRestAntRequest build(java.util.Map<String, ?> map) throws Exception {
        ReinitChainRestAntRequest self = new ReinitChainRestAntRequest();
        return TeaModel.build(map, self);
    }

    public ReinitChainRestAntRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReinitChainRestAntRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReinitChainRestAntRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ReinitChainRestAntRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ReinitChainRestAntRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public ReinitChainRestAntRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ReinitChainRestAntRequest setVcode(String vcode) {
        this.vcode = vcode;
        return this;
    }
    public String getVcode() {
        return this.vcode;
    }

}
