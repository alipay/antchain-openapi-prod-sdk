// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseidInternalthreemetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 经营状态
    @NameInMap("enterprise_status")
    public String enterpriseStatus;

    // 营业期限
    @NameInMap("open_time")
    public String openTime;

    // 认证是否通过
    @NameInMap("passed")
    public Boolean passed;

    public static QueryEnterpriseidInternalthreemetaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseidInternalthreemetaResponse self = new QueryEnterpriseidInternalthreemetaResponse();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseidInternalthreemetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEnterpriseidInternalthreemetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEnterpriseidInternalthreemetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEnterpriseidInternalthreemetaResponse setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
        return this;
    }
    public String getEnterpriseStatus() {
        return this.enterpriseStatus;
    }

    public QueryEnterpriseidInternalthreemetaResponse setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public QueryEnterpriseidInternalthreemetaResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

}
