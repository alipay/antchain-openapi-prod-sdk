// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncInnerTemplateRequest extends TeaModel {
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

    public static SyncInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerTemplateRequest self = new SyncInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncInnerTemplateRequest setSourceTemplateCode(String sourceTemplateCode) {
        this.sourceTemplateCode = sourceTemplateCode;
        return this;
    }
    public String getSourceTemplateCode() {
        return this.sourceTemplateCode;
    }

    public SyncInnerTemplateRequest setTargetTemplateName(String targetTemplateName) {
        this.targetTemplateName = targetTemplateName;
        return this;
    }
    public String getTargetTemplateName() {
        return this.targetTemplateName;
    }

    public SyncInnerTemplateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SyncInnerTemplateRequest setSourceTemplateVersion(String sourceTemplateVersion) {
        this.sourceTemplateVersion = sourceTemplateVersion;
        return this;
    }
    public String getSourceTemplateVersion() {
        return this.sourceTemplateVersion;
    }

}
