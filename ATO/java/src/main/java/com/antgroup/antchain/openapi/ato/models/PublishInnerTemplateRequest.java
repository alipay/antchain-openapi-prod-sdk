// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PublishInnerTemplateRequest extends TeaModel {
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

    // 魔法库版本id
    @NameInMap("template_version_id")
    @Validation(required = true)
    public String templateVersionId;

    // 合同模板制作版本id
    @NameInMap("template_version")
    public String templateVersion;

    public static PublishInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishInnerTemplateRequest self = new PublishInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PublishInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PublishInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public PublishInnerTemplateRequest setTemplateVersionId(String templateVersionId) {
        this.templateVersionId = templateVersionId;
        return this;
    }
    public String getTemplateVersionId() {
        return this.templateVersionId;
    }

    public PublishInnerTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
