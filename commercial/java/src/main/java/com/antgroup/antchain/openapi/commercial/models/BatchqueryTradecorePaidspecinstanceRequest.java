// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class BatchqueryTradecorePaidspecinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商业中台用来唯一标记商户的id
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    public static BatchqueryTradecorePaidspecinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTradecorePaidspecinstanceRequest self = new BatchqueryTradecorePaidspecinstanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryTradecorePaidspecinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryTradecorePaidspecinstanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

}
