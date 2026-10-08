// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class CustodyFeeItemVO extends TeaModel {
    // Token 符号，如 USDC / USDT / BTC
    /**
     * <strong>example:</strong>
     * <p>USDC</p>
     */
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 链类型，如 ETHEREUM / BITCOIN / TRON
    /**
     * <strong>example:</strong>
     * <p>ETHEREUM</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 日均余额（原币种字符串，保留18位小数）
    /**
     * <strong>example:</strong>
     * <p>5500000.000000000000000000</p>
     */
    @NameInMap("avg_balance")
    @Validation(required = true)
    public String avgBalance;

    // 计费规则，如FIXED（固定费用），AUM_PERCENTAGE（按日均持有量乘以年化费率）
    /**
     * <strong>example:</strong>
     * <p>FIXED</p>
     */
    @NameInMap("fee_rule")
    @Validation(required = true)
    public String feeRule;

    // 费用
    /**
     * <strong>example:</strong>
     * <p>2750.00000000</p>
     */
    @NameInMap("fee")
    @Validation(required = true)
    public String fee;

    // 费用币种
    /**
     * <strong>example:</strong>
     * <p>HKD</p>
     */
    @NameInMap("fee_currency")
    @Validation(required = true)
    public String feeCurrency;

    public static CustodyFeeItemVO build(java.util.Map<String, ?> map) throws Exception {
        CustodyFeeItemVO self = new CustodyFeeItemVO();
        return TeaModel.build(map, self);
    }

    public CustodyFeeItemVO setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public CustodyFeeItemVO setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public CustodyFeeItemVO setAvgBalance(String avgBalance) {
        this.avgBalance = avgBalance;
        return this;
    }
    public String getAvgBalance() {
        return this.avgBalance;
    }

    public CustodyFeeItemVO setFeeRule(String feeRule) {
        this.feeRule = feeRule;
        return this;
    }
    public String getFeeRule() {
        return this.feeRule;
    }

    public CustodyFeeItemVO setFee(String fee) {
        this.fee = fee;
        return this;
    }
    public String getFee() {
        return this.fee;
    }

    public CustodyFeeItemVO setFeeCurrency(String feeCurrency) {
        this.feeCurrency = feeCurrency;
        return this;
    }
    public String getFeeCurrency() {
        return this.feeCurrency;
    }

}
