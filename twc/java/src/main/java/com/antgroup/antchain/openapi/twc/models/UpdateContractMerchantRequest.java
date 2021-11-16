// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UpdateContractMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 内容和商户进件信息类似，唯一区别在于此接口biz_content不要传external_id，改为传之前进件获取到的商户id信息smid，具体可见示例。
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static UpdateContractMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContractMerchantRequest self = new UpdateContractMerchantRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContractMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateContractMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateContractMerchantRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
