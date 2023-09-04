// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class ApplyAntsaasStaffingcInsureSignurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约地址
    @NameInMap("sign_url")
    public String signUrl;

    public static ApplyAntsaasStaffingcInsureSignurlResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntsaasStaffingcInsureSignurlResponse self = new ApplyAntsaasStaffingcInsureSignurlResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntsaasStaffingcInsureSignurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyAntsaasStaffingcInsureSignurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyAntsaasStaffingcInsureSignurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyAntsaasStaffingcInsureSignurlResponse setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

}
