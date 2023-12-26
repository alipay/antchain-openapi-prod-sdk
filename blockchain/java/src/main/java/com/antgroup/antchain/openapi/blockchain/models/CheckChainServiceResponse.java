// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CheckChainServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务开通受理状态： UN_OPEN(0, "product.status.unopen"), INIT(1, "product.status.init"), OPEN(2, "product.status.open"), CLOSE(3, "product.status.close"), UNKNOWN(4, "product.status.unknown"), STOP(5, "product.status.stop");
    @NameInMap("result")
    public Long result;

    public static CheckChainServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckChainServiceResponse self = new CheckChainServiceResponse();
        return TeaModel.build(map, self);
    }

    public CheckChainServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckChainServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckChainServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckChainServiceResponse setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

}
