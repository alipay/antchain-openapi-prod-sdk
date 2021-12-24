// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercialexternal.models;

import com.aliyun.tea.*;

public class BatchqueryTradecoreSoldspecinstanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商业中台用来唯一标记商户的id merchant_id 与 merchant_login_main_id至少填一个
    @NameInMap("merchant_id")
    public String merchantId;

    // 商户(买家)登录主账号user_id， merchant_id 与 merchant_login_main_id至少填一个
    @NameInMap("merchant_login_main_id")
    public String merchantLoginMainId;

    public static BatchqueryTradecoreSoldspecinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTradecoreSoldspecinstanceRequest self = new BatchqueryTradecoreSoldspecinstanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryTradecoreSoldspecinstanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryTradecoreSoldspecinstanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public BatchqueryTradecoreSoldspecinstanceRequest setMerchantLoginMainId(String merchantLoginMainId) {
        this.merchantLoginMainId = merchantLoginMainId;
        return this;
    }
    public String getMerchantLoginMainId() {
        return this.merchantLoginMainId;
    }

}
