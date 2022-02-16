// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class RunMarketServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务调用结果
    @NameInMap("result_data")
    public java.util.List<KeyValuePair> resultData;

    public static RunMarketServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMarketServiceResponse self = new RunMarketServiceResponse();
        return TeaModel.build(map, self);
    }

    public RunMarketServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RunMarketServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RunMarketServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RunMarketServiceResponse setResultData(java.util.List<KeyValuePair> resultData) {
        this.resultData = resultData;
        return this;
    }
    public java.util.List<KeyValuePair> getResultData() {
        return this.resultData;
    }

}
