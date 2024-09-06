// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class QueryAntdigitalMediasmsTemplateStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 彩信模版id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static QueryAntdigitalMediasmsTemplateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalMediasmsTemplateStatusRequest self = new QueryAntdigitalMediasmsTemplateStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalMediasmsTemplateStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntdigitalMediasmsTemplateStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntdigitalMediasmsTemplateStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntdigitalMediasmsTemplateStatusRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
