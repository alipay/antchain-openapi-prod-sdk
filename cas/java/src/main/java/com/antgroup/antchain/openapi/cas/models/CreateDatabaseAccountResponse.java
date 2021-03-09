// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccountResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 账户序列号
    @NameInMap("account_sequence")
    public String accountSequence;

    public static CreateDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccountResponse self = new CreateDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDatabaseAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDatabaseAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDatabaseAccountResponse setAccountSequence(String accountSequence) {
        this.accountSequence = accountSequence;
        return this;
    }
    public String getAccountSequence() {
        return this.accountSequence;
    }

}
