// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitOcpProductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 组合内容
    @NameInMap("discrete_values")
    public java.util.List<DiscreteValue> discreteValues;

    // 签名结果
    @NameInMap("sign")
    public String sign;

    public static InitOcpProductResponse build(java.util.Map<String, ?> map) throws Exception {
        InitOcpProductResponse self = new InitOcpProductResponse();
        return TeaModel.build(map, self);
    }

    public InitOcpProductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitOcpProductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitOcpProductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitOcpProductResponse setDiscreteValues(java.util.List<DiscreteValue> discreteValues) {
        this.discreteValues = discreteValues;
        return this;
    }
    public java.util.List<DiscreteValue> getDiscreteValues() {
        return this.discreteValues;
    }

    public InitOcpProductResponse setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

}
