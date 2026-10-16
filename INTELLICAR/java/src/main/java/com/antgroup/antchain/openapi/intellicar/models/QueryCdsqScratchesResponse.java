// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryCdsqScratchesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果码，999999 表示成功
    @NameInMap("response_code")
    public String responseCode;

    // 错误信息，成功时为空
    @NameInMap("response_msg")
    public String responseMsg;

    // 电子保单 url 地址
    @NameInMap("return_pdf_value")
    public String returnPdfValue;

    // 保单服务号
    @NameInMap("policy_no")
    public String policyNo;

    // 保单生效时间，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("begin_time")
    public String beginTime;

    // 保单失效时间，格式：yyyy-MM-dd HH:mm:ss
    @NameInMap("end_time")
    public String endTime;

    public static QueryCdsqScratchesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCdsqScratchesResponse self = new QueryCdsqScratchesResponse();
        return TeaModel.build(map, self);
    }

    public QueryCdsqScratchesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCdsqScratchesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCdsqScratchesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCdsqScratchesResponse setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public QueryCdsqScratchesResponse setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
        return this;
    }
    public String getResponseMsg() {
        return this.responseMsg;
    }

    public QueryCdsqScratchesResponse setReturnPdfValue(String returnPdfValue) {
        this.returnPdfValue = returnPdfValue;
        return this;
    }
    public String getReturnPdfValue() {
        return this.returnPdfValue;
    }

    public QueryCdsqScratchesResponse setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
        return this;
    }
    public String getPolicyNo() {
        return this.policyNo;
    }

    public QueryCdsqScratchesResponse setBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public String getBeginTime() {
        return this.beginTime;
    }

    public QueryCdsqScratchesResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
