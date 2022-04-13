// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListContainerserviceServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 容器服务 Service 列表
    @NameInMap("services")
    public java.util.List<ServiceInfo> services;

    public static ListContainerserviceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContainerserviceServiceResponse self = new ListContainerserviceServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListContainerserviceServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListContainerserviceServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListContainerserviceServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListContainerserviceServiceResponse setServices(java.util.List<ServiceInfo> services) {
        this.services = services;
        return this;
    }
    public java.util.List<ServiceInfo> getServices() {
        return this.services;
    }

}
