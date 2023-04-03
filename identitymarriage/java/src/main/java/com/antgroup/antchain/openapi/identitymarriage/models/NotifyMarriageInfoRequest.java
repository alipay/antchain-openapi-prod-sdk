// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.identitymarriage.models;

import com.aliyun.tea.*;

public class NotifyMarriageInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizContent
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static NotifyMarriageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyMarriageInfoRequest self = new NotifyMarriageInfoRequest();
        return TeaModel.build(map, self);
    }

    public NotifyMarriageInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyMarriageInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyMarriageInfoRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
