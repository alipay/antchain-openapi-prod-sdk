// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class CreateAntchainAtoSignFlowResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合同签署编号，作为合同查询的依据
    @NameInMap("sign_no")
    public String signNo;

    // 签署链接结果
    @NameInMap("sign_url_result")
    public SignUrlResult signUrlResult;

    public static CreateAntchainAtoSignFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainAtoSignFlowResponse self = new CreateAntchainAtoSignFlowResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntchainAtoSignFlowResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAntchainAtoSignFlowResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAntchainAtoSignFlowResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAntchainAtoSignFlowResponse setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public CreateAntchainAtoSignFlowResponse setSignUrlResult(SignUrlResult signUrlResult) {
        this.signUrlResult = signUrlResult;
        return this;
    }
    public SignUrlResult getSignUrlResult() {
        return this.signUrlResult;
    }

}
