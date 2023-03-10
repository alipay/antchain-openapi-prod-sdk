// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class MatchIpCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否当前持有人
    @NameInMap("match_result")
    public Boolean matchResult;

    public static MatchIpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        MatchIpCodeResponse self = new MatchIpCodeResponse();
        return TeaModel.build(map, self);
    }

    public MatchIpCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public MatchIpCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MatchIpCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public MatchIpCodeResponse setMatchResult(Boolean matchResult) {
        this.matchResult = matchResult;
        return this;
    }
    public Boolean getMatchResult() {
        return this.matchResult;
    }

}
