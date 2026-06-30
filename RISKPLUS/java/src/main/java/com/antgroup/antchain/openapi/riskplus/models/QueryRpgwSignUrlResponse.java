// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRpgwSignUrlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 签约地址
    @NameInMap("result_data")
    public String resultData;

    public static QueryRpgwSignUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRpgwSignUrlResponse self = new QueryRpgwSignUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryRpgwSignUrlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRpgwSignUrlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRpgwSignUrlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRpgwSignUrlResponse setResultData(String resultData) {
        this.resultData = resultData;
        return this;
    }
    public String getResultData() {
        return this.resultData;
    }

}
