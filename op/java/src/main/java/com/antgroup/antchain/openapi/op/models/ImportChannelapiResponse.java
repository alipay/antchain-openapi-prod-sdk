// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.op.models;

import com.aliyun.tea.*;

public class ImportChannelapiResponse extends TeaModel {
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
    @NameInMap("failure_list")
    public java.util.List<ChannelApi> failureList;

    // 失败数量
    @NameInMap("failure_num")
    public Long failureNum;

    // 成功数量
    @NameInMap("success_num")
    public Long successNum;

    public static ImportChannelapiResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportChannelapiResponse self = new ImportChannelapiResponse();
        return TeaModel.build(map, self);
    }

    public ImportChannelapiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportChannelapiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportChannelapiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportChannelapiResponse setFailureList(java.util.List<ChannelApi> failureList) {
        this.failureList = failureList;
        return this;
    }
    public java.util.List<ChannelApi> getFailureList() {
        return this.failureList;
    }

    public ImportChannelapiResponse setFailureNum(Long failureNum) {
        this.failureNum = failureNum;
        return this;
    }
    public Long getFailureNum() {
        return this.failureNum;
    }

    public ImportChannelapiResponse setSuccessNum(Long successNum) {
        this.successNum = successNum;
        return this;
    }
    public Long getSuccessNum() {
        return this.successNum;
    }

}
