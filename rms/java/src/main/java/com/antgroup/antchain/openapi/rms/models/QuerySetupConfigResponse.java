// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QuerySetupConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // key jsonString
    @NameInMap("data")
    public XKeyJson data;

    public static QuerySetupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySetupConfigResponse self = new QuerySetupConfigResponse();
        return TeaModel.build(map, self);
    }

    public QuerySetupConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySetupConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySetupConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySetupConfigResponse setData(XKeyJson data) {
        this.data = data;
        return this;
    }
    public XKeyJson getData() {
        return this.data;
    }

}
