// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerTemplateversionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 模板编码
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 模板的版本号，示例：1、2、3等
    @NameInMap("template_version")
    @Validation(required = true)
    public String templateVersion;

    public static QueryInnerTemplateversionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerTemplateversionRequest self = new QueryInnerTemplateversionRequest();
        return TeaModel.build(map, self);
    }

    public QueryInnerTemplateversionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInnerTemplateversionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInnerTemplateversionRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryInnerTemplateversionRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QueryInnerTemplateversionRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
