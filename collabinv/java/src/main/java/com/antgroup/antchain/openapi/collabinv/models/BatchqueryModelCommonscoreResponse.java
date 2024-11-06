// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class BatchqueryModelCommonscoreResponse extends TeaModel {
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
    @NameInMap("scores")
    public java.util.List<String> scores;

    // 意向
    @NameInMap("ratings")
    public java.util.List<String> ratings;

    // 流水号
    @NameInMap("trans_no")
    public String transNo;

    public static BatchqueryModelCommonscoreResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryModelCommonscoreResponse self = new BatchqueryModelCommonscoreResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryModelCommonscoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryModelCommonscoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryModelCommonscoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryModelCommonscoreResponse setScores(java.util.List<String> scores) {
        this.scores = scores;
        return this;
    }
    public java.util.List<String> getScores() {
        return this.scores;
    }

    public BatchqueryModelCommonscoreResponse setRatings(java.util.List<String> ratings) {
        this.ratings = ratings;
        return this;
    }
    public java.util.List<String> getRatings() {
        return this.ratings;
    }

    public BatchqueryModelCommonscoreResponse setTransNo(String transNo) {
        this.transNo = transNo;
        return this;
    }
    public String getTransNo() {
        return this.transNo;
    }

}
