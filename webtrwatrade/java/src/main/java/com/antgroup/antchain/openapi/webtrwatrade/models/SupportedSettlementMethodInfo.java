// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class SupportedSettlementMethodInfo extends TeaModel {
    // 结算方式枚举：TD或TT
    /**
     * <strong>example:</strong>
     * <p>TD</p>
     */
    @NameInMap("settlement_method_enum")
    public String settlementMethodEnum;

    // 结算银行账户id
    /**
     * <strong>example:</strong>
     * <p>18129343249234</p>
     */
    @NameInMap("related_settlement_account_id")
    public String relatedSettlementAccountId;

    public static SupportedSettlementMethodInfo build(java.util.Map<String, ?> map) throws Exception {
        SupportedSettlementMethodInfo self = new SupportedSettlementMethodInfo();
        return TeaModel.build(map, self);
    }

    public SupportedSettlementMethodInfo setSettlementMethodEnum(String settlementMethodEnum) {
        this.settlementMethodEnum = settlementMethodEnum;
        return this;
    }
    public String getSettlementMethodEnum() {
        return this.settlementMethodEnum;
    }

    public SupportedSettlementMethodInfo setRelatedSettlementAccountId(String relatedSettlementAccountId) {
        this.relatedSettlementAccountId = relatedSettlementAccountId;
        return this;
    }
    public String getRelatedSettlementAccountId() {
        return this.relatedSettlementAccountId;
    }

}
