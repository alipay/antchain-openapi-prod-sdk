// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DeductMallPointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 扣减结果详情（成功时返回）
    @NameInMap("deduct_result")
    public PointDeductResult deductResult;

    public static DeductMallPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeductMallPointResponse self = new DeductMallPointResponse();
        return TeaModel.build(map, self);
    }

    public DeductMallPointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeductMallPointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeductMallPointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeductMallPointResponse setDeductResult(PointDeductResult deductResult) {
        this.deductResult = deductResult;
        return this;
    }
    public PointDeductResult getDeductResult() {
        return this.deductResult;
    }

}
