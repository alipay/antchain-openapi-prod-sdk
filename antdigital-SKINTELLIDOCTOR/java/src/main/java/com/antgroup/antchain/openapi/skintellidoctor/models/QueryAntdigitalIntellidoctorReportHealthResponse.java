// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.skintellidoctor.models;

import com.aliyun.tea.*;

public class QueryAntdigitalIntellidoctorReportHealthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 响应状态
    @NameInMap("success")
    public Boolean success;

    // 响应码
    @NameInMap("code")
    public Long code;

    // 数据包
    @NameInMap("data")
    public String data;

    public static QueryAntdigitalIntellidoctorReportHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalIntellidoctorReportHealthResponse self = new QueryAntdigitalIntellidoctorReportHealthResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalIntellidoctorReportHealthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalIntellidoctorReportHealthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalIntellidoctorReportHealthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalIntellidoctorReportHealthResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAntdigitalIntellidoctorReportHealthResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryAntdigitalIntellidoctorReportHealthResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
