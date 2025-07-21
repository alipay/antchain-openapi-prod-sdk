// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoWithholdRefundRequest extends TeaModel {
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

    // 第几次多期合并支付申请号
    @NameInMap("pay_apply_no")
    public Long payApplyNo;

    public static QueryAntchainAtoWithholdRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoWithholdRefundRequest self = new QueryAntchainAtoWithholdRefundRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoWithholdRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoWithholdRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoWithholdRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryAntchainAtoWithholdRefundRequest setPeriodNum(Long periodNum) {
        this.periodNum = periodNum;
        return this;
    }
    public Long getPeriodNum() {
        return this.periodNum;
    }

    public QueryAntchainAtoWithholdRefundRequest setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public QueryAntchainAtoWithholdRefundRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public QueryAntchainAtoWithholdRefundRequest setPayApplyNo(Long payApplyNo) {
        this.payApplyNo = payApplyNo;
        return this;
    }
    public Long getPayApplyNo() {
        return this.payApplyNo;
    }

}
