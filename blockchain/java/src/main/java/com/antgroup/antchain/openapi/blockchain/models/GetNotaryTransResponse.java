// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class GetNotaryTransResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 返回文件下载路径列表
    @NameInMap("file_url")
    public java.util.List<String> fileUrl;

    // 存证事务ID
    @NameInMap("token")
    public String token;

    public static GetNotaryTransResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNotaryTransResponse self = new GetNotaryTransResponse();
        return TeaModel.build(map, self);
    }

    public GetNotaryTransResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetNotaryTransResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetNotaryTransResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetNotaryTransResponse setFileUrl(java.util.List<String> fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public java.util.List<String> getFileUrl() {
        return this.fileUrl;
    }

    public GetNotaryTransResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
