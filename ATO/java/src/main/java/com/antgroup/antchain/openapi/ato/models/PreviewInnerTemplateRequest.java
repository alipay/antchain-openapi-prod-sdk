// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PreviewInnerTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 文件oss存储的key
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    public static PreviewInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewInnerTemplateRequest self = new PreviewInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PreviewInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PreviewInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PreviewInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PreviewInnerTemplateRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
