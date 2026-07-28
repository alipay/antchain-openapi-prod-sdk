// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class SaveOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 订单同步结果
    @NameInMap("mpaas_save_order_relation_response")
    public MpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse;

    public static SaveOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOrderResponse self = new SaveOrderResponse();
        return TeaModel.build(map, self);
    }

    public SaveOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveOrderResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveOrderResponse setMpaasSaveOrderRelationResponse(MpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse) {
        this.mpaasSaveOrderRelationResponse = mpaasSaveOrderRelationResponse;
        return this;
    }
    public MpaasSaveOrderRelationResponse getMpaasSaveOrderRelationResponse() {
        return this.mpaasSaveOrderRelationResponse;
    }

}
