// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InvalidateBlockchainOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 阿里云请求参数
    @NameInMap("result")
    public ALiYunOrderResult result;

    public static InvalidateBlockchainOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        InvalidateBlockchainOrderResponse self = new InvalidateBlockchainOrderResponse();
        return TeaModel.build(map, self);
    }

    public InvalidateBlockchainOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InvalidateBlockchainOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InvalidateBlockchainOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InvalidateBlockchainOrderResponse setResult(ALiYunOrderResult result) {
        this.result = result;
        return this;
    }
    public ALiYunOrderResult getResult() {
        return this.result;
    }

}
