// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncTradeIndirectorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务参数,json.toString
    @NameInMap("biz_content")
    @Validation(required = true, minLength = 1)
    public String bizContent;

    public static SyncTradeIndirectorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncTradeIndirectorderRequest self = new SyncTradeIndirectorderRequest();
        return TeaModel.build(map, self);
    }

    public SyncTradeIndirectorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncTradeIndirectorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncTradeIndirectorderRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
