// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerTemplateinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户8位id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 业务唯一实例id（模板实例化时的业务id）
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 实例化文件是否需要pdf格式
    @NameInMap("need_pdf_file")
    @Validation(required = true)
    public Boolean needPdfFile;

    public static QueryInnerTemplateinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerTemplateinstanceRequest self = new QueryInnerTemplateinstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerTemplateinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerTemplateinstanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerTemplateinstanceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerTemplateinstanceRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QueryInnerTemplateinstanceRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QueryInnerTemplateinstanceRequest setNeedPdfFile(Boolean needPdfFile) {
        this.needPdfFile = needPdfFile;
        return this;
    }
    public Boolean getNeedPdfFile() {
        return this.needPdfFile;
    }

}
