// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateDataflowAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 实际生成的链上账户ID
    @NameInMap("chain_account")
    public String chainAccount;

    public static CreateDataflowAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataflowAccountResponse self = new CreateDataflowAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataflowAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDataflowAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDataflowAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDataflowAccountResponse setChainAccount(String chainAccount) {
        this.chainAccount = chainAccount;
        return this;
    }
    public String getChainAccount() {
        return this.chainAccount;
    }

}
