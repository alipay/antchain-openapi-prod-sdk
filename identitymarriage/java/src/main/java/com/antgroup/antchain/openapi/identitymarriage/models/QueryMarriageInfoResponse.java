// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.identitymarriage.models;

import com.aliyun.tea.*;

public class QueryMarriageInfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回数据
    @NameInMap("data")
    public String data;

    public static QueryMarriageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMarriageInfoResponse self = new QueryMarriageInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryMarriageInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMarriageInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMarriageInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMarriageInfoResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
