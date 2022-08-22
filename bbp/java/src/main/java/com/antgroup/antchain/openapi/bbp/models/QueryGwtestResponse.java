// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryGwtestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("stauts")
    public String stauts;

    public static QueryGwtestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryGwtestResponse self = new QueryGwtestResponse();
        return TeaModel.build(map, self);
    }

    public QueryGwtestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryGwtestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryGwtestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryGwtestResponse setStauts(String stauts) {
        this.stauts = stauts;
        return this;
    }
    public String getStauts() {
        return this.stauts;
    }

}
