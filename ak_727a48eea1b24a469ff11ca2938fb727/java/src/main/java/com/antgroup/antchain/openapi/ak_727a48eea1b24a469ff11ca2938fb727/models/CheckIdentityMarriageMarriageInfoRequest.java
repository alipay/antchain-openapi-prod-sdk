// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_727a48eea1b24a469ff11ca2938fb727.models;

import com.aliyun.tea.*;

public class CheckIdentityMarriageMarriageInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 加密字段
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static CheckIdentityMarriageMarriageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckIdentityMarriageMarriageInfoRequest self = new CheckIdentityMarriageMarriageInfoRequest();
        return TeaModel.build(map, self);
    }

    public CheckIdentityMarriageMarriageInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckIdentityMarriageMarriageInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckIdentityMarriageMarriageInfoRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
