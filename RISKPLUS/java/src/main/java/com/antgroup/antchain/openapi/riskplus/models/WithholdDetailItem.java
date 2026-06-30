// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class WithholdDetailItem extends TeaModel {
    // 贷款申请编号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 放款编号/借据号
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("capital_loan_no")
    @Validation(required = true)
    public String capitalLoanNo;

    // 订单维度的实还总额,保留两位有效数字
    // 单笔订单代扣的总额(单位:分)
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("rpy_total_amt")
    @Validation(required = true)
    public Long rpyTotalAmt;

    // 还款类型，0-待还、1-正常还款、2-部分提前还、 3-逾期还款 、4-全部提前还 、5-坏账代偿、 6-回购
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rpy_tpe")
    @Validation(required = true)
    public Long rpyTpe;

    // 代扣日期，用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("rpy_date")
    @Validation(required = true)
    public String rpyDate;

    // 还款账单明细,如果是提前结清,会有多条
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("bill_details")
    @Validation(required = true)
    public java.util.List<BillDetail> billDetails;

    public static WithholdDetailItem build(java.util.Map<String, ?> map) throws Exception {
        WithholdDetailItem self = new WithholdDetailItem();
        return TeaModel.build(map, self);
    }

    public WithholdDetailItem setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public WithholdDetailItem setCapitalLoanNo(String capitalLoanNo) {
        this.capitalLoanNo = capitalLoanNo;
        return this;
    }
    public String getCapitalLoanNo() {
        return this.capitalLoanNo;
    }

    public WithholdDetailItem setRpyTotalAmt(Long rpyTotalAmt) {
        this.rpyTotalAmt = rpyTotalAmt;
        return this;
    }
    public Long getRpyTotalAmt() {
        return this.rpyTotalAmt;
    }

    public WithholdDetailItem setRpyTpe(Long rpyTpe) {
        this.rpyTpe = rpyTpe;
        return this;
    }
    public Long getRpyTpe() {
        return this.rpyTpe;
    }

    public WithholdDetailItem setRpyDate(String rpyDate) {
        this.rpyDate = rpyDate;
        return this;
    }
    public String getRpyDate() {
        return this.rpyDate;
    }

    public WithholdDetailItem setBillDetails(java.util.List<BillDetail> billDetails) {
        this.billDetails = billDetails;
        return this;
    }
    public java.util.List<BillDetail> getBillDetails() {
        return this.billDetails;
    }

}
