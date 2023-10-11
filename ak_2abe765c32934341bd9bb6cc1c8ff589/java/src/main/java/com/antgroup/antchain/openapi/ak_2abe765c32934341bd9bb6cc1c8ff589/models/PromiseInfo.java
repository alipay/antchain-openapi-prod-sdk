// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class PromiseInfo extends TeaModel {
    // 订单 id
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String orderId;

    // 宽限期，精确到 毫秒，产生罚息的延迟时间范围。
    @NameInMap("date_limit")
    @Validation(required = true)
    public Long dateLimit;

    // 应付租金时间，格式为 2019-08-31 12:00:00
    // yyyy-MM-dd HH:mm:ss
    @NameInMap("pay_date_list")
    @Validation(required = true)
    public java.util.List<String> payDateList;

    // 租期
    @NameInMap("pay_period")
    @Validation(required = true, minimum = 1)
    public Long payPeriod;

    // 应付租金，精确到分，即 1234 表示 12.34 元
    @NameInMap("pay_money_list")
    @Validation(required = true)
    public java.util.List<Long> payMoneyList;

    // 租赁公司支付宝 UID
    @NameInMap("lease_alipay_uid")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String leaseAlipayUid;

    public static PromiseInfo build(java.util.Map<String, ?> map) throws Exception {
        PromiseInfo self = new PromiseInfo();
        return TeaModel.build(map, self);
    }

    public PromiseInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public PromiseInfo setDateLimit(Long dateLimit) {
        this.dateLimit = dateLimit;
        return this;
    }
    public Long getDateLimit() {
        return this.dateLimit;
    }

    public PromiseInfo setPayDateList(java.util.List<String> payDateList) {
        this.payDateList = payDateList;
        return this;
    }
    public java.util.List<String> getPayDateList() {
        return this.payDateList;
    }

    public PromiseInfo setPayPeriod(Long payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }
    public Long getPayPeriod() {
        return this.payPeriod;
    }

    public PromiseInfo setPayMoneyList(java.util.List<Long> payMoneyList) {
        this.payMoneyList = payMoneyList;
        return this;
    }
    public java.util.List<Long> getPayMoneyList() {
        return this.payMoneyList;
    }

    public PromiseInfo setLeaseAlipayUid(String leaseAlipayUid) {
        this.leaseAlipayUid = leaseAlipayUid;
        return this;
    }
    public String getLeaseAlipayUid() {
        return this.leaseAlipayUid;
    }

}
