// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class CreateGoodsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商品模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 商品信息
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static CreateGoodsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGoodsRequest self = new CreateGoodsRequest();
        return TeaModel.build(map, self);
    }

    public CreateGoodsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateGoodsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateGoodsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateGoodsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateGoodsRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
