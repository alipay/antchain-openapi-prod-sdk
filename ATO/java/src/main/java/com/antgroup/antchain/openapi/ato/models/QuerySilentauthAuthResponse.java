// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QuerySilentauthAuthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 统一社会信用代码
    @NameInMap("merchant_id")
    public String merchantId;

    // 企业名称
    @NameInMap("merchant_name")
    public String merchantName;

    // 授权状态：1 进行中、2 授权成功、3 授权失败、4 取消授权
    @NameInMap("status")
    public Long status;

    // 授权失败原因，status 为 3 时返回
    @NameInMap("fail_reason")
    public String failReason;

    // 授权生效时间，格式 yyyyMMdd
    @NameInMap("valid_start_time")
    public String validStartTime;

    // 授权失效时间，格式 yyyyMMdd
    @NameInMap("valid_end_time")
    public String validEndTime;

    // 授权书下载链接，60分钟内有效，仅 status 为 2 时返回
    @NameInMap("auth_download_url")
    public String authDownloadUrl;

    public static QuerySilentauthAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySilentauthAuthResponse self = new QuerySilentauthAuthResponse();
        return TeaModel.build(map, self);
    }

    public QuerySilentauthAuthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySilentauthAuthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySilentauthAuthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySilentauthAuthResponse setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public QuerySilentauthAuthResponse setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }
    public String getMerchantName() {
        return this.merchantName;
    }

    public QuerySilentauthAuthResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QuerySilentauthAuthResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public QuerySilentauthAuthResponse setValidStartTime(String validStartTime) {
        this.validStartTime = validStartTime;
        return this;
    }
    public String getValidStartTime() {
        return this.validStartTime;
    }

    public QuerySilentauthAuthResponse setValidEndTime(String validEndTime) {
        this.validEndTime = validEndTime;
        return this;
    }
    public String getValidEndTime() {
        return this.validEndTime;
    }

    public QuerySilentauthAuthResponse setAuthDownloadUrl(String authDownloadUrl) {
        this.authDownloadUrl = authDownloadUrl;
        return this;
    }
    public String getAuthDownloadUrl() {
        return this.authDownloadUrl;
    }

}
