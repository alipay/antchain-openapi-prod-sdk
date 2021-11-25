// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckChainSubnetNodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 阿里云节点信息列表
    @NameInMap("result")
    public java.util.List<ALiYunChainNodeInfo> result;

    public static CheckChainSubnetNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckChainSubnetNodeResponse self = new CheckChainSubnetNodeResponse();
        return TeaModel.build(map, self);
    }

    public CheckChainSubnetNodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckChainSubnetNodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckChainSubnetNodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckChainSubnetNodeResponse setResult(java.util.List<ALiYunChainNodeInfo> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ALiYunChainNodeInfo> getResult() {
        return this.result;
    }

}
