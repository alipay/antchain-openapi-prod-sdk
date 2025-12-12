// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class NotifyInterestSupplierorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求流水号，每次唯一
    @NameInMap("request_no")
    @Validation(required = true)
    public String requestNo;

    // 贵方订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 我方权益编号
    @NameInMap("interest_no")
    @Validation(required = true)
    public String interestNo;

    // 用户授权状态
    @NameInMap("user_permit_status")
    @Validation(required = true)
    public String userPermitStatus;

    // 权益订单状态
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 退款金额，单位元
    @NameInMap("refund_amount")
    public String refundAmount;

    // 退款时间
    @NameInMap("refund_time")
    public String refundTime;

    // 公证状态
    @NameInMap("notary_status")
    public String notaryStatus;

    // 支付成功时间
    @NameInMap("payment_success_time")
    public String paymentSuccessTime;

    // 版本号
    @NameInMap("interest_version")
    public String interestVersion;

    public static NotifyInterestSupplierorderRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyInterestSupplierorderRequest self = new NotifyInterestSupplierorderRequest();
        return TeaModel.build(map, self);
    }

    public NotifyInterestSupplierorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyInterestSupplierorderRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public NotifyInterestSupplierorderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public NotifyInterestSupplierorderRequest setInterestNo(String interestNo) {
        this.interestNo = interestNo;
        return this;
    }
    public String getInterestNo() {
        return this.interestNo;
    }

    public NotifyInterestSupplierorderRequest setUserPermitStatus(String userPermitStatus) {
        this.userPermitStatus = userPermitStatus;
        return this;
    }
    public String getUserPermitStatus() {
        return this.userPermitStatus;
    }

    public NotifyInterestSupplierorderRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public NotifyInterestSupplierorderRequest setRefundAmount(String refundAmount) {
        this.refundAmount = refundAmount;
        return this;
    }
    public String getRefundAmount() {
        return this.refundAmount;
    }

    public NotifyInterestSupplierorderRequest setRefundTime(String refundTime) {
        this.refundTime = refundTime;
        return this;
    }
    public String getRefundTime() {
        return this.refundTime;
    }

    public NotifyInterestSupplierorderRequest setNotaryStatus(String notaryStatus) {
        this.notaryStatus = notaryStatus;
        return this;
    }
    public String getNotaryStatus() {
        return this.notaryStatus;
    }

    public NotifyInterestSupplierorderRequest setPaymentSuccessTime(String paymentSuccessTime) {
        this.paymentSuccessTime = paymentSuccessTime;
        return this;
    }
    public String getPaymentSuccessTime() {
        return this.paymentSuccessTime;
    }

    public NotifyInterestSupplierorderRequest setInterestVersion(String interestVersion) {
        this.interestVersion = interestVersion;
        return this;
    }
    public String getInterestVersion() {
        return this.interestVersion;
    }

}
