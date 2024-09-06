// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class CreateAntdigitalMediasmsTemplateRequest extends TeaModel {
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

    // 是否变量模版
    @NameInMap("variable_template")
    @Validation(required = true)
    public Boolean variableTemplate;

    // 彩信标题，不超过50个长度，收件人可感知
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

    public static CreateAntdigitalMediasmsTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntdigitalMediasmsTemplateRequest self = new CreateAntdigitalMediasmsTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntdigitalMediasmsTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntdigitalMediasmsTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntdigitalMediasmsTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateAntdigitalMediasmsTemplateRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public CreateAntdigitalMediasmsTemplateRequest setVariableTemplate(Boolean variableTemplate) {
        this.variableTemplate = variableTemplate;
        return this;
    }
    public Boolean getVariableTemplate() {
        return this.variableTemplate;
    }

    public CreateAntdigitalMediasmsTemplateRequest setSmsTitle(String smsTitle) {
        this.smsTitle = smsTitle;
        return this;
    }
    public String getSmsTitle() {
        return this.smsTitle;
    }

    public CreateAntdigitalMediasmsTemplateRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateAntdigitalMediasmsTemplateRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateAntdigitalMediasmsTemplateRequest setMaterial(java.util.List<SmsMaterial> material) {
        this.material = material;
        return this;
    }
    public java.util.List<SmsMaterial> getMaterial() {
        return this.material;
    }

}
