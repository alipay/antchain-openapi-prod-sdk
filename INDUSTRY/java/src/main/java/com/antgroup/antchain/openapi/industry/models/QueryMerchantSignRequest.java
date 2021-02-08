// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.industry.models;

import com.aliyun.tea.*;

public class QueryMerchantSignRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // source, 由中台为业务方分配, 标识业务来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // 申请单id, 跟merchant_user_id不能同时为空
    @NameInMap("order_id")
    public String orderId;

    // 平台方下的用户id, 保持唯一，跟order_id不能同时为空; 如果只传该字段, 获取该用户id的最新一次进件结果
    @NameInMap("merchant_user_id")
    public String merchantUserId;

    public static QueryMerchantSignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantSignRequest self = new QueryMerchantSignRequest();
        return TeaModel.build(map, self);
    }

    public QueryMerchantSignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMerchantSignRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public QueryMerchantSignRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryMerchantSignRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

}
