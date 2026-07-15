// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class TransferInnerShorturlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对接雨燕（basement）短网址服务
    @NameInMap("source_url")
    @Validation(required = true)
    public String sourceUrl;

    public static TransferInnerShorturlRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferInnerShorturlRequest self = new TransferInnerShorturlRequest();
        return TeaModel.build(map, self);
    }

    public TransferInnerShorturlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TransferInnerShorturlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TransferInnerShorturlRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

}
