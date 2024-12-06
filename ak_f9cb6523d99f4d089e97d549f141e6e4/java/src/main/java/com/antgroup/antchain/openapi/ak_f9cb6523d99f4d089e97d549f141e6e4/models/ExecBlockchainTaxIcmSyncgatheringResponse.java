// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f9cb6523d99f4d089e97d549f141e6e4.models;

import com.aliyun.tea.*;

public class ExecBlockchainTaxIcmSyncgatheringResponse extends TeaModel {
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

    // 参考区块链给出的标准字段定义
    @NameInMap("query_type")
    public String queryType;

    // 是否需要重新授权
    @NameInMap("reauth")
    public Boolean reauth;

    public static ExecBlockchainTaxIcmSyncgatheringResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainTaxIcmSyncgatheringResponse self = new ExecBlockchainTaxIcmSyncgatheringResponse();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setReturnMode(String returnMode) {
        this.returnMode = returnMode;
        return this;
    }
    public String getReturnMode() {
        return this.returnMode;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setReturnResult(java.util.List<ReturnDetail> returnResult) {
        this.returnResult = returnResult;
        return this;
    }
    public java.util.List<ReturnDetail> getReturnResult() {
        return this.returnResult;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setNullDataFlag(Boolean nullDataFlag) {
        this.nullDataFlag = nullDataFlag;
        return this;
    }
    public Boolean getNullDataFlag() {
        return this.nullDataFlag;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ExecBlockchainTaxIcmSyncgatheringResponse setReauth(Boolean reauth) {
        this.reauth = reauth;
        return this;
    }
    public Boolean getReauth() {
        return this.reauth;
    }

}
