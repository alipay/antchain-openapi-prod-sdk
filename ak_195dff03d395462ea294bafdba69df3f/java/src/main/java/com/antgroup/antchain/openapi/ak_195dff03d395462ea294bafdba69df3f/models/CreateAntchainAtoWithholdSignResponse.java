// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CreateAntchainAtoWithholdSignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约字符串
    @NameInMap("sign_str")
    public String signStr;

    // 签约字符串类型。SIGN_ONLY:仅签约;PAY_SIGN:支付并签约
    @NameInMap("sign_str_type")
    public String signStrType;

    public static CreateAntchainAtoWithholdSignResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainAtoWithholdSignResponse self = new CreateAntchainAtoWithholdSignResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntchainAtoWithholdSignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntchainAtoWithholdSignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntchainAtoWithholdSignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntchainAtoWithholdSignResponse setSignStr(String signStr) {
        this.signStr = signStr;
        return this;
    }
    public String getSignStr() {
        return this.signStr;
    }

    public CreateAntchainAtoWithholdSignResponse setSignStrType(String signStrType) {
        this.signStrType = signStrType;
        return this;
    }
    public String getSignStrType() {
        return this.signStrType;
    }

}
