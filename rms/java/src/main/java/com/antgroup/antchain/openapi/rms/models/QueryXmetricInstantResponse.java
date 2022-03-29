// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryXmetricInstantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("data")
    public XMetricResponse data;

    public static QueryXmetricInstantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryXmetricInstantResponse self = new QueryXmetricInstantResponse();
        return TeaModel.build(map, self);
    }

    public QueryXmetricInstantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryXmetricInstantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryXmetricInstantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryXmetricInstantResponse setData(XMetricResponse data) {
        this.data = data;
        return this;
    }
    public XMetricResponse getData() {
        return this.data;
    }

}
