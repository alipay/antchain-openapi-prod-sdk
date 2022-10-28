// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ListIpCodeserviceproviderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务商列表
    @NameInMap("service_provider_list")
    public java.util.List<ServiceProvider> serviceProviderList;

    public static ListIpCodeserviceproviderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpCodeserviceproviderResponse self = new ListIpCodeserviceproviderResponse();
        return TeaModel.build(map, self);
    }

    public ListIpCodeserviceproviderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListIpCodeserviceproviderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListIpCodeserviceproviderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListIpCodeserviceproviderResponse setServiceProviderList(java.util.List<ServiceProvider> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
        return this;
    }
    public java.util.List<ServiceProvider> getServiceProviderList() {
        return this.serviceProviderList;
    }

}
