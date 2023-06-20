// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RecognizeIifaaDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备唯一ID
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    public static RecognizeIifaaDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIifaaDeviceRequest self = new RecognizeIifaaDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeIifaaDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RecognizeIifaaDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RecognizeIifaaDeviceRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

}
