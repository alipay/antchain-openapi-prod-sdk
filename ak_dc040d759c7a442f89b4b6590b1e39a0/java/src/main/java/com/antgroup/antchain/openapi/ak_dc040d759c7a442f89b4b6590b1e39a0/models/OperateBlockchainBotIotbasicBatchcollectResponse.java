// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models;

import com.aliyun.tea.*;

public class OperateBlockchainBotIotbasicBatchcollectResponse extends TeaModel {
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

    // 上链成功列表
    @NameInMap("success_list")
    public java.util.List<DeviceCollectResult> successList;

    // 上链失败列表
    @NameInMap("fail_list")
    public java.util.List<DeviceCollectFail> failList;

    public static OperateBlockchainBotIotbasicBatchcollectResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBlockchainBotIotbasicBatchcollectResponse self = new OperateBlockchainBotIotbasicBatchcollectResponse();
        return TeaModel.build(map, self);
    }

    public OperateBlockchainBotIotbasicBatchcollectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateBlockchainBotIotbasicBatchcollectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateBlockchainBotIotbasicBatchcollectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateBlockchainBotIotbasicBatchcollectResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperateBlockchainBotIotbasicBatchcollectResponse setSuccessList(java.util.List<DeviceCollectResult> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<DeviceCollectResult> getSuccessList() {
        return this.successList;
    }

    public OperateBlockchainBotIotbasicBatchcollectResponse setFailList(java.util.List<DeviceCollectFail> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<DeviceCollectFail> getFailList() {
        return this.failList;
    }

}
