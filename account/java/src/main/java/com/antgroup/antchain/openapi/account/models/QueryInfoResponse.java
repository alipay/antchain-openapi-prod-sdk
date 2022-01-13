// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.account.models;

import com.aliyun.tea.*;

public class QueryInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户的银行打款卡号
    @NameInMap("card_id")
    public String cardId;

    // 银行户名
    @NameInMap("account_name")
    public String accountName;

    // 开户银行
    @NameInMap("bank_name")
    public String bankName;

    // 网点/支行 （客资特有）
    @NameInMap("branch_bank_name")
    public String branchBankName;

    // 联行号（客资特有）
    @NameInMap("bank_line_number")
    public String bankLineNumber;

    // 开户地（客资特有）
    @NameInMap("bank_location")
    public String bankLocation;

    // ALIPAY-客资账户 FINANCE-财资账户
    @NameInMap("account_type")
    public String accountType;

    public static QueryInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInfoResponse self = new QueryInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInfoResponse setCardId(String cardId) {
        this.cardId = cardId;
        return this;
    }
    public String getCardId() {
        return this.cardId;
    }

    public QueryInfoResponse setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public QueryInfoResponse setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public QueryInfoResponse setBranchBankName(String branchBankName) {
        this.branchBankName = branchBankName;
        return this;
    }
    public String getBranchBankName() {
        return this.branchBankName;
    }

    public QueryInfoResponse setBankLineNumber(String bankLineNumber) {
        this.bankLineNumber = bankLineNumber;
        return this;
    }
    public String getBankLineNumber() {
        return this.bankLineNumber;
    }

    public QueryInfoResponse setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
        return this;
    }
    public String getBankLocation() {
        return this.bankLocation;
    }

    public QueryInfoResponse setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

}
