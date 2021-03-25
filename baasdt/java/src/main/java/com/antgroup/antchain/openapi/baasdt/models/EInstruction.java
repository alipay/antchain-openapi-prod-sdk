// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class EInstruction extends TeaModel {
    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 资产的汇率
    @NameInMap("asset_rate")
    @Validation(required = true)
    public String assetRate;

    // 资产扣减数量(单位:个)
    @NameInMap("deduct_asset_amount")
    @Validation(required = true)
    public String deductAssetAmount;

    // 扣减商户备付金授信额(单位:元)
    @NameInMap("deduct_credit_amount")
    @Validation(required = true)
    public String deductCreditAmount;

    // 扣减商户备付金余额(单位:元)
    @NameInMap("deduct_debit_amount")
    @Validation(required = true)
    public String deductDebitAmount;

    // 被扣减备付金的租户ID
    @NameInMap("deduct_tenant_id")
    @Validation(required = true)
    public String deductTenantId;

    // 权益ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 权益名称
    @NameInMap("equity_name")
    @Validation(required = true)
    public String equityName;

    // 权益对用户价格(单位:元)
    @NameInMap("equity_price")
    @Validation(required = true)
    public String equityPrice;

    // 权益面值(单位:元)
    @NameInMap("equity_value")
    @Validation(required = true)
    public String equityValue;

    // 附言Deliver/Complete/OutOfStore/WriteOff)
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 发起操作的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 业务交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 对换单流水状态：
    // 0        // 权益兑换单创建
    // 1        // 权益兑换单接单
    // 2        // 权益兑换单发货
    // 3        // 权益兑换单确认收货
    // 4        // 权益兑换单缺货
    // 5        // 权益兑换单核销
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 权益归属租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 交易时间戳
    @NameInMap("time_stamp")
    @Validation(required = true)
    public Long timeStamp;

    // 兑换类型(商户身份/用户身份)
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // 用户身份兑换/商户兑换的受益用户
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 版本（之前版本为0，不收取手续费，之后版本为1，收取手续费）
    @NameInMap("instruction_version")
    @Validation(required = true)
    public Long instructionVersion;

    // 收取手续费的金融云租户ID
    @NameInMap("commission_tenant_id")
    @Validation(required = true)
    public String commissionTenantId;

    // 手续费(单位:元)
    @NameInMap("instruction_commission")
    @Validation(required = true)
    public String instructionCommission;

    // 手续费扣减商户备付金余额(单位:元)
    @NameInMap("deduct_debit_commission")
    @Validation(required = true)
    public String deductDebitCommission;

    // 手续费扣减商户备付金授信额(单位:元)
    @NameInMap("deduct_credit_commission")
    @Validation(required = true)
    public String deductCreditCommission;

    // 资产手续费扣减数量(单位:个)
    @NameInMap("deduct_asset_commission")
    @Validation(required = true)
    public String deductAssetCommission;

    // 手续费率
    @NameInMap("commission_rate")
    @Validation(required = true)
    public String commissionRate;

    // 手续费id
    @NameInMap("commission_id")
    @Validation(required = true)
    public String commissionId;

    // 手续费子id
    @NameInMap("commission_sub_id")
    @Validation(required = true)
    public String commissionSubId;

    // 手续费状态（0:未提现，1:已提现）
    @NameInMap("commission_status")
    @Validation(required = true)
    public Long commissionStatus;

    // 是否收取手续费
    @NameInMap("commission_charged")
    @Validation(required = true)
    public Long commissionCharged;

    public static EInstruction build(java.util.Map<String, ?> map) throws Exception {
        EInstruction self = new EInstruction();
        return TeaModel.build(map, self);
    }

    public EInstruction setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public EInstruction setAssetRate(String assetRate) {
        this.assetRate = assetRate;
        return this;
    }
    public String getAssetRate() {
        return this.assetRate;
    }

    public EInstruction setDeductAssetAmount(String deductAssetAmount) {
        this.deductAssetAmount = deductAssetAmount;
        return this;
    }
    public String getDeductAssetAmount() {
        return this.deductAssetAmount;
    }

    public EInstruction setDeductCreditAmount(String deductCreditAmount) {
        this.deductCreditAmount = deductCreditAmount;
        return this;
    }
    public String getDeductCreditAmount() {
        return this.deductCreditAmount;
    }

    public EInstruction setDeductDebitAmount(String deductDebitAmount) {
        this.deductDebitAmount = deductDebitAmount;
        return this;
    }
    public String getDeductDebitAmount() {
        return this.deductDebitAmount;
    }

    public EInstruction setDeductTenantId(String deductTenantId) {
        this.deductTenantId = deductTenantId;
        return this;
    }
    public String getDeductTenantId() {
        return this.deductTenantId;
    }

    public EInstruction setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public EInstruction setEquityName(String equityName) {
        this.equityName = equityName;
        return this;
    }
    public String getEquityName() {
        return this.equityName;
    }

    public EInstruction setEquityPrice(String equityPrice) {
        this.equityPrice = equityPrice;
        return this;
    }
    public String getEquityPrice() {
        return this.equityPrice;
    }

    public EInstruction setEquityValue(String equityValue) {
        this.equityValue = equityValue;
        return this;
    }
    public String getEquityValue() {
        return this.equityValue;
    }

    public EInstruction setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public EInstruction setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public EInstruction setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public EInstruction setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public EInstruction setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public EInstruction setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public EInstruction setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public EInstruction setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public EInstruction setInstructionVersion(Long instructionVersion) {
        this.instructionVersion = instructionVersion;
        return this;
    }
    public Long getInstructionVersion() {
        return this.instructionVersion;
    }

    public EInstruction setCommissionTenantId(String commissionTenantId) {
        this.commissionTenantId = commissionTenantId;
        return this;
    }
    public String getCommissionTenantId() {
        return this.commissionTenantId;
    }

    public EInstruction setInstructionCommission(String instructionCommission) {
        this.instructionCommission = instructionCommission;
        return this;
    }
    public String getInstructionCommission() {
        return this.instructionCommission;
    }

    public EInstruction setDeductDebitCommission(String deductDebitCommission) {
        this.deductDebitCommission = deductDebitCommission;
        return this;
    }
    public String getDeductDebitCommission() {
        return this.deductDebitCommission;
    }

    public EInstruction setDeductCreditCommission(String deductCreditCommission) {
        this.deductCreditCommission = deductCreditCommission;
        return this;
    }
    public String getDeductCreditCommission() {
        return this.deductCreditCommission;
    }

    public EInstruction setDeductAssetCommission(String deductAssetCommission) {
        this.deductAssetCommission = deductAssetCommission;
        return this;
    }
    public String getDeductAssetCommission() {
        return this.deductAssetCommission;
    }

    public EInstruction setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate;
        return this;
    }
    public String getCommissionRate() {
        return this.commissionRate;
    }

    public EInstruction setCommissionId(String commissionId) {
        this.commissionId = commissionId;
        return this;
    }
    public String getCommissionId() {
        return this.commissionId;
    }

    public EInstruction setCommissionSubId(String commissionSubId) {
        this.commissionSubId = commissionSubId;
        return this;
    }
    public String getCommissionSubId() {
        return this.commissionSubId;
    }

    public EInstruction setCommissionStatus(Long commissionStatus) {
        this.commissionStatus = commissionStatus;
        return this;
    }
    public Long getCommissionStatus() {
        return this.commissionStatus;
    }

    public EInstruction setCommissionCharged(Long commissionCharged) {
        this.commissionCharged = commissionCharged;
        return this;
    }
    public Long getCommissionCharged() {
        return this.commissionCharged;
    }

}
