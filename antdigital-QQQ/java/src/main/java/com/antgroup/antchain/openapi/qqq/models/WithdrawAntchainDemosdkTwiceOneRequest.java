// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class WithdrawAntchainDemosdkTwiceOneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时时间
    @NameInMap("timeout")
    public String timeout;

    public static WithdrawAntchainDemosdkTwiceOneRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawAntchainDemosdkTwiceOneRequest self = new WithdrawAntchainDemosdkTwiceOneRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawAntchainDemosdkTwiceOneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public WithdrawAntchainDemosdkTwiceOneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public WithdrawAntchainDemosdkTwiceOneRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
