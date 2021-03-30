// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 字典id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 数据字典内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 用户标识
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImportassetRequest self = new CreateImportassetRequest();
        return TeaModel.build(map, self);
    }

    public CreateImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateImportassetRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateImportassetRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
