// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 正版码信息
    @NameInMap("code_info")
    public IPCodeScannedInfo codeInfo;

    public static QueryIpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCodeResponse self = new QueryIpCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpCodeResponse setCodeInfo(IPCodeScannedInfo codeInfo) {
        this.codeInfo = codeInfo;
        return this;
    }
    public IPCodeScannedInfo getCodeInfo() {
        return this.codeInfo;
    }

}
