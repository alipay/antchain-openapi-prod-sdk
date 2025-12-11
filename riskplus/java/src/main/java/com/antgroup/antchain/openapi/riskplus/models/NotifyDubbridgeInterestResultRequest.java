// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class NotifyDubbridgeInterestResultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求流水号
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 权益流水号
    @NameInMap("interest_no")
    @Validation(required = true)
    public String interestNo;

    // 权益订单状态：NOT_CREATE 订单未创建
    // PAYED： 支付成功
    // APPLY： 已投保
    // REFUND：已注销（退款)
    // CANCEL: 已取消
    // REFUND_FAIL： 退款失败
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 用户授权状态：AGREE 同意
    // DISAGREE 不同意
    @NameInMap("user_permit_status")
    @Validation(required = true)
    public String userPermitStatus;

    // 公证状态：当需要公正时才返回公证结果
    // FINISH 已完成
    // UN_FINISH 未完成
    // PROCESSING 进行中
    @NameInMap("notary_status")
    public String notaryStatus;

    // 权益价格，单位：元
    @NameInMap("interest_price")
    public String interestPrice;

    public static NotifyDubbridgeInterestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyDubbridgeInterestResultRequest self = new NotifyDubbridgeInterestResultRequest();
        return TeaModel.build(map, self);
    }

    public NotifyDubbridgeInterestResultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public NotifyDubbridgeInterestResultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public NotifyDubbridgeInterestResultRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyDubbridgeInterestResultRequest setInterestNo(String interestNo) {
        this.interestNo = interestNo;
        return this;
    }
    public String getInterestNo() {
        return this.interestNo;
    }

    public NotifyDubbridgeInterestResultRequest setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public NotifyDubbridgeInterestResultRequest setUserPermitStatus(String userPermitStatus) {
        this.userPermitStatus = userPermitStatus;
        return this;
    }
    public String getUserPermitStatus() {
        return this.userPermitStatus;
    }

    public NotifyDubbridgeInterestResultRequest setNotaryStatus(String notaryStatus) {
        this.notaryStatus = notaryStatus;
        return this;
    }
    public String getNotaryStatus() {
        return this.notaryStatus;
    }

    public NotifyDubbridgeInterestResultRequest setInterestPrice(String interestPrice) {
        this.interestPrice = interestPrice;
        return this;
    }
    public String getInterestPrice() {
        return this.interestPrice;
    }

}
