// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryGongxiangTestDemoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // aaaaaa
    @NameInMap("character1")
    public String character1;

    public static QueryGongxiangTestDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGongxiangTestDemoResponse self = new QueryGongxiangTestDemoResponse();
        return TeaModel.build(map, self);
    }

    public QueryGongxiangTestDemoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGongxiangTestDemoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGongxiangTestDemoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGongxiangTestDemoResponse setCharacter1(String character1) {
        this.character1 = character1;
        return this;
    }
    public String getCharacter1() {
        return this.character1;
    }

}
