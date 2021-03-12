// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyChoicetapplistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 之前did的版本号，在更新时会使用到
    @NameInMap("pre_version")
    public Long preVersion;

    // 对应servic info
    @NameInMap("service_list")
    public java.util.List<DisServicesInfo> serviceList;

    public static StartMydidcommunAgencyChoicetapplistResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyChoicetapplistResponse self = new StartMydidcommunAgencyChoicetapplistResponse();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyChoicetapplistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartMydidcommunAgencyChoicetapplistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartMydidcommunAgencyChoicetapplistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartMydidcommunAgencyChoicetapplistResponse setPreVersion(Long preVersion) {
        this.preVersion = preVersion;
        return this;
    }
    public Long getPreVersion() {
        return this.preVersion;
    }

    public StartMydidcommunAgencyChoicetapplistResponse setServiceList(java.util.List<DisServicesInfo> serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public java.util.List<DisServicesInfo> getServiceList() {
        return this.serviceList;
    }

}
