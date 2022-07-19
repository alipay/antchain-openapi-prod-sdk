// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryMypocketDidaccountbyalipayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝Uid
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    public static QueryMypocketDidaccountbyalipayRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypocketDidaccountbyalipayRequest self = new QueryMypocketDidaccountbyalipayRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypocketDidaccountbyalipayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypocketDidaccountbyalipayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypocketDidaccountbyalipayRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

}
