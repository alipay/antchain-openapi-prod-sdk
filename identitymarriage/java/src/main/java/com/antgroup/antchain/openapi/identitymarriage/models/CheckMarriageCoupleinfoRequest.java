// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.identitymarriage.models;

import com.aliyun.tea.*;

public class CheckMarriageCoupleinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加密字段
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static CheckMarriageCoupleinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMarriageCoupleinfoRequest self = new CheckMarriageCoupleinfoRequest();
        return TeaModel.build(map, self);
    }

    public CheckMarriageCoupleinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckMarriageCoupleinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckMarriageCoupleinfoRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
