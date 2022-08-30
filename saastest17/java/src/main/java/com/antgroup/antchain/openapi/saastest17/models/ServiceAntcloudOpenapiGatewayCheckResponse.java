// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saastest17.models;

import com.aliyun.tea.*;

public class ServiceAntcloudOpenapiGatewayCheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 如果正常，返回OK
    @NameInMap("status")
    public String status;

    public static ServiceAntcloudOpenapiGatewayCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ServiceAntcloudOpenapiGatewayCheckResponse self = new ServiceAntcloudOpenapiGatewayCheckResponse();
        return TeaModel.build(map, self);
    }

    public ServiceAntcloudOpenapiGatewayCheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ServiceAntcloudOpenapiGatewayCheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ServiceAntcloudOpenapiGatewayCheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ServiceAntcloudOpenapiGatewayCheckResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
