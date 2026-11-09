// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class InvokeAntchainDasKyaHostgroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 逻辑业务HTTP状态码外层成功不代表业务成功
    @NameInMap("logical_status")
    public Long logicalStatus;

    // 原始WebResult JSON字节的Base64编码
    @NameInMap("logical_body_base64")
    public String logicalBodyBase64;

    public static InvokeAntchainDasKyaHostgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeAntchainDasKyaHostgroupResponse self = new InvokeAntchainDasKyaHostgroupResponse();
        return TeaModel.build(map, self);
    }

    public InvokeAntchainDasKyaHostgroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InvokeAntchainDasKyaHostgroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InvokeAntchainDasKyaHostgroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InvokeAntchainDasKyaHostgroupResponse setLogicalStatus(Long logicalStatus) {
        this.logicalStatus = logicalStatus;
        return this;
    }
    public Long getLogicalStatus() {
        return this.logicalStatus;
    }

    public InvokeAntchainDasKyaHostgroupResponse setLogicalBodyBase64(String logicalBodyBase64) {
        this.logicalBodyBase64 = logicalBodyBase64;
        return this;
    }
    public String getLogicalBodyBase64() {
        return this.logicalBodyBase64;
    }

}
