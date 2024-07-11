// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AllInnerTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分页查询结构体
    @NameInMap("page_info")
    @Validation(required = true)
    public PageQuery pageInfo;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 魔法库模板code
    @NameInMap("template_code")
    public String templateCode;

    // 魔法库模板文件名称
    @NameInMap("template_name")
    public String templateName;

    // 线上模板ID
    @NameInMap("template_code_prod")
    public String templateCodeProd;

    public static AllInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AllInnerTemplateRequest self = new AllInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AllInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllInnerTemplateRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public AllInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AllInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public AllInnerTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AllInnerTemplateRequest setTemplateCodeProd(String templateCodeProd) {
        this.templateCodeProd = templateCodeProd;
        return this;
    }
    public String getTemplateCodeProd() {
        return this.templateCodeProd;
    }

}
