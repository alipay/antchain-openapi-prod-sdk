// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class DubheEcQuota extends TeaModel {
    // 交易流水号,与上面的交易流水号一致
    /**
     * <strong>example:</strong>
     * <p>JJBH136433239635646977</p>
     */
    @NameInMap("transaction_no")
    @Validation(required = true)
    public String transactionNo;

    // 业务状态同步接口中，客户签约成功后的合同编号，在后续查询类接口都需要使用。
    /**
     * <strong>example:</strong>
     * <p>CONT20230213000000146577</p>
     */
    @NameInMap("contract_no")
    @Validation(required = true)
    public String contractNo;

    // 客户对应合同的总额度，单位：元，格式：数字，小数点后两位。
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("amt")
    @Validation(required = true)
    public Long amt;

    // 客户对应合同的可用额度，单位：元，格式：数字，小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("avail_credit_amt")
    @Validation(required = true)
    public Long availCreditAmt;

    // 客户对应合同的已用额度，单位：元，格式：数字，小数点后两位
    /**
     * <strong>example:</strong>
     * <p>1.01</p>
     */
    @NameInMap("engross_amt")
    @Validation(required = true)
    public Long engrossAmt;

    // 合同目前的额度状态 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("credit_status")
    @Validation(required = true)
    public String creditStatus;

    // 授信开始时间  格式: yyyy/MM/dd。额度有效时返回
    /**
     * <strong>example:</strong>
     * <p>2023/02/01</p>
     */
    @NameInMap("contract_effect_date")
    public String contractEffectDate;

    // 授信结束时间 格式:yyyy/MM/dd。额度有效时返回
    /**
     * <strong>example:</strong>
     * <p>2023/05/01</p>
     */
    @NameInMap("maturity_date")
    public String maturityDate;

    public static DubheEcQuota build(java.util.Map<String, ?> map) throws Exception {
        DubheEcQuota self = new DubheEcQuota();
        return TeaModel.build(map, self);
    }

    public DubheEcQuota setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
        return this;
    }
    public String getTransactionNo() {
        return this.transactionNo;
    }

    public DubheEcQuota setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public DubheEcQuota setAmt(Long amt) {
        this.amt = amt;
        return this;
    }
    public Long getAmt() {
        return this.amt;
    }

    public DubheEcQuota setAvailCreditAmt(Long availCreditAmt) {
        this.availCreditAmt = availCreditAmt;
        return this;
    }
    public Long getAvailCreditAmt() {
        return this.availCreditAmt;
    }

    public DubheEcQuota setEngrossAmt(Long engrossAmt) {
        this.engrossAmt = engrossAmt;
        return this;
    }
    public Long getEngrossAmt() {
        return this.engrossAmt;
    }

    public DubheEcQuota setCreditStatus(String creditStatus) {
        this.creditStatus = creditStatus;
        return this;
    }
    public String getCreditStatus() {
        return this.creditStatus;
    }

    public DubheEcQuota setContractEffectDate(String contractEffectDate) {
        this.contractEffectDate = contractEffectDate;
        return this;
    }
    public String getContractEffectDate() {
        return this.contractEffectDate;
    }

    public DubheEcQuota setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
        return this;
    }
    public String getMaturityDate() {
        return this.maturityDate;
    }

}
