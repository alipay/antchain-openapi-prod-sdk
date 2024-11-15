// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class QueryBusinessruleMatchResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 最终匹配结果
    @NameInMap("match_result")
    public String matchResult;

    // 出入参信息
    @NameInMap("http_content")
    public String httpContent;

    // 防控结果
    @NameInMap("prevent_result")
    public String preventResult;

    // 匹配到的L5
    @NameInMap("match_business_code")
    public String matchBusinessCode;

    // 匹配到的实例id
    @NameInMap("match_instance_id")
    public String matchInstanceId;

    // 规则引擎耗时
    @NameInMap("engine_time")
    public String engineTime;

    public static QueryBusinessruleMatchResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessruleMatchResponse self = new QueryBusinessruleMatchResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessruleMatchResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessruleMatchResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessruleMatchResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessruleMatchResponse setMatchResult(String matchResult) {
        this.matchResult = matchResult;
        return this;
    }
    public String getMatchResult() {
        return this.matchResult;
    }

    public QueryBusinessruleMatchResponse setHttpContent(String httpContent) {
        this.httpContent = httpContent;
        return this;
    }
    public String getHttpContent() {
        return this.httpContent;
    }

    public QueryBusinessruleMatchResponse setPreventResult(String preventResult) {
        this.preventResult = preventResult;
        return this;
    }
    public String getPreventResult() {
        return this.preventResult;
    }

    public QueryBusinessruleMatchResponse setMatchBusinessCode(String matchBusinessCode) {
        this.matchBusinessCode = matchBusinessCode;
        return this;
    }
    public String getMatchBusinessCode() {
        return this.matchBusinessCode;
    }

    public QueryBusinessruleMatchResponse setMatchInstanceId(String matchInstanceId) {
        this.matchInstanceId = matchInstanceId;
        return this;
    }
    public String getMatchInstanceId() {
        return this.matchInstanceId;
    }

    public QueryBusinessruleMatchResponse setEngineTime(String engineTime) {
        this.engineTime = engineTime;
        return this;
    }
    public String getEngineTime() {
        return this.engineTime;
    }

}
