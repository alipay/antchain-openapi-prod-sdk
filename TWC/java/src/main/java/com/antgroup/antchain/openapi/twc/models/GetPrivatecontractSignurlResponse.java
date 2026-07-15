// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetPrivatecontractSignurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 流程签署地址
    @NameInMap("sign_url")
    public String signUrl;

    // 返回code,200成功，其他均为失败
    @NameInMap("code")
    public String code;

    // 返回信息，成功返回success，错误时会返回详细信息。
    @NameInMap("message")
    public String message;

    public static GetPrivatecontractSignurlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPrivatecontractSignurlResponse self = new GetPrivatecontractSignurlResponse();
        return TeaModel.build(map, self);
    }

    public GetPrivatecontractSignurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetPrivatecontractSignurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetPrivatecontractSignurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetPrivatecontractSignurlResponse setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public GetPrivatecontractSignurlResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPrivatecontractSignurlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
