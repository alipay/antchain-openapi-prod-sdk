// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadBizOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 船公司did
    @NameInMap("carrier_did")
    @Validation(required = true)
    public String carrierDid;

    // 尾款金额
    @NameInMap("deadline_amount")
    @Validation(required = true)
    public String deadlineAmount;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 订单总额
    @NameInMap("order_amounts")
    @Validation(required = true)
    public java.util.List<UploadOrderAmount> orderAmounts;

    // 订单booking信息
    @NameInMap("order_bookings")
    @Validation(required = true)
    public java.util.List<UploadOrderBooking> orderBookings;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 结算did
    @NameInMap("settle_did")
    @Validation(required = true)
    public String settleDid;

    public static UploadBizOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBizOrderRequest self = new UploadBizOrderRequest();
        return TeaModel.build(map, self);
    }

    public UploadBizOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadBizOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadBizOrderRequest setCarrierDid(String carrierDid) {
        this.carrierDid = carrierDid;
        return this;
    }
    public String getCarrierDid() {
        return this.carrierDid;
    }

    public UploadBizOrderRequest setDeadlineAmount(String deadlineAmount) {
        this.deadlineAmount = deadlineAmount;
        return this;
    }
    public String getDeadlineAmount() {
        return this.deadlineAmount;
    }

    public UploadBizOrderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public UploadBizOrderRequest setOrderAmounts(java.util.List<UploadOrderAmount> orderAmounts) {
        this.orderAmounts = orderAmounts;
        return this;
    }
    public java.util.List<UploadOrderAmount> getOrderAmounts() {
        return this.orderAmounts;
    }

    public UploadBizOrderRequest setOrderBookings(java.util.List<UploadOrderBooking> orderBookings) {
        this.orderBookings = orderBookings;
        return this;
    }
    public java.util.List<UploadOrderBooking> getOrderBookings() {
        return this.orderBookings;
    }

    public UploadBizOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public UploadBizOrderRequest setSettleDid(String settleDid) {
        this.settleDid = settleDid;
        return this;
    }
    public String getSettleDid() {
        return this.settleDid;
    }

}
