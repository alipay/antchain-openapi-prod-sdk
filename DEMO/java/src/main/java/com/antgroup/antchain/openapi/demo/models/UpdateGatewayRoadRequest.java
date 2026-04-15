// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class UpdateGatewayRoadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 请求编号
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    // 原信息
    @NameInMap("origin_info")
    @Validation(required = true)
    public String originInfo;

    public static UpdateGatewayRoadRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRoadRequest self = new UpdateGatewayRoadRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRoadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateGatewayRoadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateGatewayRoadRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public UpdateGatewayRoadRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateGatewayRoadRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public UpdateGatewayRoadRequest setOriginInfo(String originInfo) {
        this.originInfo = originInfo;
        return this;
    }
    public String getOriginInfo() {
        return this.originInfo;
    }

}
