// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestContentTypetwoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询返回结果
    @NameInMap("data")
    public String data;

    // 状态码
    @NameInMap("statucode")
    public String statucode;

    public static QueryTestContentTypetwoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTestContentTypetwoResponse self = new QueryTestContentTypetwoResponse();
        return TeaModel.build(map, self);
    }

    public QueryTestContentTypetwoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTestContentTypetwoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTestContentTypetwoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTestContentTypetwoResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryTestContentTypetwoResponse setStatucode(String statucode) {
        this.statucode = statucode;
        return this;
    }
    public String getStatucode() {
        return this.statucode;
    }

}
