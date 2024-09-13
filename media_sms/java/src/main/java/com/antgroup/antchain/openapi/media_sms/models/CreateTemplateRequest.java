// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class CreateTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 请求唯一id
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    // 是否为变量类型模版，默认true
    @NameInMap("variable_template")
    public Boolean variableTemplate;

    // 短信标题，不超过50个长度，收件人可感知
    @NameInMap("sms_title")
    @Validation(required = true)
    public String smsTitle;

    // 签名名称
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    // 素材内容
    @NameInMap("material")
    @Validation(required = true)
    public java.util.List<SmsMaterial> material;

    public static CreateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRequest self = new CreateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTemplateRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public CreateTemplateRequest setVariableTemplate(Boolean variableTemplate) {
        this.variableTemplate = variableTemplate;
        return this;
    }
    public Boolean getVariableTemplate() {
        return this.variableTemplate;
    }

    public CreateTemplateRequest setSmsTitle(String smsTitle) {
        this.smsTitle = smsTitle;
        return this;
    }
    public String getSmsTitle() {
        return this.smsTitle;
    }

    public CreateTemplateRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateTemplateRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateTemplateRequest setMaterial(java.util.List<SmsMaterial> material) {
        this.material = material;
        return this;
    }
    public java.util.List<SmsMaterial> getMaterial() {
        return this.material;
    }

}
