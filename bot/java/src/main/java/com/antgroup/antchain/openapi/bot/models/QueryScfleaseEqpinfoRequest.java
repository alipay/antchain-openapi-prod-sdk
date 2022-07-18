// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryScfleaseEqpinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备识别号
    @NameInMap("device_no")
    @Validation(required = true)
    public String deviceNo;

    // 运营日期
    @NameInMap("operation_date")
    @Validation(required = true)
    public String operationDate;

    public static QueryScfleaseEqpinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryScfleaseEqpinfoRequest self = new QueryScfleaseEqpinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryScfleaseEqpinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryScfleaseEqpinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryScfleaseEqpinfoRequest setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
        return this;
    }
    public String getDeviceNo() {
        return this.deviceNo;
    }

    public QueryScfleaseEqpinfoRequest setOperationDate(String operationDate) {
        this.operationDate = operationDate;
        return this;
    }
    public String getOperationDate() {
        return this.operationDate;
    }

}
