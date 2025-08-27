// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantOrderRepayStrategy extends TeaModel {
    // 分账期数(关联商户履约)
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("term_index")
    public Long termIndex;

    // 还款期数(关联用户还款承诺)
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("lease_term_index")
    public Long leaseTermIndex;

    // 分账金额
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("pay_money")
    public Long payMoney;

    // 转代偿时间，yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>2018-01-01</p>
     */
    @NameInMap("to_compensate_date")
    public String toCompensateDate;

    public static MerchantOrderRepayStrategy build(java.util.Map<String, ?> map) throws Exception {
        MerchantOrderRepayStrategy self = new MerchantOrderRepayStrategy();
        return TeaModel.build(map, self);
    }

    public MerchantOrderRepayStrategy setTermIndex(Long termIndex) {
        this.termIndex = termIndex;
        return this;
    }
    public Long getTermIndex() {
        return this.termIndex;
    }

    public MerchantOrderRepayStrategy setLeaseTermIndex(Long leaseTermIndex) {
        this.leaseTermIndex = leaseTermIndex;
        return this;
    }
    public Long getLeaseTermIndex() {
        return this.leaseTermIndex;
    }

    public MerchantOrderRepayStrategy setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public MerchantOrderRepayStrategy setToCompensateDate(String toCompensateDate) {
        this.toCompensateDate = toCompensateDate;
        return this;
    }
    public String getToCompensateDate() {
        return this.toCompensateDate;
    }

}
