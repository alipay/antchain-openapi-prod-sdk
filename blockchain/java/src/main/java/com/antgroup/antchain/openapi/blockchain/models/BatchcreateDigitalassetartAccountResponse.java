// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateDigitalassetartAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 失败的账户
    @NameInMap("fail_list")
    public java.util.List<String> failList;

    // 失败的个数
    @NameInMap("fail_num")
    public Long failNum;

    // 成功的个数
    @NameInMap("success_num")
    public Long successNum;

    public static BatchcreateDigitalassetartAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDigitalassetartAccountResponse self = new BatchcreateDigitalassetartAccountResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateDigitalassetartAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateDigitalassetartAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateDigitalassetartAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateDigitalassetartAccountResponse setFailList(java.util.List<String> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<String> getFailList() {
        return this.failList;
    }

    public BatchcreateDigitalassetartAccountResponse setFailNum(Long failNum) {
        this.failNum = failNum;
        return this;
    }
    public Long getFailNum() {
        return this.failNum;
    }

    public BatchcreateDigitalassetartAccountResponse setSuccessNum(Long successNum) {
        this.successNum = successNum;
        return this;
    }
    public Long getSuccessNum() {
        return this.successNum;
    }

}
