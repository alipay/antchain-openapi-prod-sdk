// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.donpa.models;

import com.aliyun.tea.*;

public class QuerySlxfResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 其中数组中的每一项 为 脱 敏 手 机 号 码 unicomCustomerId ，请求外呼 时使用
    @NameInMap("data")
    public java.util.List<String> data;

    public static QuerySlxfResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlxfResponse self = new QuerySlxfResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlxfResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySlxfResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySlxfResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySlxfResponse setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

}
