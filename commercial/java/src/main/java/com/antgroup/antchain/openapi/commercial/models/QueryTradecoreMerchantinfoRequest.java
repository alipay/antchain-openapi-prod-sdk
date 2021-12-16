// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class QueryTradecoreMerchantinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商业中台唯一标识商户的id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    public static QueryTradecoreMerchantinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTradecoreMerchantinfoRequest self = new QueryTradecoreMerchantinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryTradecoreMerchantinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTradecoreMerchantinfoRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
