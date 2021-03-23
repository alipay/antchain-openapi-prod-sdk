// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryUnionFormResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 块高
    @NameInMap("block_height")
    public Long blockHeight;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 交易时间戳
    @NameInMap("tx_timestamp")
    public String txTimestamp;

    // 业务表单ID
    @NameInMap("form_id")
    public String formId;

    // 业务单据类型
    @NameInMap("form_type")
    public String formType;

    // 解密后原始表单内容
    @NameInMap("content")
    public String content;

    public static QueryUnionFormResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionFormResponse self = new QueryUnionFormResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionFormResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUnionFormResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUnionFormResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUnionFormResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public QueryUnionFormResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryUnionFormResponse setTxTimestamp(String txTimestamp) {
        this.txTimestamp = txTimestamp;
        return this;
    }
    public String getTxTimestamp() {
        return this.txTimestamp;
    }

    public QueryUnionFormResponse setFormId(String formId) {
        this.formId = formId;
        return this;
    }
    public String getFormId() {
        return this.formId;
    }

    public QueryUnionFormResponse setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

    public QueryUnionFormResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
