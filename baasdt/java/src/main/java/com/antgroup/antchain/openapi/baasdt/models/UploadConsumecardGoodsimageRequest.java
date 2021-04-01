// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UploadConsumecardGoodsimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

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

    // 图片信息（base64编码）列表
    @NameInMap("image")
    @Validation(required = true)
    public java.util.List<String> image;

    // 场景码(入驻时申请)
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    public static UploadConsumecardGoodsimageRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadConsumecardGoodsimageRequest self = new UploadConsumecardGoodsimageRequest();
        return TeaModel.build(map, self);
    }

    public UploadConsumecardGoodsimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadConsumecardGoodsimageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadConsumecardGoodsimageRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UploadConsumecardGoodsimageRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public UploadConsumecardGoodsimageRequest setImage(java.util.List<String> image) {
        this.image = image;
        return this;
    }
    public java.util.List<String> getImage() {
        return this.image;
    }

    public UploadConsumecardGoodsimageRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
