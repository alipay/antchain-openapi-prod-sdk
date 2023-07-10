// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_8146025f0aa2474a88d81f508253e029.models;

import com.aliyun.tea.*;

public class SubmitHksecuritytechGatewayDeviceriskReportRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // request_data
    @NameInMap("request_data")
    @Validation(required = true)
    public String requestData;

    public static SubmitHksecuritytechGatewayDeviceriskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitHksecuritytechGatewayDeviceriskReportRequest self = new SubmitHksecuritytechGatewayDeviceriskReportRequest();
        return TeaModel.build(map, self);
    }

    public SubmitHksecuritytechGatewayDeviceriskReportRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitHksecuritytechGatewayDeviceriskReportRequest setRequestData(String requestData) {
        this.requestData = requestData;
        return this;
    }
    public String getRequestData() {
        return this.requestData;
    }

}
