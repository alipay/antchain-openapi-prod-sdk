// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitDeviceriskReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // request_data
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static SubmitDeviceriskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDeviceriskReportRequest self = new SubmitDeviceriskReportRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDeviceriskReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitDeviceriskReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitDeviceriskReportRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
