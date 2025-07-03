// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoInnerTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 来源魔法库模板code
    @NameInMap("source_template_code")
    @Validation(required = true)
    public String sourceTemplateCode;

    // 目标魔法库模板名称
    @NameInMap("target_template_name")
    public String targetTemplateName;

    // 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 魔法库来源模板版本
    @NameInMap("source_template_version")
    @Validation(required = true)
    public String sourceTemplateVersion;

    public static SyncAntchainAtoInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoInnerTemplateRequest self = new SyncAntchainAtoInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncAntchainAtoInnerTemplateRequest setSourceTemplateCode(String sourceTemplateCode) {
        this.sourceTemplateCode = sourceTemplateCode;
        return this;
    }
    public String getSourceTemplateCode() {
        return this.sourceTemplateCode;
    }

    public SyncAntchainAtoInnerTemplateRequest setTargetTemplateName(String targetTemplateName) {
        this.targetTemplateName = targetTemplateName;
        return this;
    }
    public String getTargetTemplateName() {
        return this.targetTemplateName;
    }

    public SyncAntchainAtoInnerTemplateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SyncAntchainAtoInnerTemplateRequest setSourceTemplateVersion(String sourceTemplateVersion) {
        this.sourceTemplateVersion = sourceTemplateVersion;
        return this;
    }
    public String getSourceTemplateVersion() {
        return this.sourceTemplateVersion;
    }

}
