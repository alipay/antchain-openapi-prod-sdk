// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OrderInfoReq extends TeaModel {
    // 订单创建时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("order_create_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String orderCreateTime;

    // 订单付款主题
    /**
     * <strong>example:</strong>
     * <p>退订、续订,人工客服电话:4006476616商家订单号：</p>
     */
    @NameInMap("order_pay_subject")
    public String orderPaySubject;

    // 总租期
    // 总租期最小值为1
    // 总租期最大值为60
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("rent_term")
    @Validation(required = true)
    public Long rentTerm;

    // 租期单位
    // MONTH : 月 
    // DAY : 天
    /**
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("rent_unit")
    @Validation(required = true)
    public String rentUnit;

    // 租金总额 单位/分
    // 最小值为1
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("total_rent_money")
    @Validation(required = true)
    public Long totalRentMoney;

    public static OrderInfoReq build(java.util.Map<String, ?> map) throws Exception {
        OrderInfoReq self = new OrderInfoReq();
        return TeaModel.build(map, self);
    }

    public OrderInfoReq setOrderCreateTime(String orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
        return this;
    }
    public String getOrderCreateTime() {
        return this.orderCreateTime;
    }

    public OrderInfoReq setOrderPaySubject(String orderPaySubject) {
        this.orderPaySubject = orderPaySubject;
        return this;
    }
    public String getOrderPaySubject() {
        return this.orderPaySubject;
    }

    public OrderInfoReq setRentTerm(Long rentTerm) {
        this.rentTerm = rentTerm;
        return this;
    }
    public Long getRentTerm() {
        return this.rentTerm;
    }

    public OrderInfoReq setRentUnit(String rentUnit) {
        this.rentUnit = rentUnit;
        return this;
    }
    public String getRentUnit() {
        return this.rentUnit;
    }

    public OrderInfoReq setTotalRentMoney(Long totalRentMoney) {
        this.totalRentMoney = totalRentMoney;
        return this;
    }
    public Long getTotalRentMoney() {
        return this.totalRentMoney;
    }

}
