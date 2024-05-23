// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFrontIndirectorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务参数,json.toString
    @NameInMap("biz_content")
    @Validation(required = true, minLength = 1)
    public String bizContent;

    public static SyncAntchainAtoFrontIndirectorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFrontIndirectorderRequest self = new SyncAntchainAtoFrontIndirectorderRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFrontIndirectorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFrontIndirectorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFrontIndirectorderRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
