// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class TokenInstructionDO extends TeaModel {
    // token类型
    @NameInMap("token_type")
    @Validation(required = true)
    public Long tokenType;

    // token价格
    @NameInMap("token_price")
    @Validation(required = true)
    public String tokenPrice;

    // token来源账户ID
    @NameInMap("pay_account_id")
    @Validation(required = true)
    public String payAccountId;

    public static TokenInstructionDO build(java.util.Map<String, ?> map) throws Exception {
        TokenInstructionDO self = new TokenInstructionDO();
        return TeaModel.build(map, self);
    }

    public TokenInstructionDO setTokenType(Long tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public Long getTokenType() {
        return this.tokenType;
    }

    public TokenInstructionDO setTokenPrice(String tokenPrice) {
        this.tokenPrice = tokenPrice;
        return this;
    }
    public String getTokenPrice() {
        return this.tokenPrice;
    }

    public TokenInstructionDO setPayAccountId(String payAccountId) {
        this.payAccountId = payAccountId;
        return this;
    }
    public String getPayAccountId() {
        return this.payAccountId;
    }

}
