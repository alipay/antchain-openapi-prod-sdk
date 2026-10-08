// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class TransactionFeeItemVO extends TeaModel {
    // 链上交易哈希
    /**
     * <strong>example:</strong>
     * <p>0xdef456abc123...</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 订单类型（业务维度细分）
    /**
     * <strong>example:</strong>
     * <p>STANDARD</p>
     */
    @NameInMap("order_type")
    @Validation(required = true)
    public String orderType;

    // 交易币种
    /**
     * <strong>example:</strong>
     * <p>USDT</p>
     */
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 交易金额（原币种字符串，保留18位小数）
    /**
     * <strong>example:</strong>
     * <p>120000.000000000000000000</p>
     */
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 订单金额 USD 等值（字符串，保留8位小数）
    /**
     * <strong>example:</strong>
     * <p>120000.00000000</p>
     */
    @NameInMap("hkd_equivalent")
    @Validation(required = true)
    public String hkdEquivalent;

    // 订单提交人（用户名）
    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("maker")
    @Validation(required = true)
    public String maker;

    // 订单审批人（用户名）
    /**
     * <strong>example:</strong>
     * <p>bob</p>
     */
    @NameInMap("checker")
    @Validation(required = true)
    public String checker;

    // 计算出的费用（法币金额字符串，保留8位小数）
    /**
     * <strong>example:</strong>
     * <p>50.00000000</p>
     */
    @NameInMap("fee")
    @Validation(required = true)
    public String fee;

    // 费用币种
    /**
     * <strong>example:</strong>
     * <p>USD</p>
     */
    @NameInMap("fee_currency")
    @Validation(required = true)
    public String feeCurrency;

    // 订单创建时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2026-04-15 14:12:08</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public String createTime;

    // 订单审批时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2026-04-15 14:15:22</p>
     */
    @NameInMap("approve_time")
    @Validation(required = true)
    public String approveTime;

    // 链上交易完成时间，格式：yyyy-MM-dd HH:mm:ss
    /**
     * <strong>example:</strong>
     * <p>2026-04-15 14:18:45</p>
     */
    @NameInMap("blockchain_verification_time")
    @Validation(required = true)
    public String blockchainVerificationTime;

    public static TransactionFeeItemVO build(java.util.Map<String, ?> map) throws Exception {
        TransactionFeeItemVO self = new TransactionFeeItemVO();
        return TeaModel.build(map, self);
    }

    public TransactionFeeItemVO setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public TransactionFeeItemVO setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public TransactionFeeItemVO setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public TransactionFeeItemVO setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public TransactionFeeItemVO setHkdEquivalent(String hkdEquivalent) {
        this.hkdEquivalent = hkdEquivalent;
        return this;
    }
    public String getHkdEquivalent() {
        return this.hkdEquivalent;
    }

    public TransactionFeeItemVO setMaker(String maker) {
        this.maker = maker;
        return this;
    }
    public String getMaker() {
        return this.maker;
    }

    public TransactionFeeItemVO setChecker(String checker) {
        this.checker = checker;
        return this;
    }
    public String getChecker() {
        return this.checker;
    }

    public TransactionFeeItemVO setFee(String fee) {
        this.fee = fee;
        return this;
    }
    public String getFee() {
        return this.fee;
    }

    public TransactionFeeItemVO setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
        return this;
    }
    public String getFeeCurrency() {
        return this.feeCurrency;
    }

    public TransactionFeeItemVO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public TransactionFeeItemVO setApproveTime(String approveTime) {
        this.approveTime = approveTime;
        return this;
    }
    public String getApproveTime() {
        return this.approveTime;
    }

    public TransactionFeeItemVO setBlockchainVerificationTime(String blockchainVerificationTime) {
        this.blockchainVerificationTime = blockchainVerificationTime;
        return this;
    }
    public String getBlockchainVerificationTime() {
        return this.blockchainVerificationTime;
    }

}
