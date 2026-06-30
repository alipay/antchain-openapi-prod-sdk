// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ListMonitorProviderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 监测能力提供方类型列表
    @NameInMap("provider_list")
    public java.util.List<MonitorProviderType> providerList;

    public static ListMonitorProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMonitorProviderResponse self = new ListMonitorProviderResponse();
        return TeaModel.build(map, self);
    }

    public ListMonitorProviderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListMonitorProviderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMonitorProviderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListMonitorProviderResponse setProviderList(java.util.List<MonitorProviderType> providerList) {
        this.providerList = providerList;
        return this;
    }
    public java.util.List<MonitorProviderType> getProviderList() {
        return this.providerList;
    }

}
