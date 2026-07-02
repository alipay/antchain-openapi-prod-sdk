// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class RenderInnerTemplateinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 模板编码集，数组
    @NameInMap("template_codes")
    @Validation(required = true)
    public java.util.List<String> templateCodes;

    // 幂等值
    @NameInMap("idempotent")
    @Validation(required = true)
    public String idempotent;

    // 业务方id，唯一
    @NameInMap("biz_business_id")
    @Validation(required = true)
    public String bizBusinessId;

    // 组件（文本域）的实际值
    @NameInMap("component_inst_dtos")
    @Validation(required = true)
    public java.util.List<TemplateComponent> componentInstDtos;

    public static RenderInnerTemplateinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderInnerTemplateinstanceRequest self = new RenderInnerTemplateinstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenderInnerTemplateinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RenderInnerTemplateinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RenderInnerTemplateinstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public RenderInnerTemplateinstanceRequest setTemplateCodes(java.util.List<String> templateCodes) {
        this.templateCodes = templateCodes;
        return this;
    }
    public java.util.List<String> getTemplateCodes() {
        return this.templateCodes;
    }

    public RenderInnerTemplateinstanceRequest setIdempotent(String idempotent) {
        this.idempotent = idempotent;
        return this;
    }
    public String getIdempotent() {
        return this.idempotent;
    }

    public RenderInnerTemplateinstanceRequest setBizBusinessId(String bizBusinessId) {
        this.bizBusinessId = bizBusinessId;
        return this;
    }
    public String getBizBusinessId() {
        return this.bizBusinessId;
    }

    public RenderInnerTemplateinstanceRequest setComponentInstDtos(java.util.List<TemplateComponent> componentInstDtos) {
        this.componentInstDtos = componentInstDtos;
        return this;
    }
    public java.util.List<TemplateComponent> getComponentInstDtos() {
        return this.componentInstDtos;
    }

}
