// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryBacktrackScoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模型分数
    @NameInMap("score")
    public String score;

    // 流水号
    @NameInMap("trans_no")
    public String transNo;

    public static QueryBacktrackScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBacktrackScoreResponse self = new QueryBacktrackScoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryBacktrackScoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBacktrackScoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBacktrackScoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBacktrackScoreResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public QueryBacktrackScoreResponse setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

}
