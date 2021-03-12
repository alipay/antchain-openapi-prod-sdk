// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationDirectAuthorizationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 权限凭证
    @NameInMap("authority_cert")
    public String authorityCert;

    public static CreateDataauthorizationDirectAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationDirectAuthorizationResponse self = new CreateDataauthorizationDirectAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationDirectAuthorizationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDataauthorizationDirectAuthorizationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDataauthorizationDirectAuthorizationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDataauthorizationDirectAuthorizationResponse setAuthorityCert(String authorityCert) {
        this.authorityCert = authorityCert;
        return this;
    }
    public String getAuthorityCert() {
        return this.authorityCert;
    }

}
