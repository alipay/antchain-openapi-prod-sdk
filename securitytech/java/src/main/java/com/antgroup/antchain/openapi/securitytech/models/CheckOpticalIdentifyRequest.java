// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CheckOpticalIdentifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // json数据，包含tenantId,sceneId,outBizId,fakeType,certType
    @NameInMap("reserved_data")
    @Validation(required = true)
    public String reservedData;

    // 图片链接,image_url和image_content 2选1优先选择image_content
    @NameInMap("image_url")
    public String imageUrl;

    // base64编码的图片,image_url和image_content 2选1，优先选择image_content
    @NameInMap("image_content")
    public String imageContent;

    // raas产品码
    @NameInMap("raas_products")
    @Validation(required = true)
    public String raasProducts;

    public static CheckOpticalIdentifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckOpticalIdentifyRequest self = new CheckOpticalIdentifyRequest();
        return TeaModel.build(map, self);
    }

    public CheckOpticalIdentifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckOpticalIdentifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckOpticalIdentifyRequest setReservedData(String reservedData) {
        this.reservedData = reservedData;
        return this;
    }
    public String getReservedData() {
        return this.reservedData;
    }

    public CheckOpticalIdentifyRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CheckOpticalIdentifyRequest setImageContent(String imageContent) {
        this.imageContent = imageContent;
        return this;
    }
    public String getImageContent() {
        return this.imageContent;
    }

    public CheckOpticalIdentifyRequest setRaasProducts(String raasProducts) {
        this.raasProducts = raasProducts;
        return this;
    }
    public String getRaasProducts() {
        return this.raasProducts;
    }

}
