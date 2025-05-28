// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.eraprod.models;

import com.aliyun.tea.*;

public class OperateAisProxyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参json
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static OperateAisProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateAisProxyRequest self = new OperateAisProxyRequest();
        return TeaModel.build(map, self);
    }

    public OperateAisProxyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public OperateAisProxyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public OperateAisProxyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
