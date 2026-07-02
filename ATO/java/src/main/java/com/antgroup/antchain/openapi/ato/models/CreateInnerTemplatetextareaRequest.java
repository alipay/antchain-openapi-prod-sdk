// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateInnerTemplatetextareaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 模板编码
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 模板版本号
    @NameInMap("template_version")
    @Validation(required = true)
    public String templateVersion;

    // 组件类型，INPUT:单行文本 TEXTAREA:多行文本
    @NameInMap("component_type")
    @Validation(required = true)
    public String componentType;

    // 组件名称（占位符）
    @NameInMap("component_name")
    @Validation(required = true)
    public String componentName;

    // 是否必填
    @NameInMap("required")
    @Validation(required = true)
    public Boolean required;

    // 预估文本行数
    @NameInMap("line")
    public Long line;

    // 多行文本域名称
    @NameInMap("multi_name")
    public String multiName;

    public static CreateInnerTemplatetextareaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInnerTemplatetextareaRequest self = new CreateInnerTemplatetextareaRequest();
        return TeaModel.build(map, self);
    }

    public CreateInnerTemplatetextareaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateInnerTemplatetextareaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateInnerTemplatetextareaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateInnerTemplatetextareaRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateInnerTemplatetextareaRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public CreateInnerTemplatetextareaRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public CreateInnerTemplatetextareaRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public CreateInnerTemplatetextareaRequest setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public CreateInnerTemplatetextareaRequest setLine(Long line) {
        this.line = line;
        return this;
    }
    public Long getLine() {
        return this.line;
    }

    public CreateInnerTemplatetextareaRequest setMultiName(String multiName) {
        this.multiName = multiName;
        return this;
    }
    public String getMultiName() {
        return this.multiName;
    }

}
