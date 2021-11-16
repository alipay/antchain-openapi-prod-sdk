// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseFinancecertifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核验结果
    @NameInMap("certify_result")
    public String certifyResult;

    // 1636600547
    @NameInMap("certify_time")
    public Long certifyTime;

    // 还款信息详情
    @NameInMap("rental_infos")
    public java.util.List<FinanceCertifyRentalInfo> rentalInfos;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误码描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseFinancecertifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseFinancecertifyResponse self = new QueryLeaseFinancecertifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseFinancecertifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseFinancecertifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseFinancecertifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseFinancecertifyResponse setCertifyResult(String certifyResult) {
        this.certifyResult = certifyResult;
        return this;
    }
    public String getCertifyResult() {
        return this.certifyResult;
    }

    public QueryLeaseFinancecertifyResponse setCertifyTime(Long certifyTime) {
        this.certifyTime = certifyTime;
        return this;
    }
    public Long getCertifyTime() {
        return this.certifyTime;
    }

    public QueryLeaseFinancecertifyResponse setRentalInfos(java.util.List<FinanceCertifyRentalInfo> rentalInfos) {
        this.rentalInfos = rentalInfos;
        return this;
    }
    public java.util.List<FinanceCertifyRentalInfo> getRentalInfos() {
        return this.rentalInfos;
    }

    public QueryLeaseFinancecertifyResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseFinancecertifyResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
