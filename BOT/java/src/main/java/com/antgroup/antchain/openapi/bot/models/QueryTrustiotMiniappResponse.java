// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTrustiotMiniappResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 携带 redirectToken 的跳转 URL
    @NameInMap("redirect_url")
    public String redirectUrl;

    // 有效期开始时间（时间戳）
    @NameInMap("valid_from")
    public Long validFrom;

    // 有效期截止时间（时间戳）
    @NameInMap("valid_to")
    public Long validTo;

    // 按 scene 聚合的未注册设备
    @NameInMap("invalid_devices")
    public java.util.List<DeviceScopeItem> invalidDevices;

    // 实际授权的有效设备数
    @NameInMap("valid_device_count")
    public Long validDeviceCount;

    public static QueryTrustiotMiniappResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrustiotMiniappResponse self = new QueryTrustiotMiniappResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrustiotMiniappResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTrustiotMiniappResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTrustiotMiniappResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTrustiotMiniappResponse setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }
    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public QueryTrustiotMiniappResponse setValidFrom(Long validFrom) {
        this.validFrom = validFrom;
        return this;
    }
    public Long getValidFrom() {
        return this.validFrom;
    }

    public QueryTrustiotMiniappResponse setValidTo(Long validTo) {
        this.validTo = validTo;
        return this;
    }
    public Long getValidTo() {
        return this.validTo;
    }

    public QueryTrustiotMiniappResponse setInvalidDevices(java.util.List<DeviceScopeItem> invalidDevices) {
        this.invalidDevices = invalidDevices;
        return this;
    }
    public java.util.List<DeviceScopeItem> getInvalidDevices() {
        return this.invalidDevices;
    }

    public QueryTrustiotMiniappResponse setValidDeviceCount(Long validDeviceCount) {
        this.validDeviceCount = validDeviceCount;
        return this;
    }
    public Long getValidDeviceCount() {
        return this.validDeviceCount;
    }

}
