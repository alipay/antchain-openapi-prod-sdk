// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdp.models;

import com.aliyun.tea.*;

public class GetuserscoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 预测分数值
    @NameInMap("score")
    public Long score;

    public static GetuserscoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetuserscoreResponse self = new GetuserscoreResponse();
        return TeaModel.build(map, self);
    }

    public GetuserscoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetuserscoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetuserscoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetuserscoreResponse setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

}
