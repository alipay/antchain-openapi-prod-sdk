// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class PublishAntchainAtoInnerTemplateRequest extends TeaModel {
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

    public static PublishAntchainAtoInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAntchainAtoInnerTemplateRequest self = new PublishAntchainAtoInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PublishAntchainAtoInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PublishAntchainAtoInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PublishAntchainAtoInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PublishAntchainAtoInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public PublishAntchainAtoInnerTemplateRequest setTemplateVersionId(String templateVersionId) {
        this.templateVersionId = templateVersionId;
        return this;
    }
    public String getTemplateVersionId() {
        return this.templateVersionId;
    }

    public PublishAntchainAtoInnerTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
