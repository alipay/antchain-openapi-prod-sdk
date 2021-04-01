// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartMydidcommunAgencyChoicetappResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // doc当前版本
    @NameInMap("pre_version")
    public Long preVersion;

    // 生成的tapp info
    @NameInMap("service_endpoint")
    public String serviceEndpoint;

    // 生成的serviceId
    @NameInMap("service_id")
    public String serviceId;

    // service 类型
    @NameInMap("service_type")
    public String serviceType;

    // EXIST 该tapp和serviceid已经包含在did doc中；
    // CONFLICT 该serviceid已经存在，但信息与此次不一致；
    // VALID 正常
    @NameInMap("desc")
    public String desc;

    public static StartMydidcommunAgencyChoicetappResponse build(java.util.Map<String, ?> map) throws Exception {
        StartMydidcommunAgencyChoicetappResponse self = new StartMydidcommunAgencyChoicetappResponse();
        return TeaModel.build(map, self);
    }

    public StartMydidcommunAgencyChoicetappResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartMydidcommunAgencyChoicetappResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartMydidcommunAgencyChoicetappResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartMydidcommunAgencyChoicetappResponse setPreVersion(Long preVersion) {
        this.preVersion = preVersion;
        return this;
    }
    public Long getPreVersion() {
        return this.preVersion;
    }

    public StartMydidcommunAgencyChoicetappResponse setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
        return this;
    }
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }

    public StartMydidcommunAgencyChoicetappResponse setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public StartMydidcommunAgencyChoicetappResponse setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public StartMydidcommunAgencyChoicetappResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
