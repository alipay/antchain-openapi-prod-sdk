// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractMerchantimageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 图片内容，base64
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 图片名称
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static CreateContractMerchantimageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractMerchantimageRequest self = new CreateContractMerchantimageRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractMerchantimageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractMerchantimageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractMerchantimageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateContractMerchantimageRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
