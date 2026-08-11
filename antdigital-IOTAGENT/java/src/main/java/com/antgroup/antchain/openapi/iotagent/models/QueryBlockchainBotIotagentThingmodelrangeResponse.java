// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotagentThingmodelrangeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("has_data")
    public Boolean hasData;

    @NameInMap("first_report_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String firstReportTime;

    @NameInMap("latest_report_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String latestReportTime;

    public static QueryBlockchainBotIotagentThingmodelrangeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotagentThingmodelrangeResponse self = new QueryBlockchainBotIotagentThingmodelrangeResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotagentThingmodelrangeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotIotagentThingmodelrangeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotIotagentThingmodelrangeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotIotagentThingmodelrangeResponse setHasData(Boolean hasData) {
        this.hasData = hasData;
        return this;
    }
    public Boolean getHasData() {
        return this.hasData;
    }

    public QueryBlockchainBotIotagentThingmodelrangeResponse setFirstReportTime(String firstReportTime) {
        this.firstReportTime = firstReportTime;
        return this;
    }
    public String getFirstReportTime() {
        return this.firstReportTime;
    }

    public QueryBlockchainBotIotagentThingmodelrangeResponse setLatestReportTime(String latestReportTime) {
        this.latestReportTime = latestReportTime;
        return this;
    }
    public String getLatestReportTime() {
        return this.latestReportTime;
    }

}
