// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ConfirmBlockchainOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 阿里云接口返回结果
    @NameInMap("result")
    public ALiYunOrderResult result;

    public static ConfirmBlockchainOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmBlockchainOrderResponse self = new ConfirmBlockchainOrderResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmBlockchainOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmBlockchainOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmBlockchainOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmBlockchainOrderResponse setResult(ALiYunOrderResult result) {
        this.result = result;
        return this;
    }
    public ALiYunOrderResult getResult() {
        return this.result;
    }

}
