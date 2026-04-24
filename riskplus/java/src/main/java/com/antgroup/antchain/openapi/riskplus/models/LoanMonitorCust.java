// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class LoanMonitorCust extends TeaModel {
    // 合同编号
    /**
     * <strong>example:</strong>
     * <p>CONT20230314000000143225</p>
     */
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 商户GMV 单位：元
    /**
     * <strong>example:</strong>
     * <p>5000000.00</p>
     */
    @NameInMap("gross_merc_volume")
    @Validation(required = true)
    public String grossMercVolume;

    // 实际销售结算金额 单位：元，格式：数字，小数点后两位
    /**
     * <strong>example:</strong>
     * <p>5000000.00</p>
     */
    @NameInMap("act_sale_amt")
    @Validation(required = true)
    public String actSaleAmt;

    // 退货率 单位：%
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("return_rate")
    @Validation(required = true)
    public String returnRate;

    // 已发货未收款金额 单位：元，格式：数字，小数点后两位
    /**
     * <strong>example:</strong>
     * <p>5000000.00</p>
     */
    @NameInMap("accounts_receivable")
    @Validation(required = true)
    public String accountsReceivable;

    public static LoanMonitorCust build(java.util.Map<String, ?> map) throws Exception {
        LoanMonitorCust self = new LoanMonitorCust();
        return TeaModel.build(map, self);
    }

    public LoanMonitorCust setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public LoanMonitorCust setGrossMercVolume(String grossMercVolume) {
        this.grossMercVolume = grossMercVolume;
        return this;
    }
    public String getGrossMercVolume() {
        return this.grossMercVolume;
    }

    public LoanMonitorCust setActSaleAmt(String actSaleAmt) {
        this.actSaleAmt = actSaleAmt;
        return this;
    }
    public String getActSaleAmt() {
        return this.actSaleAmt;
    }

    public LoanMonitorCust setReturnRate(String returnRate) {
        this.returnRate = returnRate;
        return this;
    }
    public String getReturnRate() {
        return this.returnRate;
    }

    public LoanMonitorCust setAccountsReceivable(String accountsReceivable) {
        this.accountsReceivable = accountsReceivable;
        return this;
    }
    public String getAccountsReceivable() {
        return this.accountsReceivable;
    }

}
