// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ent.models;

import com.aliyun.tea.*;

public class GetTppSharecodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 分享人在淘票票端绑定的支付宝UID
    @NameInMap("alipay_uid")
    @Validation(required = true)
    public String alipayUid;

    public static GetTppSharecodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTppSharecodeRequest self = new GetTppSharecodeRequest();
        return TeaModel.build(map, self);
    }

    public GetTppSharecodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTppSharecodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTppSharecodeRequest setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

}
