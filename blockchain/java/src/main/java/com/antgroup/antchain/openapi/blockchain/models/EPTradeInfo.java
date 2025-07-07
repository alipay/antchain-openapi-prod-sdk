// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class EPTradeInfo extends TeaModel {
    // 版通代码
    /**
     * <strong>example:</strong>
     * <p>000111</p>
     */
    @NameInMap("ep_code")
    @Validation(required = true)
    public String epCode;

    // 版通交易号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("tx_code")
    @Validation(required = true)
    public String txCode;

    // 卖方账户
    /**
     * <strong>example:</strong>
     * <p>testAccount</p>
     */
    @NameInMap("tx_from")
    @Validation(required = true)
    public String txFrom;

    // 交易时间戳
    /**
     * <strong>example:</strong>
     * <p>1560827725</p>
     */
    @NameInMap("tx_time")
    @Validation(required = true)
    public Long txTime;

    // 买方账户
    /**
     * <strong>example:</strong>
     * <p>testAccount</p>
     */
    @NameInMap("tx_to")
    @Validation(required = true)
    public String txTo;

    // 交易数量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("tx_value")
    @Validation(required = true)
    public Long txValue;

    public static EPTradeInfo build(java.util.Map<String, ?> map) throws Exception {
        EPTradeInfo self = new EPTradeInfo();
        return TeaModel.build(map, self);
    }

    public EPTradeInfo setEpCode(String epCode) {
        this.epCode = epCode;
        return this;
    }
    public String getEpCode() {
        return this.epCode;
    }

    public EPTradeInfo setTxCode(String txCode) {
        this.txCode = txCode;
        return this;
    }
    public String getTxCode() {
        return this.txCode;
    }

    public EPTradeInfo setTxFrom(String txFrom) {
        this.txFrom = txFrom;
        return this;
    }
    public String getTxFrom() {
        return this.txFrom;
    }

    public EPTradeInfo setTxTime(Long txTime) {
        this.txTime = txTime;
        return this;
    }
    public Long getTxTime() {
        return this.txTime;
    }

    public EPTradeInfo setTxTo(String txTo) {
        this.txTo = txTo;
        return this;
    }
    public String getTxTo() {
        return this.txTo;
    }

    public EPTradeInfo setTxValue(Long txValue) {
        this.txValue = txValue;
        return this;
    }
    public Long getTxValue() {
        return this.txValue;
    }

}
