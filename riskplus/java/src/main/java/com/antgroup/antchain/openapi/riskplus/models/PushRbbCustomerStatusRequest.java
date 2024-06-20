// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRbbCustomerStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 结果数据
    @NameInMap("result_data")
    @Validation(required = true)
    public String resultData;

    public static PushRbbCustomerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRbbCustomerStatusRequest self = new PushRbbCustomerStatusRequest();
        return TeaModel.build(map, self);
    }

    public PushRbbCustomerStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRbbCustomerStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRbbCustomerStatusRequest setResultData(String resultData) {
        this.resultData = resultData;
        return this;
    }
    public String getResultData() {
        return this.resultData;
    }

}
