// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class QueryPartnerSettleinResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码
    @NameInMap("code")
    public String code;

    // 错误描述
    @NameInMap("error_message")
    public String errorMessage;

    // 签约状态
    @NameInMap("status")
    public String status;

    // 开始时间
    @NameInMap("gmt_start")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtStart;

    // 结束时间
    @NameInMap("gmt_end")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtEnd;

    // 签约信息
    @NameInMap("sign_record")
    public SignRecord signRecord;

    public static QueryPartnerSettleinResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPartnerSettleinResponse self = new QueryPartnerSettleinResponse();
        return TeaModel.build(map, self);
    }

    public QueryPartnerSettleinResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPartnerSettleinResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPartnerSettleinResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPartnerSettleinResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPartnerSettleinResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPartnerSettleinResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryPartnerSettleinResponse setGmtStart(String gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public String getGmtStart() {
        return this.gmtStart;
    }

    public QueryPartnerSettleinResponse setGmtEnd(String gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public String getGmtEnd() {
        return this.gmtEnd;
    }

    public QueryPartnerSettleinResponse setSignRecord(SignRecord signRecord) {
        this.signRecord = signRecord;
        return this;
    }
    public SignRecord getSignRecord() {
        return this.signRecord;
    }

}
