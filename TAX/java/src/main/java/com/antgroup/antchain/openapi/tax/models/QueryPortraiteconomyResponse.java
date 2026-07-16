// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryPortraiteconomyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // score
    @NameInMap("score")
    public String score;

    public static QueryPortraiteconomyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPortraiteconomyResponse self = new QueryPortraiteconomyResponse();
        return TeaModel.build(map, self);
    }

    public QueryPortraiteconomyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPortraiteconomyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPortraiteconomyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPortraiteconomyResponse setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
