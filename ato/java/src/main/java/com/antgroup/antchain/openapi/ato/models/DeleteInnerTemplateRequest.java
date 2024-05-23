// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class DeleteInnerTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 魔法库模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 魔法库模板版本
    @NameInMap("template_version")
    @Validation(required = true)
    public String templateVersion;

    // 魔法库模板版本id
    @NameInMap("template_version_id")
    @Validation(required = true)
    public String templateVersionId;

    public static DeleteInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInnerTemplateRequest self = new DeleteInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DeleteInnerTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public DeleteInnerTemplateRequest setTemplateVersionId(String templateVersionId) {
        this.templateVersionId = templateVersionId;
        return this;
    }
    public String getTemplateVersionId() {
        return this.templateVersionId;
    }

}
