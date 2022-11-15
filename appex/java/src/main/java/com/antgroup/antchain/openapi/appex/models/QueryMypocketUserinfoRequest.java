// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryMypocketUserinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝uid
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    public static QueryMypocketUserinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMypocketUserinfoRequest self = new QueryMypocketUserinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMypocketUserinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMypocketUserinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMypocketUserinfoRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

}
