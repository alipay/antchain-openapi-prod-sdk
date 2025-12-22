// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mdp.models;

import com.aliyun.tea.*;

public class QueryscoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分数
    @NameInMap("score")
    public Long score;

    public static QueryscoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryscoreResponse self = new QueryscoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryscoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryscoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryscoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryscoreResponse setScore(Long score) {
        this.score = score;
        return this;
    }
    public Long getScore() {
        return this.score;
    }

}
