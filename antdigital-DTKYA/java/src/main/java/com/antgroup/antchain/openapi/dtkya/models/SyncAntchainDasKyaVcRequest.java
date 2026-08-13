// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SyncAntchainDasKyaVcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // vc内容
    @NameInMap("vc_content")
    @Validation(required = true)
    public String vcContent;

    public static SyncAntchainDasKyaVcRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainDasKyaVcRequest self = new SyncAntchainDasKyaVcRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainDasKyaVcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainDasKyaVcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainDasKyaVcRequest setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

}
