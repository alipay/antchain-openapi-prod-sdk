// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class GetDasLinkResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // H5应用身份认证信息
    @NameInMap("token")
    public String token;

    // 带有token 信息的H5页面链接
    @NameInMap("link")
    public String link;

    public static GetDasLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDasLinkResponse self = new GetDasLinkResponse();
        return TeaModel.build(map, self);
    }

    public GetDasLinkResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetDasLinkResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetDasLinkResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetDasLinkResponse setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GetDasLinkResponse setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

}
