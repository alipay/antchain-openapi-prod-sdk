// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class TokenData extends TeaModel {
    // 拥有的token数量
    @NameInMap("token_number")
    @Validation(required = true)
    public Long tokenNumber;

    // 来源为debit的token数量
    @NameInMap("debit_token")
    @Validation(required = true)
    public Long debitToken;

    // 来源为debit的token数量
    @NameInMap("credit_token")
    @Validation(required = true)
    public Long creditToken;

    // token发行者account
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static TokenData build(java.util.Map<String, ?> map) throws Exception {
        TokenData self = new TokenData();
        return TeaModel.build(map, self);
    }

    public TokenData setTokenNumber(Long tokenNumber) {
        this.tokenNumber = tokenNumber;
        return this;
    }
    public Long getTokenNumber() {
        return this.tokenNumber;
    }

    public TokenData setDebitToken(Long debitToken) {
        this.debitToken = debitToken;
        return this;
    }
    public Long getDebitToken() {
        return this.debitToken;
    }

    public TokenData setCreditToken(Long creditToken) {
        this.creditToken = creditToken;
        return this;
    }
    public Long getCreditToken() {
        return this.creditToken;
    }

    public TokenData setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
