// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryAuthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户授权
    @NameInMap("data")
    public java.util.List<UserAuth> data;

    public static QueryAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthResponse self = new QueryAuthResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthResponse setData(java.util.List<UserAuth> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UserAuth> getData() {
        return this.data;
    }

}
