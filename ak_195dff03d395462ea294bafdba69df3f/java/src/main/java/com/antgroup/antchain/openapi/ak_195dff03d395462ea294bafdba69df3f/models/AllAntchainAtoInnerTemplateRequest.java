// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class AllAntchainAtoInnerTemplateRequest extends TeaModel {
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

    public static AllAntchainAtoInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AllAntchainAtoInnerTemplateRequest self = new AllAntchainAtoInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AllAntchainAtoInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AllAntchainAtoInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AllAntchainAtoInnerTemplateRequest setPageInfo(PageQuery pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageQuery getPageInfo() {
        return this.pageInfo;
    }

    public AllAntchainAtoInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public AllAntchainAtoInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public AllAntchainAtoInnerTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public AllAntchainAtoInnerTemplateRequest setTemplateCodeProd(String templateCodeProd) {
        this.templateCodeProd = templateCodeProd;
        return this;
    }
    public String getTemplateCodeProd() {
        return this.templateCodeProd;
    }

}
