// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class InitGatewayRoadRequest extends TeaModel {
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
    @Validation(required = true, maximum = 5, minimum = 1)
    public Long count;

    // 请求描述
    @NameInMap("desc")
    @Validation(maxLength = 15, minLength = 5)
    public String desc;

    public static InitGatewayRoadRequest build(java.util.Map<String, ?> map) throws Exception {
        InitGatewayRoadRequest self = new InitGatewayRoadRequest();
        return TeaModel.build(map, self);
    }

    public InitGatewayRoadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitGatewayRoadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitGatewayRoadRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public InitGatewayRoadRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public InitGatewayRoadRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public InitGatewayRoadRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
