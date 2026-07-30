// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class EcRepayTrial extends TeaModel {
    // 合同编号
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("contract_no")
    public String contractNo;

    // 数字格式,精确到分。借据已结清,会返回还款总金额为0
    /**
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("total_amount")
    public String totalAmount;

    // 利息数字格式,精确到分
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("interest_amount")
    public String interestAmount;

    // 本金 数字格式,精确到分
    /**
     * <strong>example:</strong>
     * <p>2.35</p>
     */
    @NameInMap("principal_amount")
    public String principalAmount;

    // 罚息 数字格式,精确到分
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("penalty_interest_amount")
    public String penaltyInterestAmount;

    // 复利 数字格式,精确到分
    /**
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("compound_interest_amount")
    public String compoundInterestAmount;

    public static EcRepayTrial build(java.util.Map<String, ?> map) throws Exception {
        EcRepayTrial self = new EcRepayTrial();
        return TeaModel.build(map, self);
    }

    public EcRepayTrial setContractNo(String contractNo) {
        this.contractNo = contractNo;
        return this;
    }
    public String getContractNo() {
        return this.contractNo;
    }

    public EcRepayTrial setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public String getTotalAmount() {
        return this.totalAmount;
    }

    public EcRepayTrial setInterestAmount(String interestAmount) {
        this.interestAmount = interestAmount;
        return this;
    }
    public String getInterestAmount() {
        return this.interestAmount;
    }

    public EcRepayTrial setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
        return this;
    }
    public String getPrincipalAmount() {
        return this.principalAmount;
    }

    public EcRepayTrial setPenaltyInterestAmount(String penaltyInterestAmount) {
        this.penaltyInterestAmount = penaltyInterestAmount;
        return this;
    }
    public String getPenaltyInterestAmount() {
        return this.penaltyInterestAmount;
    }

    public EcRepayTrial setCompoundInterestAmount(String compoundInterestAmount) {
        this.compoundInterestAmount = compoundInterestAmount;
        return this;
    }
    public String getCompoundInterestAmount() {
        return this.compoundInterestAmount;
    }

}
