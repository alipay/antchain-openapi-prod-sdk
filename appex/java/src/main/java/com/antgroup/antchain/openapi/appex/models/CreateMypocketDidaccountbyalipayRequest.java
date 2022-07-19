// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateMypocketDidaccountbyalipayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝Uid
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    public static CreateMypocketDidaccountbyalipayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMypocketDidaccountbyalipayRequest self = new CreateMypocketDidaccountbyalipayRequest();
        return TeaModel.build(map, self);
    }

    public CreateMypocketDidaccountbyalipayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMypocketDidaccountbyalipayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMypocketDidaccountbyalipayRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

}
