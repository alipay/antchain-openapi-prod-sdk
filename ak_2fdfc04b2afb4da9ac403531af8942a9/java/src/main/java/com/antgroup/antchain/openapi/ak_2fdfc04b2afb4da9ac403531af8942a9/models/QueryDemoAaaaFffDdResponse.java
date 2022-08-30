// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2fdfc04b2afb4da9ac403531af8942a9.models;

import com.aliyun.tea.*;

public class QueryDemoAaaaFffDdResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // aaa
    @NameInMap("aaa")
    public String aaa;

    // bbb
    @NameInMap("bbb")
    public String bbb;

    public static QueryDemoAaaaFffDdResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoAaaaFffDdResponse self = new QueryDemoAaaaFffDdResponse();
        return TeaModel.build(map, self);
    }

    public QueryDemoAaaaFffDdResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDemoAaaaFffDdResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDemoAaaaFffDdResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDemoAaaaFffDdResponse setAaa(String aaa) {
        this.aaa = aaa;
        return this;
    }
    public String getAaa() {
        return this.aaa;
    }

    public QueryDemoAaaaFffDdResponse setBbb(String bbb) {
        this.bbb = bbb;
        return this;
    }
    public String getBbb() {
        return this.bbb;
    }

}
