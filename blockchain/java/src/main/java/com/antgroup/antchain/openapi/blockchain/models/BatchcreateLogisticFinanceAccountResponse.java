// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateLogisticFinanceAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 失败列表
    @NameInMap("fail_list")
    public java.util.List<LogisticFinUser> failList;

    // 映射失败数
    @NameInMap("fail_num")
    public Long failNum;

    // 成功列表
    @NameInMap("success_list")
    public java.util.List<String> successList;

    // 映射成功数
    @NameInMap("success_num")
    public Long successNum;

    public static BatchcreateLogisticFinanceAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateLogisticFinanceAccountResponse self = new BatchcreateLogisticFinanceAccountResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateLogisticFinanceAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateLogisticFinanceAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateLogisticFinanceAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateLogisticFinanceAccountResponse setFailList(java.util.List<LogisticFinUser> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<LogisticFinUser> getFailList() {
        return this.failList;
    }

    public BatchcreateLogisticFinanceAccountResponse setFailNum(Long failNum) {
        this.failNum = failNum;
        return this;
    }
    public Long getFailNum() {
        return this.failNum;
    }

    public BatchcreateLogisticFinanceAccountResponse setSuccessList(java.util.List<String> successList) {
        this.successList = successList;
        return this;
    }
    public java.util.List<String> getSuccessList() {
        return this.successList;
    }

    public BatchcreateLogisticFinanceAccountResponse setSuccessNum(Long successNum) {
        this.successNum = successNum;
        return this;
    }
    public Long getSuccessNum() {
        return this.successNum;
    }

}
