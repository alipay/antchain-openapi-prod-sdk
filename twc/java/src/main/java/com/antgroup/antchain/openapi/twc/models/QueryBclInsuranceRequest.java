// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclInsuranceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁宝plus订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 32, minLength = 16)
    public String orderId;

    // 保单单号
    @NameInMap("bcl_insurance_record_id")
    @Validation(maxLength = 64, minLength = 16)
    public String bclInsuranceRecordId;

    public static QueryBclInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBclInsuranceRequest self = new QueryBclInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public QueryBclInsuranceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBclInsuranceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBclInsuranceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryBclInsuranceRequest setBclInsuranceRecordId(String bclInsuranceRecordId) {
        this.bclInsuranceRecordId = bclInsuranceRecordId;
        return this;
    }
    public String getBclInsuranceRecordId() {
        return this.bclInsuranceRecordId;
    }

}
