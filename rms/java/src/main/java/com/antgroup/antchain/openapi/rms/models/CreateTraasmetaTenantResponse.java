// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateTraasmetaTenantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // tenant
    @NameInMap("tenant")
    public TraasTenantDto tenant;

    public static CreateTraasmetaTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTraasmetaTenantResponse self = new CreateTraasmetaTenantResponse();
        return TeaModel.build(map, self);
    }

    public CreateTraasmetaTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateTraasmetaTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateTraasmetaTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateTraasmetaTenantResponse setTenant(TraasTenantDto tenant) {
        this.tenant = tenant;
        return this;
    }
    public TraasTenantDto getTenant() {
        return this.tenant;
    }

}
