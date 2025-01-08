// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ffd8f5e932224d668101af0154daa8a6.models;

import com.aliyun.tea.*;

public class ExecAntcloudBxptnewDataproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务返回值
    // 
    @NameInMap("biz_result")
    public String bizResult;

    // 是否计费标识
    // Y 表示计费，N 表示不计费
    @NameInMap("charge_flag")
    public String chargeFlag;

    public static ExecAntcloudBxptnewDataproductResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudBxptnewDataproductResponse self = new ExecAntcloudBxptnewDataproductResponse();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudBxptnewDataproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecAntcloudBxptnewDataproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecAntcloudBxptnewDataproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecAntcloudBxptnewDataproductResponse setBizResult(String bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public String getBizResult() {
        return this.bizResult;
    }

    public ExecAntcloudBxptnewDataproductResponse setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
        return this;
    }
    public String getChargeFlag() {
        return this.chargeFlag;
    }

}
