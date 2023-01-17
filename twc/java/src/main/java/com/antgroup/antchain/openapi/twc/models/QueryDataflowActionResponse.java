// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryDataflowActionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作状态
    @NameInMap("status")
    public Long status;

    // 信封公钥加密后的存证公钥信息，当查询类型为DEPLOY且status为密钥上传成功时返回。
    @NameInMap("encrypted_pubkey")
    public String encryptedPubkey;

    public static QueryDataflowActionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataflowActionResponse self = new QueryDataflowActionResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataflowActionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDataflowActionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDataflowActionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDataflowActionResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryDataflowActionResponse setEncryptedPubkey(String encryptedPubkey) {
        this.encryptedPubkey = encryptedPubkey;
        return this;
    }
    public String getEncryptedPubkey() {
        return this.encryptedPubkey;
    }

}
