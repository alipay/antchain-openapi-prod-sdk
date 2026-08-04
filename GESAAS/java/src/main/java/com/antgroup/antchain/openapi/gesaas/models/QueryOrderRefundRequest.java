// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class QueryOrderRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 退款退分账唯一标识
    @NameInMap("refund_record_no")
    @Validation(required = true)
    public String refundRecordNo;

    public static QueryOrderRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderRefundRequest self = new QueryOrderRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrderRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryOrderRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryOrderRefundRequest setRefundRecordNo(String refundRecordNo) {
        this.refundRecordNo = refundRecordNo;
        return this;
    }
    public String getRefundRecordNo() {
        return this.refundRecordNo;
    }

}
