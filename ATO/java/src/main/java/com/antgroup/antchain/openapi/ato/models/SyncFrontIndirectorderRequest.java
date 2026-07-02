// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFrontIndirectorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务参数,json.toString
    @NameInMap("biz_content")
    @Validation(required = true, minLength = 1)
    public String bizContent;

    public static SyncFrontIndirectorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFrontIndirectorderRequest self = new SyncFrontIndirectorderRequest();
        return TeaModel.build(map, self);
    }

    public SyncFrontIndirectorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFrontIndirectorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFrontIndirectorderRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
