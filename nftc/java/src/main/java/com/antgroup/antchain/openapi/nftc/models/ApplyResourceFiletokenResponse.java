// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class ApplyResourceFiletokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 临时token信息
    @NameInMap("mass_token")
    public String massToken;

    // 上传地址
    @NameInMap("url")
    public String url;

    // afts-appid
    @NameInMap("app_id")
    public String appId;

    // afts-bizkey
    @NameInMap("biz_key")
    public String bizKey;

    public static ApplyResourceFiletokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyResourceFiletokenResponse self = new ApplyResourceFiletokenResponse();
        return TeaModel.build(map, self);
    }

    public ApplyResourceFiletokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyResourceFiletokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyResourceFiletokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyResourceFiletokenResponse setMassToken(String massToken) {
        this.massToken = massToken;
        return this;
    }
    public String getMassToken() {
        return this.massToken;
    }

    public ApplyResourceFiletokenResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ApplyResourceFiletokenResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ApplyResourceFiletokenResponse setBizKey(String bizKey) {
        this.bizKey = bizKey;
        return this;
    }
    public String getBizKey() {
        return this.bizKey;
    }

}
