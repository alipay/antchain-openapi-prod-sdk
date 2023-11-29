// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryShaofangTestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // the_one
    @NameInMap("the_one")
    public String theOne;

    // the_two
    @NameInMap("the_two")
    public Long theTwo;

    public static QueryShaofangTestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryShaofangTestResponse self = new QueryShaofangTestResponse();
        return TeaModel.build(map, self);
    }

    public QueryShaofangTestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryShaofangTestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryShaofangTestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryShaofangTestResponse setTheOne(String theOne) {
        this.theOne = theOne;
        return this;
    }
    public String getTheOne() {
        return this.theOne;
    }

    public QueryShaofangTestResponse setTheTwo(Long theTwo) {
        this.theTwo = theTwo;
        return this;
    }
    public Long getTheTwo() {
        return this.theTwo;
    }

}
