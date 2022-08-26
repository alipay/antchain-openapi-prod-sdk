// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b08c548e3a88469c89fe27adc3d0b925.models;

import com.aliyun.tea.*;

public class BindDemoDemoCheckEeeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    public static BindDemoDemoCheckEeeRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDemoDemoCheckEeeRequest self = new BindDemoDemoCheckEeeRequest();
        return TeaModel.build(map, self);
    }

    public BindDemoDemoCheckEeeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BindDemoDemoCheckEeeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

}
