// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgePetmallorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商城业务订单号
    @NameInMap("biz_order_no")
    public String bizOrderNo;

    // Y-成功
    // N-失败
    @NameInMap("update_result")
    public String updateResult;

    // 失败原因
    @NameInMap("fail_reason")
    public String failReason;

    public static UpdateDubbridgePetmallorderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgePetmallorderResponse self = new UpdateDubbridgePetmallorderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgePetmallorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDubbridgePetmallorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDubbridgePetmallorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDubbridgePetmallorderResponse setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public UpdateDubbridgePetmallorderResponse setUpdateResult(String updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public String getUpdateResult() {
        return this.updateResult;
    }

    public UpdateDubbridgePetmallorderResponse setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

}
