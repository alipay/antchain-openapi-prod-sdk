// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateOnetimeRefundRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 外部系统传入的退款请求号
    @NameInMap("refund_request_no")
    @Validation(required = true)
    public String refundRequestNo;

    // 本次请求的退款金额，单位为分
    // 1234=12.34元
    @NameInMap("refund_money")
    @Validation(required = true)
    public Long refundMoney;

    // 退款原因
    @NameInMap("refund_reason")
    public String refundReason;

    // 退分账信息列表（最多支持10家分账方退分账信息），金额单位分
    @NameInMap("refund_divide_trans_out_info_list")
    public String refundDivideTransOutInfoList;

    public static CreateOnetimeRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOnetimeRefundRequest self = new CreateOnetimeRefundRequest();
        return TeaModel.build(map, self);
    }

    public CreateOnetimeRefundRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateOnetimeRefundRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateOnetimeRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateOnetimeRefundRequest setRefundRequestNo(String refundRequestNo) {
        this.refundRequestNo = refundRequestNo;
        return this;
    }
    public String getRefundRequestNo() {
        return this.refundRequestNo;
    }

    public CreateOnetimeRefundRequest setRefundMoney(Long refundMoney) {
        this.refundMoney = refundMoney;
        return this;
    }
    public Long getRefundMoney() {
        return this.refundMoney;
    }

    public CreateOnetimeRefundRequest setRefundReason(String refundReason) {
        this.refundReason = refundReason;
        return this;
    }
    public String getRefundReason() {
        return this.refundReason;
    }

    public CreateOnetimeRefundRequest setRefundDivideTransOutInfoList(String refundDivideTransOutInfoList) {
        this.refundDivideTransOutInfoList = refundDivideTransOutInfoList;
        return this;
    }
    public String getRefundDivideTransOutInfoList() {
        return this.refundDivideTransOutInfoList;
    }

}
