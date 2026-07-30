// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcMonthData extends TeaModel {
    // 月份格式为YYYYMM
    /**
     * <strong>example:</strong>
     * <p>202210</p>
     */
    @NameInMap("month")
    @Validation(required = true)
    public String month;

    // 实际结算金额/销售收入 单位：元，格式：数字，小数点后两位
    /**
     * <strong>example:</strong>
     * <p>22300000.00</p>
     */
    @NameInMap("purchase_amount")
    @Validation(required = true)
    public Long purchaseAmount;

    // GMV，单位：元，格式：数字，小数点后两位
    /**
     * <strong>example:</strong>
     * <p>22300000.00</p>
     */
    @NameInMap("gmv")
    @Validation(required = true)
    public Long gmv;

    // 退货率。单位：%，格式：数字，小数点后两位
    /**
     * <strong>example:</strong>
     * <p>3.08</p>
     */
    @NameInMap("ret_rate")
    @Validation(required = true)
    public Long retRate;

    public static EcMonthData build(java.util.Map<String, ?> map) throws Exception {
        EcMonthData self = new EcMonthData();
        return TeaModel.build(map, self);
    }

    public EcMonthData setMonth(String month) {
        this.month = month;
        return this;
    }
    public String getMonth() {
        return this.month;
    }

    public EcMonthData setPurchaseAmount(Long purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
        return this;
    }
    public Long getPurchaseAmount() {
        return this.purchaseAmount;
    }

    public EcMonthData setGmv(Long gmv) {
        this.gmv = gmv;
        return this;
    }
    public Long getGmv() {
        return this.gmv;
    }

    public EcMonthData setRetRate(Long retRate) {
        this.retRate = retRate;
        return this;
    }
    public Long getRetRate() {
        return this.retRate;
    }

}
