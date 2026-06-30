// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeprecateIifaaDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备唯一ID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    public static DeprecateIifaaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeprecateIifaaDeviceRequest self = new DeprecateIifaaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeprecateIifaaDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeprecateIifaaDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeprecateIifaaDeviceRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

}
