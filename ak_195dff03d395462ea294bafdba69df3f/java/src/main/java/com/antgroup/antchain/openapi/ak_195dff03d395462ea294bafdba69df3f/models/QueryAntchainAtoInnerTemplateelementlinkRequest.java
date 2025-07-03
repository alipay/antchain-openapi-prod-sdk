// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerTemplateelementlinkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 模板版本
    @NameInMap("template_version")
    @Validation(required = true)
    public String templateVersion;

    public static QueryAntchainAtoInnerTemplateelementlinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerTemplateelementlinkRequest self = new QueryAntchainAtoInnerTemplateelementlinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerTemplateelementlinkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoInnerTemplateelementlinkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoInnerTemplateelementlinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryAntchainAtoInnerTemplateelementlinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public QueryAntchainAtoInnerTemplateelementlinkRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
