// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 图片MIME类型，目前仅支持 image/jpeg
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 要代理操作的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 图片信息（base64编码）
    @NameInMap("image")
    @Validation(required = true)
    public String image;

    public static UploadImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadImageRequest self = new UploadImageRequest();
        return TeaModel.build(map, self);
    }

    public UploadImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadImageRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UploadImageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadImageRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public UploadImageRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
