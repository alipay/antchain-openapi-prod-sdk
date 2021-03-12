// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckBlockchainOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 阿里云订单结果
    @NameInMap("result")
    public ALiYunOrderResult result;

    public static CheckBlockchainOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBlockchainOrderResponse self = new CheckBlockchainOrderResponse();
        return TeaModel.build(map, self);
    }

    public CheckBlockchainOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckBlockchainOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckBlockchainOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckBlockchainOrderResponse setResult(ALiYunOrderResult result) {
        this.result = result;
        return this;
    }
    public ALiYunOrderResult getResult() {
        return this.result;
    }

}
