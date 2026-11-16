// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ApplyAidashboardDeviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备唯一ID
    @NameInMap("uuid")
    public String uuid;

    // 服务端公钥
    @NameInMap("server_pub_key")
    public String serverPubKey;

    // 证书信息
    @NameInMap("cert_data")
    public String certData;

    // 证书签名
    @NameInMap("cert_sign")
    public String certSign;

    // 响应签名
    @NameInMap("response_sign")
    public String responseSign;

    public static ApplyAidashboardDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAidashboardDeviceResponse self = new ApplyAidashboardDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAidashboardDeviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyAidashboardDeviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyAidashboardDeviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyAidashboardDeviceResponse setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public ApplyAidashboardDeviceResponse setServerPubKey(String serverPubKey) {
        this.serverPubKey = serverPubKey;
        return this;
    }
    public String getServerPubKey() {
        return this.serverPubKey;
    }

    public ApplyAidashboardDeviceResponse setCertData(String certData) {
        this.certData = certData;
        return this;
    }
    public String getCertData() {
        return this.certData;
    }

    public ApplyAidashboardDeviceResponse setCertSign(String certSign) {
        this.certSign = certSign;
        return this;
    }
    public String getCertSign() {
        return this.certSign;
    }

    public ApplyAidashboardDeviceResponse setResponseSign(String responseSign) {
        this.responseSign = responseSign;
        return this;
    }
    public String getResponseSign() {
        return this.responseSign;
    }

}
