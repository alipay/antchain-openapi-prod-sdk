// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateSilentauthAuthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // e签宝授权流程ID
    @NameInMap("auth_id")
    public String authId;

    // 授权方式：ONLINE、OFFLINE
    @NameInMap("authorized_way")
    public String authorizedWay;

    // 统一社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 企业名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 授权书签署链接，90天内有效，仅 ONLINE 返回
    @NameInMap("sign_url")
    public String signUrl;

    // 授权资料下载地址，60分钟内有效，仅 OFFLINE 返回
    @NameInMap("file_url")
    public String fileUrl;

    public static CreateSilentauthAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSilentauthAuthResponse self = new CreateSilentauthAuthResponse();
        return TeaModel.build(map, self);
    }

    public CreateSilentauthAuthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateSilentauthAuthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateSilentauthAuthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateSilentauthAuthResponse setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public CreateSilentauthAuthResponse setAuthorizedWay(String authorizedWay) {
        this.authorizedWay = authorizedWay;
        return this;
    }
    public String getAuthorizedWay() {
        return this.authorizedWay;
    }

    public CreateSilentauthAuthResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CreateSilentauthAuthResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public CreateSilentauthAuthResponse setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public CreateSilentauthAuthResponse setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
