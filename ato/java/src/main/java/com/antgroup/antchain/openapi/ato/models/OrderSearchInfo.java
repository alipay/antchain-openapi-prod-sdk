// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderSearchInfo extends TeaModel {
    // 订单id
    /**
     * <strong>example:</strong>
     * <p>SH20241017184159846222</p>
     */
    @NameInMap("order_id")
    public String orderId;

    // 支付宝代扣协议号
    /**
     * <strong>example:</strong>
     * <p>20241025944255332</p>
     */
    @NameInMap("agreement_no")
    public String agreementNo;

    // 订单创建时间
    /**
     * <strong>example:</strong>
     * <p>2024-10-17 18:41:59</p>
     */
    @NameInMap("order_create_time")
    public String orderCreateTime;

    // 租金总额（单位分）
    /**
     * <strong>example:</strong>
     * <p>3500</p>
     */
    @NameInMap("total_rent_money")
    public Long totalRentMoney;

    // 租期
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("rent_term")
    public Long rentTerm;

    // 租期单位
    /**
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("rent_unit")
    public String rentUnit;

    // 订单状态
    /**
     * <strong>example:</strong>
     * <p>OPEN</p>
     */
    @NameInMap("order_status")
    public String orderStatus;

    // 承租人名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("user_name")
    public String userName;

    // 承租人手机号
    /**
     * <strong>example:</strong>
     * <p>12345678912</p>
     */
    @NameInMap("user_phone_number")
    public String userPhoneNumber;

    public static OrderSearchInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderSearchInfo self = new OrderSearchInfo();
        return TeaModel.build(map, self);
    }

    public OrderSearchInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderSearchInfo setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
        return this;
    }
    public String getAgreementNo() {
        return this.agreementNo;
    }

    public OrderSearchInfo setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public OrderSearchInfo setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

    public OrderSearchInfo setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public OrderSearchInfo setRentUnit(String rentUnit) {
        this.rentUnit = rentUnit;
        return this;
    }
    public String getRentUnit() {
        return this.rentUnit;
    }

    public OrderSearchInfo setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public OrderSearchInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public OrderSearchInfo setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

}
