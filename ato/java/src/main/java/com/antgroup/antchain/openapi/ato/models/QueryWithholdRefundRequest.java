// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryWithholdRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String orderId;

    // 几期
    // 针对用户履约的第几期进行退款申请
    @NameInMap("period_num")
    public Long periodNum;

    // 外部系统传入的退款请求号
    @NameInMap("refund_request_no")
    @Validation(required = true, maxLength = 128, minLength = 1)
    public String refundRequestNo;

    // 支付类型
    // ORDER_BUYOUT:买断金
    // ORDER_PENALTY:违约金
    // PERFORMANCE:正常履约（默认）
    @NameInMap("pay_type")
    @Validation(maxLength = 64)
    public String payType;

    public static QueryWithholdRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdRefundRequest self = new QueryWithholdRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryWithholdRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWithholdRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWithholdRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryWithholdRefundRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public QueryWithholdRefundRequest setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public QueryWithholdRefundRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

}
