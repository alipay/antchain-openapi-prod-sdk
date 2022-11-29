// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ExecGatewayRoadRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求执行编号
    @NameInMap("exec_num")
    @Validation(required = true)
    public Long execNum;

    public static ExecGatewayRoadRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecGatewayRoadRequest self = new ExecGatewayRoadRequest();
        return TeaModel.build(map, self);
    }

    public ExecGatewayRoadRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecGatewayRoadRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecGatewayRoadRequest setExecNum(Long execNum) {
        this.execNum = execNum;
        return this;
    }
    public Long getExecNum() {
        return this.execNum;
    }

}
