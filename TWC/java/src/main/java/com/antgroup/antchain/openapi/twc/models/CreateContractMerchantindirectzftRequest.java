// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractMerchantindirectzftRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入驻材料
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static CreateContractMerchantindirectzftRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractMerchantindirectzftRequest self = new CreateContractMerchantindirectzftRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractMerchantindirectzftRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractMerchantindirectzftRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractMerchantindirectzftRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
