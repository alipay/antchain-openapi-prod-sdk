// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoMerchantexpandMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户入驻返回的进件编号 expand_mode=AGENT必填
    @NameInMap("pay_expand_id")
    @Validation(required = true)
    public String payExpandId;

    public static QueryAntchainAtoMerchantexpandMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoMerchantexpandMerchantRequest self = new QueryAntchainAtoMerchantexpandMerchantRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoMerchantexpandMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoMerchantexpandMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoMerchantexpandMerchantRequest setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

}
