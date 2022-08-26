// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_98520c7e7d21426d90860804b9a37c5f.models;

import com.aliyun.tea.*;

public class GetTwcNotaryCertificateDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存证证明下载地址
    @NameInMap("url")
    public String url;

    // 状态值
    @NameInMap("code")
    public Long code;

    // 状态信息描述
    @NameInMap("message")
    public String message;

    public static GetTwcNotaryCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTwcNotaryCertificateDetailResponse self = new GetTwcNotaryCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetTwcNotaryCertificateDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTwcNotaryCertificateDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTwcNotaryCertificateDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTwcNotaryCertificateDetailResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GetTwcNotaryCertificateDetailResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTwcNotaryCertificateDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
