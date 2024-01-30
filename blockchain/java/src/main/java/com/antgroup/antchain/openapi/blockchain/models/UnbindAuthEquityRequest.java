// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UnbindAuthEquityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权益开通时ISV返回的业务订单号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    public static UnbindAuthEquityRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAuthEquityRequest self = new UnbindAuthEquityRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAuthEquityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindAuthEquityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindAuthEquityRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

}
