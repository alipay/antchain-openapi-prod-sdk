// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantOrderInfo extends TeaModel {
    // 支付宝代扣协议号
    @NameInMap("agreement_no")
    public String agreementNo;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 订单创建时间
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 租金总额（单位分）
    @NameInMap("total_rent_money")
    public Long totalRentMoney;

    // 租期
    @NameInMap("rent_rerm")
    public Long rentRerm;

    // 订单状态
    @NameInMap("order_status")
    public String orderStatus;

    // 承租人名称
    @NameInMap("user_name")
    public String userName;

    // 承租人手机号
    @NameInMap("user_phone_number")
    public String userPhoneNumber;

    public static MerchantOrderInfo build(java.util.Map<String, ?> map) throws Exception {
        MerchantOrderInfo self = new MerchantOrderInfo();
        return TeaModel.build(map, self);
    }

    public MerchantOrderInfo setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public MerchantOrderInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public MerchantOrderInfo setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public MerchantOrderInfo setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public MerchantOrderInfo setRentRerm(Long rentRerm) {
        this.rentRerm = rentRerm;
        return this;
    }
    public Long getRentRerm() {
        return this.rentRerm;
    }

    public MerchantOrderInfo setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public MerchantOrderInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public MerchantOrderInfo setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

}
