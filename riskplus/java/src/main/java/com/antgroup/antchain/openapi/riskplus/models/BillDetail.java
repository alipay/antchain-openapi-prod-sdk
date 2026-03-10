// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BillDetail extends TeaModel {
    // 对账流水号，在扣款回盘文件中返回，用于对账
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("serial_number")
    public String serialNumber;

    // 还款期数
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("rpy_term")
    @Validation(required = true)
    public Long rpyTerm;

    // 账单维度的还款总额（单位：分），单笔账单本利罚之和
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("rpy_amt")
    @Validation(required = true)
    public Long rpyAmt;

    // 实还本金（单位：分）
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("rpy_principal")
    @Validation(required = true)
    public Long rpyPrincipal;

    // 实还利息（单位：分）
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("rpy_fee_amt")
    @Validation(required = true)
    public Long rpyFeeAmt;

    // 实还罚息（单位：分）
    /**
     * <strong>example:</strong>
     * <p>1999.98</p>
     */
    @NameInMap("rpy_muclt")
    @Validation(required = true)
    public Long rpyMuclt;

    // 其他科目金额，可能会其他类型的金额,用json数组的格式提高扩展性，涉及到保费和咨询服务费的项目，需要提供此字段。
    // 
    /**
     * <strong>example:</strong>
     * <p>[{&quot;fee&quot;:&quot;费用（单位：分）&quot;,&quot;type&quot;:&quot;（费用大项）1:保费, 2:信用评估费类&quot;,&quot;subType&quot;:&quot;费用子项） 57:担保咨询服务费（属于信用评估费类型）  50:信用评估费（属于信用评估费类型）  40保费&quot;,&quot;insureMode&quot;:&quot;分期乐内部担保模式号&quot;}]</p>
     */
    @NameInMap("other_info")
    public String otherInfo;

    // 用户实还日，用户主动发起是当前日；定时扣款是应还日，格式=yyyy-MM-dd
    /**
     * <strong>example:</strong>
     * <p>yyyy-MM-dd</p>
     */
    @NameInMap("rpy_date")
    public String rpyDate;

    public static BillDetail build(java.util.Map<String, ?> map) throws Exception {
        BillDetail self = new BillDetail();
        return TeaModel.build(map, self);
    }

    public BillDetail setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public BillDetail setRpyTerm(Long rpyTerm) {
        this.rpyTerm = rpyTerm;
        return this;
    }
    public Long getRpyTerm() {
        return this.rpyTerm;
    }

    public BillDetail setRpyAmt(Long rpyAmt) {
        this.rpyAmt = rpyAmt;
        return this;
    }
    public Long getRpyAmt() {
        return this.rpyAmt;
    }

    public BillDetail setRpyPrincipal(Long rpyPrincipal) {
        this.rpyPrincipal = rpyPrincipal;
        return this;
    }
    public Long getRpyPrincipal() {
        return this.rpyPrincipal;
    }

    public BillDetail setRpyFeeAmt(Long rpyFeeAmt) {
        this.rpyFeeAmt = rpyFeeAmt;
        return this;
    }
    public Long getRpyFeeAmt() {
        return this.rpyFeeAmt;
    }

    public BillDetail setRpyMuclt(Long rpyMuclt) {
        this.rpyMuclt = rpyMuclt;
        return this;
    }
    public Long getRpyMuclt() {
        return this.rpyMuclt;
    }

    public BillDetail setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
        return this;
    }
    public String getOtherInfo() {
        return this.otherInfo;
    }

    public BillDetail setRpyDate(String rpyDate) {
        this.rpyDate = rpyDate;
        return this;
    }
    public String getRpyDate() {
        return this.rpyDate;
    }

}
