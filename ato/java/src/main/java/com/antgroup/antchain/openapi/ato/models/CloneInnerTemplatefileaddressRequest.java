// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CloneInnerTemplatefileaddressRequest extends TeaModel {
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

    // 文件key
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    public static CloneInnerTemplatefileaddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneInnerTemplatefileaddressRequest self = new CloneInnerTemplatefileaddressRequest();
        return TeaModel.build(map, self);
    }

    public CloneInnerTemplatefileaddressRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CloneInnerTemplatefileaddressRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CloneInnerTemplatefileaddressRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CloneInnerTemplatefileaddressRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CloneInnerTemplatefileaddressRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
