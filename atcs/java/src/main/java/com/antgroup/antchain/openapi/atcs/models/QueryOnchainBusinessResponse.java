// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.atcs.models;

import com.aliyun.tea.*;

public class QueryOnchainBusinessResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 凭证标识,如delegate_id
    @NameInMap("credential_id")
    public String credentialId;

    // 上链内容，json形式
    @NameInMap("text")
    public String text;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 任务标识
    @NameInMap("task_id")
    public String taskId;

    public static QueryOnchainBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOnchainBusinessResponse self = new QueryOnchainBusinessResponse();
        return TeaModel.build(map, self);
    }

    public QueryOnchainBusinessResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOnchainBusinessResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOnchainBusinessResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOnchainBusinessResponse setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public QueryOnchainBusinessResponse setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public QueryOnchainBusinessResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryOnchainBusinessResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
