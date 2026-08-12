// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class SelfregisterAntchainDasKyaManageddidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 注册did
    @NameInMap("did")
    public String did;

    public static SelfregisterAntchainDasKyaManageddidResponse build(java.util.Map<String, ?> map) throws Exception {
        SelfregisterAntchainDasKyaManageddidResponse self = new SelfregisterAntchainDasKyaManageddidResponse();
        return TeaModel.build(map, self);
    }

    public SelfregisterAntchainDasKyaManageddidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SelfregisterAntchainDasKyaManageddidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SelfregisterAntchainDasKyaManageddidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SelfregisterAntchainDasKyaManageddidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

}
