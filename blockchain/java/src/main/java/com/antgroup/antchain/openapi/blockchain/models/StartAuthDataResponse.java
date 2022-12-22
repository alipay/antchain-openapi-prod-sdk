// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthDataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权宝小程序的地址，调用方需要访问该地址从而进行用户授权
    @NameInMap("myauth_url")
    public String myauthUrl;

    public static StartAuthDataResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAuthDataResponse self = new StartAuthDataResponse();
        return TeaModel.build(map, self);
    }

    public StartAuthDataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAuthDataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAuthDataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAuthDataResponse setMyauthUrl(String myauthUrl) {
        this.myauthUrl = myauthUrl;
        return this;
    }
    public String getMyauthUrl() {
        return this.myauthUrl;
    }

}
