// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_55afdde95cc7448bad87a98d904c1f44.models;

import com.aliyun.tea.*;

public class GetUniversalsaasDigitalhumanNlsTokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // appkey
    // 
    @NameInMap("app_key")
    public String appKey;

    // token
    @NameInMap("app_token")
    public String appToken;

    // token的有效期时间戳
    @NameInMap("expire_time")
    public Long expireTime;

    public static GetUniversalsaasDigitalhumanNlsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUniversalsaasDigitalhumanNlsTokenResponse self = new GetUniversalsaasDigitalhumanNlsTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetUniversalsaasDigitalhumanNlsTokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetUniversalsaasDigitalhumanNlsTokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUniversalsaasDigitalhumanNlsTokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetUniversalsaasDigitalhumanNlsTokenResponse setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public GetUniversalsaasDigitalhumanNlsTokenResponse setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public GetUniversalsaasDigitalhumanNlsTokenResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

}
