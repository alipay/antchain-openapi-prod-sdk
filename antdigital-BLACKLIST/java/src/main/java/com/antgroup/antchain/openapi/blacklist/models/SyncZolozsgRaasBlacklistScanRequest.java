// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blacklist.models;

import com.aliyun.tea.*;

public class SyncZolozsgRaasBlacklistScanRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static SyncZolozsgRaasBlacklistScanRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncZolozsgRaasBlacklistScanRequest self = new SyncZolozsgRaasBlacklistScanRequest();
        return TeaModel.build(map, self);
    }

    public SyncZolozsgRaasBlacklistScanRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncZolozsgRaasBlacklistScanRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
