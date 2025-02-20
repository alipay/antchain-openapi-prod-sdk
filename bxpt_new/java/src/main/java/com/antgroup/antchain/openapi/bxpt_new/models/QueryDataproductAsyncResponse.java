// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bxpt_new.models;

import com.aliyun.tea.*;

public class QueryDataproductAsyncResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 执行状态
    // INIT：请求已受理
    // RUNNING：执行中
    // SUCCESS：成功
    // FAIL：失败
    @NameInMap("exec_status")
    public String execStatus;

    // 业务返回值
    // 
    @NameInMap("biz_result")
    public String bizResult;

    // 是否计费标识 Y 表示计费，N 表示不计费
    // 
    @NameInMap("charge_flag")
    public String chargeFlag;

    public static QueryDataproductAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataproductAsyncResponse self = new QueryDataproductAsyncResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataproductAsyncResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDataproductAsyncResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDataproductAsyncResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDataproductAsyncResponse setExecStatus(String execStatus) {
        this.execStatus = execStatus;
        return this;
    }
    public String getExecStatus() {
        return this.execStatus;
    }

    public QueryDataproductAsyncResponse setBizResult(String bizResult) {
        this.bizResult = bizResult;
        return this;
    }
    public String getBizResult() {
        return this.bizResult;
    }

    public QueryDataproductAsyncResponse setChargeFlag(String chargeFlag) {
        this.chargeFlag = chargeFlag;
        return this;
    }
    public String getChargeFlag() {
        return this.chargeFlag;
    }

}
