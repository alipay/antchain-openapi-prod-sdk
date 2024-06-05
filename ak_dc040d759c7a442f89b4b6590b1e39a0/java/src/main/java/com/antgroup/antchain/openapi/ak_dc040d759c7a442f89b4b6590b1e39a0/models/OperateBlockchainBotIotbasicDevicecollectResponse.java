// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class OperateBlockchainBotIotbasicDevicecollectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 上链id
    @NameInMap("antchain_id")
    public String antchainId;

    public static OperateBlockchainBotIotbasicDevicecollectResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBlockchainBotIotbasicDevicecollectResponse self = new OperateBlockchainBotIotbasicDevicecollectResponse();
        return TeaModel.build(map, self);
    }

    public OperateBlockchainBotIotbasicDevicecollectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateBlockchainBotIotbasicDevicecollectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateBlockchainBotIotbasicDevicecollectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateBlockchainBotIotbasicDevicecollectResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperateBlockchainBotIotbasicDevicecollectResponse setAntchainId(String antchainId) {
        this.antchainId = antchainId;
        return this;
    }
    public String getAntchainId() {
        return this.antchainId;
    }

}
