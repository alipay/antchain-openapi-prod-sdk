// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class UpdateInnerTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 魔法库版本id
    @NameInMap("template_version_id")
    @Validation(required = true)
    public String templateVersionId;

    // 模板名称
    @NameInMap("template_name")
    @Validation(required = true)
    public String templateName;

    public static UpdateInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInnerTemplateRequest self = new UpdateInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateInnerTemplateRequest setTemplateVersionId(String templateVersionId) {
        this.templateVersionId = templateVersionId;
        return this;
    }
    public String getTemplateVersionId() {
        return this.templateVersionId;
    }

    public UpdateInnerTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
