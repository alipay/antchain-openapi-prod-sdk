// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryInsuranceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务授权列表
    @NameInMap("business_authorize_records")
    public java.util.List<BusinessRecordsPairs> businessAuthorizeRecords;

    public static QueryInsuranceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceResponse self = new QueryInsuranceResponse();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInsuranceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInsuranceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInsuranceResponse setBusinessAuthorizeRecords(java.util.List<BusinessRecordsPairs> businessAuthorizeRecords) {
        this.businessAuthorizeRecords = businessAuthorizeRecords;
        return this;
    }
    public java.util.List<BusinessRecordsPairs> getBusinessAuthorizeRecords() {
        return this.businessAuthorizeRecords;
    }

}
