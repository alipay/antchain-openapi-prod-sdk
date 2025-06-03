// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class QueryGongxiangTesttestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回参
    @NameInMap("character1")
    public String character1;

    public static QueryGongxiangTesttestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGongxiangTesttestResponse self = new QueryGongxiangTesttestResponse();
        return TeaModel.build(map, self);
    }

    public QueryGongxiangTesttestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGongxiangTesttestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGongxiangTesttestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGongxiangTesttestResponse setCharacter1(String character1) {
        this.character1 = character1;
        return this;
    }
    public String getCharacter1() {
        return this.character1;
    }

}
