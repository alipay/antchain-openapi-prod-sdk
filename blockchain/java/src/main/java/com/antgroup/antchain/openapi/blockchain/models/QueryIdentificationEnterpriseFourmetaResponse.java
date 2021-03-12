// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryIdentificationEnterpriseFourmetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

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

    public static QueryIdentificationEnterpriseFourmetaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationEnterpriseFourmetaResponse self = new QueryIdentificationEnterpriseFourmetaResponse();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationEnterpriseFourmetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIdentificationEnterpriseFourmetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIdentificationEnterpriseFourmetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIdentificationEnterpriseFourmetaResponse setEnterpriseStatus(String enterpriseStatus) {
        this.enterpriseStatus = enterpriseStatus;
        return this;
    }
    public String getEnterpriseStatus() {
        return this.enterpriseStatus;
    }

    public QueryIdentificationEnterpriseFourmetaResponse setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }
    public String getOpenTime() {
        return this.openTime;
    }

    public QueryIdentificationEnterpriseFourmetaResponse setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }
    public Boolean getPassed() {
        return this.passed;
    }

}
