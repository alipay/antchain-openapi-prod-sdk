// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class UpdateGoodstemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 商品定义描述，格式如示例
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static UpdateGoodstemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGoodstemplateRequest self = new UpdateGoodstemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGoodstemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateGoodstemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateGoodstemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateGoodstemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
