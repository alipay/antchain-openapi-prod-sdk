// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDeviceRegisterresultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作是否成功
    @NameInMap("success")
    public Boolean success;

    // 设备did
    @NameInMap("device_did")
    public String deviceDid;

    // 设备秘钥
    @NameInMap("private_key")
    public String privateKey;

    // 设备sn
    @NameInMap("device_sn")
    public String deviceSn;

    // 设备认证密钥密文，需要下发安全认证SDK完成设备激活
    @NameInMap("sec_key")
    public String secKey;

    // 设备认证密钥状态
    @NameInMap("service_status")
    public String serviceStatus;

    public static QueryDeviceRegisterresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceRegisterresultResponse self = new QueryDeviceRegisterresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceRegisterresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeviceRegisterresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeviceRegisterresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeviceRegisterresultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceRegisterresultResponse setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public QueryDeviceRegisterresultResponse setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public QueryDeviceRegisterresultResponse setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public QueryDeviceRegisterresultResponse setSecKey(String secKey) {
        this.secKey = secKey;
        return this;
    }
    public String getSecKey() {
        return this.secKey;
    }

    public QueryDeviceRegisterresultResponse setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

}
