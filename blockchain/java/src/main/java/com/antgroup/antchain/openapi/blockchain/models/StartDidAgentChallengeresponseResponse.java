// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidAgentChallengeresponseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // {
    //   ''challenge":xxxx, //待签名的明文
    //   “expired”：xxxx,//签名有效时间
    //   “sign”：xxxx，//对上述字段进行的签名
    // }
    @NameInMap("sign_data")
    public String signData;

    public static StartDidAgentChallengeresponseResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDidAgentChallengeresponseResponse self = new StartDidAgentChallengeresponseResponse();
        return TeaModel.build(map, self);
    }

    public StartDidAgentChallengeresponseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDidAgentChallengeresponseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDidAgentChallengeresponseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDidAgentChallengeresponseResponse setSignData(String signData) {
        this.signData = signData;
        return this;
    }
    public String getSignData() {
        return this.signData;
    }

}
