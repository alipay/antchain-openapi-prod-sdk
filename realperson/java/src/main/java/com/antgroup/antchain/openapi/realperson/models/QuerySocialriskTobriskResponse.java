// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QuerySocialriskTobriskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险信息，为JSONObject
    @NameInMap("risk_info")
    public String riskInfo;

    // STRING	扩展信息，预留字段。
    @NameInMap("extern_info")
    public String externInfo;

    public static QuerySocialriskTobriskResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySocialriskTobriskResponse self = new QuerySocialriskTobriskResponse();
        return TeaModel.build(map, self);
    }

    public QuerySocialriskTobriskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySocialriskTobriskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySocialriskTobriskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySocialriskTobriskResponse setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
        return this;
    }
    public String getRiskInfo() {
        return this.riskInfo;
    }

    public QuerySocialriskTobriskResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
