// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CheckSecurityDataRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参为Map转换后的String
    @NameInMap("req_info")
    @Validation(required = true)
    public String reqInfo;

    public static CheckSecurityDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityDataRequest self = new CheckSecurityDataRequest();
        return TeaModel.build(map, self);
    }

    public CheckSecurityDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckSecurityDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckSecurityDataRequest setReqInfo(String reqInfo) {
        this.reqInfo = reqInfo;
        return this;
    }
    public String getReqInfo() {
        return this.reqInfo;
    }

}
