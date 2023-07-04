// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QuerySystemParameterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 系统参数值
    @NameInMap("system_parameters")
    public java.util.List<SystemParameterInfo> systemParameters;

    public static QuerySystemParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemParameterResponse self = new QuerySystemParameterResponse();
        return TeaModel.build(map, self);
    }

    public QuerySystemParameterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySystemParameterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySystemParameterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySystemParameterResponse setSystemParameters(java.util.List<SystemParameterInfo> systemParameters) {
        this.systemParameters = systemParameters;
        return this;
    }
    public java.util.List<SystemParameterInfo> getSystemParameters() {
        return this.systemParameters;
    }

}
