// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UnfreezeMallPointResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 解冻结果详情（成功时返回）
    @NameInMap("unfreeze_result")
    public PointUnfreezeResult unfreezeResult;

    public static UnfreezeMallPointResponse build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeMallPointResponse self = new UnfreezeMallPointResponse();
        return TeaModel.build(map, self);
    }

    public UnfreezeMallPointResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UnfreezeMallPointResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UnfreezeMallPointResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UnfreezeMallPointResponse setUnfreezeResult(PointUnfreezeResult unfreezeResult) {
        this.unfreezeResult = unfreezeResult;
        return this;
    }
    public PointUnfreezeResult getUnfreezeResult() {
        return this.unfreezeResult;
    }

}
