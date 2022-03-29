// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryTraasmetaTenantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // tenants
    @NameInMap("tenants")
    public java.util.List<TraasTenantDto> tenants;

    public static BatchqueryTraasmetaTenantResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTraasmetaTenantResponse self = new BatchqueryTraasmetaTenantResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryTraasmetaTenantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryTraasmetaTenantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryTraasmetaTenantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryTraasmetaTenantResponse setTenants(java.util.List<TraasTenantDto> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<TraasTenantDto> getTenants() {
        return this.tenants;
    }

}
