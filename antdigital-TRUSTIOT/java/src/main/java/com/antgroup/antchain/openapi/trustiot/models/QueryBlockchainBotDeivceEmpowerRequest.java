// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trustiot.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotDeivceEmpowerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    public String scene;

    // 统一社会信用代码与场景码不能同时为空
    @NameInMap("operator_id")
    public String operatorId;

    // 设备ID
    @NameInMap("device_id")
    public String deviceId;

    // 查询授权日期 YYYY-MM-DD
    @NameInMap("query_date")
    @Validation(required = true)
    public String queryDate;

    public static QueryBlockchainBotDeivceEmpowerRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotDeivceEmpowerRequest self = new QueryBlockchainBotDeivceEmpowerRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotDeivceEmpowerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainBotDeivceEmpowerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainBotDeivceEmpowerRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryBlockchainBotDeivceEmpowerRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryBlockchainBotDeivceEmpowerRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public QueryBlockchainBotDeivceEmpowerRequest setQueryDate(String queryDate) {
        this.queryDate = queryDate;
        return this;
    }
    public String getQueryDate() {
        return this.queryDate;
    }

}
