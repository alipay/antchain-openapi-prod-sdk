// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class BatchcreateInnerTemplatetextareaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 批量常创建文本域列表
    @NameInMap("templatetextarea_component")
    @Validation(required = true)
    public java.util.List<TemplateTextAreaComponent> templatetextareaComponent;

    public static BatchcreateInnerTemplatetextareaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateInnerTemplatetextareaRequest self = new BatchcreateInnerTemplatetextareaRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateInnerTemplatetextareaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateInnerTemplatetextareaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateInnerTemplatetextareaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchcreateInnerTemplatetextareaRequest setTemplatetextareaComponent(java.util.List<TemplateTextAreaComponent> templatetextareaComponent) {
        this.templatetextareaComponent = templatetextareaComponent;
        return this;
    }
    public java.util.List<TemplateTextAreaComponent> getTemplatetextareaComponent() {
        return this.templatetextareaComponent;
    }

}
