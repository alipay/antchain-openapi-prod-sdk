// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BlockConsumeCardInfo extends TeaModel {
    // 外部系统对该个人/机构用户的内部编号,用于唯一识别该用户
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户的链上账户Id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 开户行名称
    @NameInMap("bank_name")
    @Validation(required = true)
    public String bankName;

    // 消费卡开通绑定的银行卡卡号
    @NameInMap("bank_card_id")
    @Validation(required = true)
    public String bankCardId;

    // 开户名称
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    // 账户余额(元)
    @NameInMap("debit_amount")
    @Validation(required = true)
    public String debitAmount;

    // 信用余额(元)
    @NameInMap("credit_amount")
    @Validation(required = true)
    public String creditAmount;

    // 资产的来源<来源账户ID_余额/信用额, 数量>, 例如: "accountId1_Debit": 11000表示这笔资产来源于accountId1,是accountId1这个账户通过Debit余额发行的资产。
    @NameInMap("asset_map")
    @Validation(required = true)
    public String assetMap;

    public static BlockConsumeCardInfo build(java.util.Map<String, ?> map) throws Exception {
        BlockConsumeCardInfo self = new BlockConsumeCardInfo();
        return TeaModel.build(map, self);
    }

    public BlockConsumeCardInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BlockConsumeCardInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BlockConsumeCardInfo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public BlockConsumeCardInfo setBankCardId(String bankCardId) {
        this.bankCardId = bankCardId;
        return this;
    }
    public String getBankCardId() {
        return this.bankCardId;
    }

    public BlockConsumeCardInfo setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public BlockConsumeCardInfo setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
        return this;
    }
    public String getDebitAmount() {
        return this.debitAmount;
    }

    public BlockConsumeCardInfo setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public BlockConsumeCardInfo setAssetMap(String assetMap) {
        this.assetMap = assetMap;
        return this;
    }
    public String getAssetMap() {
        return this.assetMap;
    }

}
