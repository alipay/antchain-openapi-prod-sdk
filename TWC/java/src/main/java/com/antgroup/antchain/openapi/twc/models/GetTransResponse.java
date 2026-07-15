// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetTransResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回文件下载路径列表
    @NameInMap("file_url")
    public java.util.List<String> fileUrl;

    // 存证事务ID
    @NameInMap("transaction_id")
    public String transactionId;

    public static GetTransResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTransResponse self = new GetTransResponse();
        return TeaModel.build(map, self);
    }

    public GetTransResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTransResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTransResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTransResponse setFileUrl(java.util.List<String> fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public java.util.List<String> getFileUrl() {
        return this.fileUrl;
    }

    public GetTransResponse setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
