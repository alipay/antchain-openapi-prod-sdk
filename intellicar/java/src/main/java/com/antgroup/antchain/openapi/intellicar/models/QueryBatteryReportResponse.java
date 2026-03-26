// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryBatteryReportResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 成功或失败的编码
    @NameInMap("code")
    public String code;

    // 成功或失败的提示语
    @NameInMap("msg")
    public String msg;

    // 返回数据（code=100时返回）
    @NameInMap("result")
    public BatteryReportResult result;

    public static QueryBatteryReportResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBatteryReportResponse self = new QueryBatteryReportResponse();
        return TeaModel.build(map, self);
    }

    public QueryBatteryReportResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBatteryReportResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBatteryReportResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBatteryReportResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatteryReportResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryBatteryReportResponse setResult(BatteryReportResult result) {
        this.result = result;
        return this;
    }
    public BatteryReportResult getResult() {
        return this.result;
    }

}
