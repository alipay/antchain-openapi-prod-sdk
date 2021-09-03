// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class UnbindSlxfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 绑定唯一 id
    @NameInMap("bind_id")
    @Validation(required = true)
    public String bindId;

    public static UnbindSlxfRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindSlxfRequest self = new UnbindSlxfRequest();
        return TeaModel.build(map, self);
    }

    public UnbindSlxfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UnbindSlxfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UnbindSlxfRequest setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

}
