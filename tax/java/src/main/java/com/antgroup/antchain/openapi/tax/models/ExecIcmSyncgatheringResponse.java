// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ExecIcmSyncgatheringResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回的请求对象jsonString
    @NameInMap("biz_content")
    public String bizContent;

    // unix秒时间戳,查询时间，用来对账使用
    @NameInMap("query_time")
    public String queryTime;

    // 返回模式
    @NameInMap("return_mode")
    public String returnMode;

    // 返回结果
    @NameInMap("return_result")
    public java.util.List<ReturnDetail> returnResult;

    // 是否查得
    @NameInMap("null_data_flag")
    public Boolean nullDataFlag;

    public static ExecIcmSyncgatheringResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecIcmSyncgatheringResponse self = new ExecIcmSyncgatheringResponse();
        return TeaModel.build(map, self);
    }

    public ExecIcmSyncgatheringResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecIcmSyncgatheringResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecIcmSyncgatheringResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecIcmSyncgatheringResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ExecIcmSyncgatheringResponse setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

    public ExecIcmSyncgatheringResponse setReturnMode(String returnMode) {
        this.returnMode = returnMode;
        return this;
    }
    public String getReturnMode() {
        return this.returnMode;
    }

    public ExecIcmSyncgatheringResponse setReturnResult(java.util.List<ReturnDetail> returnResult) {
        this.returnResult = returnResult;
        return this;
    }
    public java.util.List<ReturnDetail> getReturnResult() {
        return this.returnResult;
    }

    public ExecIcmSyncgatheringResponse setNullDataFlag(Boolean nullDataFlag) {
        this.nullDataFlag = nullDataFlag;
        return this;
    }
    public Boolean getNullDataFlag() {
        return this.nullDataFlag;
    }

}
