// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class DeleteAntchainAtoInnerTemplateRequest extends TeaModel {
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

    public static DeleteAntchainAtoInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntchainAtoInnerTemplateRequest self = new DeleteAntchainAtoInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntchainAtoInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAntchainAtoInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAntchainAtoInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DeleteAntchainAtoInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public DeleteAntchainAtoInnerTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public DeleteAntchainAtoInnerTemplateRequest setTemplateVersionId(String templateVersionId) {
        this.templateVersionId = templateVersionId;
        return this;
    }
    public String getTemplateVersionId() {
        return this.templateVersionId;
    }

}
