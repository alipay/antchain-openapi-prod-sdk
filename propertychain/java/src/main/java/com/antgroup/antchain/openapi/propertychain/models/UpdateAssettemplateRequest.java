// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class UpdateAssettemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模板类型Id
    @NameInMap("category_id")
    public String categoryId;

    // 模板JSON内容
    @NameInMap("content")
    public String content;

    // 数据字典id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 名称
    @NameInMap("template_name")
    public String templateName;

    public static UpdateAssettemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssettemplateRequest self = new UpdateAssettemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAssettemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAssettemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateAssettemplateRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public UpdateAssettemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateAssettemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateAssettemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
