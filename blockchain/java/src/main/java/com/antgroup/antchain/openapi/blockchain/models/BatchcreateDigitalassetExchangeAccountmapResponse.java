// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchcreateDigitalassetExchangeAccountmapResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 返回失败账户列表
    @NameInMap("fail_list")
    public java.util.List<String> failList;

    // 失败数量
    @NameInMap("fail_num")
    public Long failNum;

    // 成功数量
    @NameInMap("success_num")
    public Long successNum;

    public static BatchcreateDigitalassetExchangeAccountmapResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDigitalassetExchangeAccountmapResponse self = new BatchcreateDigitalassetExchangeAccountmapResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateDigitalassetExchangeAccountmapResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchcreateDigitalassetExchangeAccountmapResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchcreateDigitalassetExchangeAccountmapResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchcreateDigitalassetExchangeAccountmapResponse setFailList(java.util.List<String> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<String> getFailList() {
        return this.failList;
    }

    public BatchcreateDigitalassetExchangeAccountmapResponse setFailNum(Long failNum) {
        this.failNum = failNum;
        return this;
    }
    public Long getFailNum() {
        return this.failNum;
    }

    public BatchcreateDigitalassetExchangeAccountmapResponse setSuccessNum(Long successNum) {
        this.successNum = successNum;
        return this;
    }
    public Long getSuccessNum() {
        return this.successNum;
    }

}
