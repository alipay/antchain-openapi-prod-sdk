// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class RentalSignStatusResp extends TeaModel {
    // 订单号
    /**
     * <strong>example:</strong>
     * <p>2026111200012345</p>
     */
    @NameInMap("order_id")
    public String orderId;

    // 签约单号
    /**
     * <strong>example:</strong>
     * <p>RS20261112000123</p>
     */
    @NameInMap("sign_no")
    public String signNo;

    // 签约单状态
    /**
     * <strong>example:</strong>
     * <p>SIGNING</p>
     */
    @NameInMap("sign_status")
    public String signStatus;

    // 押金方案
    /**
     * <strong>example:</strong>
     * <p>FREE_WITH_PREAUTH</p>
     */
    @NameInMap("deposit_type")
    public String depositType;

    // 商品押金（分）
    /**
     * <strong>example:</strong>
     * <p>50000</p>
     */
    @NameInMap("deposit_amount")
    public Long depositAmount;

    // 信用减免金额（分）
    /**
     * <strong>example:</strong>
     * <p>20000</p>
     */
    @NameInMap("credit_reduce_amount")
    public Long creditReduceAmount;

    // 预授权冻结进度；方案不含预授权返回 status=NOT\_NEEDED
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("preauth_result")
    public SignCapabilityResult preauthResult;

    // 代扣签约进度；方案不含代扣返回 status=NOT\_NEEDED。组合方案的代扣与预授权一并发起，二者各自独立收敛
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("withhold_result")
    public SignCapabilityResult withholdResult;

    // 合同签署进度；方案不含合同返回 status=NOT\_NEEDED
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("contract_result")
    public SignCapabilityResult contractResult;

    // 当前仍有效、可拉起的参数列表，结构与发起签约返回的 actions 相同；无可用拉起参数时为空列表
    /**
     * <strong>example:</strong>
     * <p>[{}]</p>
     */
    @NameInMap("action_available_list")
    public java.util.List<SignActionInfo> actionAvailableList;

    // 签约尚未完成的原因说明，由当前子结果与实时回查结果实时生成，不持久化；signStatus=SUCCESS 时为空
    /**
     * <strong>example:</strong>
     * <p>原因说明</p>
     */
    @NameInMap("unmet_reason")
    public String unmetReason;

    public static RentalSignStatusResp build(java.util.Map<String, ?> map) throws Exception {
        RentalSignStatusResp self = new RentalSignStatusResp();
        return TeaModel.build(map, self);
    }

    public RentalSignStatusResp setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RentalSignStatusResp setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public RentalSignStatusResp setSignStatus(String signStatus) {
        this.signStatus = signStatus;
        return this;
    }
    public String getSignStatus() {
        return this.signStatus;
    }

    public RentalSignStatusResp setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public RentalSignStatusResp setDepositAmount(Long depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }
    public Long getDepositAmount() {
        return this.depositAmount;
    }

    public RentalSignStatusResp setCreditReduceAmount(Long creditReduceAmount) {
        this.creditReduceAmount = creditReduceAmount;
        return this;
    }
    public Long getCreditReduceAmount() {
        return this.creditReduceAmount;
    }

    public RentalSignStatusResp setPreauthResult(SignCapabilityResult preauthResult) {
        this.preauthResult = preauthResult;
        return this;
    }
    public SignCapabilityResult getPreauthResult() {
        return this.preauthResult;
    }

    public RentalSignStatusResp setWithholdResult(SignCapabilityResult withholdResult) {
        this.withholdResult = withholdResult;
        return this;
    }
    public SignCapabilityResult getWithholdResult() {
        return this.withholdResult;
    }

    public RentalSignStatusResp setContractResult(SignCapabilityResult contractResult) {
        this.contractResult = contractResult;
        return this;
    }
    public SignCapabilityResult getContractResult() {
        return this.contractResult;
    }

    public RentalSignStatusResp setActionAvailableList(java.util.List<SignActionInfo> actionAvailableList) {
        this.actionAvailableList = actionAvailableList;
        return this;
    }
    public java.util.List<SignActionInfo> getActionAvailableList() {
        return this.actionAvailableList;
    }

    public RentalSignStatusResp setUnmetReason(String unmetReason) {
        this.unmetReason = unmetReason;
        return this;
    }
    public String getUnmetReason() {
        return this.unmetReason;
    }

}
