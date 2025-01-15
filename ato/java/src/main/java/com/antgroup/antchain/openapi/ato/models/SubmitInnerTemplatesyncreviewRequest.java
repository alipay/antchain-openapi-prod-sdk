// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerTemplatesyncreviewRequest extends TeaModel {
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
    @Validation(required = true)
    public String targetTemplateName;

    // 魔法库来源模板版本
    @NameInMap("source_template_version")
    @Validation(required = true)
    public String sourceTemplateVersion;

    public static SubmitInnerTemplatesyncreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerTemplatesyncreviewRequest self = new SubmitInnerTemplatesyncreviewRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerTemplatesyncreviewRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitInnerTemplatesyncreviewRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitInnerTemplatesyncreviewRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitInnerTemplatesyncreviewRequest setSourceTemplateCode(String sourceTemplateCode) {
        this.sourceTemplateCode = sourceTemplateCode;
        return this;
    }
    public String getSourceTemplateCode() {
        return this.sourceTemplateCode;
    }

    public SubmitInnerTemplatesyncreviewRequest setTargetTemplateName(String targetTemplateName) {
        this.targetTemplateName = targetTemplateName;
        return this;
    }
    public String getTargetTemplateName() {
        return this.targetTemplateName;
    }

    public SubmitInnerTemplatesyncreviewRequest setSourceTemplateVersion(String sourceTemplateVersion) {
        this.sourceTemplateVersion = sourceTemplateVersion;
        return this;
    }
    public String getSourceTemplateVersion() {
        return this.sourceTemplateVersion;
    }

}
