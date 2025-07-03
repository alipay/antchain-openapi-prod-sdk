// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CloneAntchainAtoInnerTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 魔法库对应模板的模板复制id
    @NameInMap("voucher_id")
    @Validation(required = true)
    public String voucherId;

    public static CloneAntchainAtoInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneAntchainAtoInnerTemplateRequest self = new CloneAntchainAtoInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CloneAntchainAtoInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloneAntchainAtoInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloneAntchainAtoInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CloneAntchainAtoInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CloneAntchainAtoInnerTemplateRequest setVoucherId(String voucherId) {
        this.voucherId = voucherId;
        return this;
    }
    public String getVoucherId() {
        return this.voucherId;
    }

}
