// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class CreateShortmsgTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 唯一请求id
    @NameInMap("request_unique_id")
    @Validation(required = true)
    public String requestUniqueId;

    // 短信签名名称，不需要带着【】
    @NameInMap("sign_name")
    @Validation(required = true)
    public String signName;

    // 短信内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    // 校验传入的参数是否有变量
    @NameInMap("variable_template")
    @Validation(required = true)
    public Boolean variableTemplate;

    public static CreateShortmsgTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShortmsgTemplateRequest self = new CreateShortmsgTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateShortmsgTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateShortmsgTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateShortmsgTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateShortmsgTemplateRequest setRequestUniqueId(String requestUniqueId) {
        this.requestUniqueId = requestUniqueId;
        return this;
    }
    public String getRequestUniqueId() {
        return this.requestUniqueId;
    }

    public CreateShortmsgTemplateRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateShortmsgTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateShortmsgTemplateRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateShortmsgTemplateRequest setVariableTemplate(Boolean variableTemplate) {
        this.variableTemplate = variableTemplate;
        return this;
    }
    public Boolean getVariableTemplate() {
        return this.variableTemplate;
    }

}
