// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ListContractDeductorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户支付宝2088uid
    @NameInMap("alipay_user_id")
    @Validation(required = true)
    public String alipayUserId;

    public static ListContractDeductorderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContractDeductorderRequest self = new ListContractDeductorderRequest();
        return TeaModel.build(map, self);
    }

    public ListContractDeductorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListContractDeductorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListContractDeductorderRequest setAlipayUserId(String alipayUserId) {
        this.alipayUserId = alipayUserId;
        return this;
    }
    public String getAlipayUserId() {
        return this.alipayUserId;
    }

}
