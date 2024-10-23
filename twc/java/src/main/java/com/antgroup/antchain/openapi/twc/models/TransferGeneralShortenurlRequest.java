// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class TransferGeneralShortenurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 对接雨燕（basement）短网址服务
    @NameInMap("source_url")
    @Validation(required = true)
    public String sourceUrl;

    public static TransferGeneralShortenurlRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferGeneralShortenurlRequest self = new TransferGeneralShortenurlRequest();
        return TeaModel.build(map, self);
    }

    public TransferGeneralShortenurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TransferGeneralShortenurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TransferGeneralShortenurlRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

}
