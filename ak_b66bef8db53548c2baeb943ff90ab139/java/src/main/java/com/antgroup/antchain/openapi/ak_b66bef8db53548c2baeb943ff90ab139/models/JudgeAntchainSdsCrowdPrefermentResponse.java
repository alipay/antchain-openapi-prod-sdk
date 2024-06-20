// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b66bef8db53548c2baeb943ff90ab139.models;

import com.aliyun.tea.*;

public class JudgeAntchainSdsCrowdPrefermentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否优待群体：YES-是，NO-否
    @NameInMap("is_preferment")
    public String isPreferment;

    public static JudgeAntchainSdsCrowdPrefermentResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeAntchainSdsCrowdPrefermentResponse self = new JudgeAntchainSdsCrowdPrefermentResponse();
        return TeaModel.build(map, self);
    }

    public JudgeAntchainSdsCrowdPrefermentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public JudgeAntchainSdsCrowdPrefermentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public JudgeAntchainSdsCrowdPrefermentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public JudgeAntchainSdsCrowdPrefermentResponse setIsPreferment(String isPreferment) {
        this.isPreferment = isPreferment;
        return this;
    }
    public String getIsPreferment() {
        return this.isPreferment;
    }

}
