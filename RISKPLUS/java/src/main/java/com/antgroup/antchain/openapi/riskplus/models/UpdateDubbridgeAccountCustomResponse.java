// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgeAccountCustomResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 更新渠道返回体
    @NameInMap("data")
    public UpdateCustomerRelationResponseData data;

    public static UpdateDubbridgeAccountCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgeAccountCustomResponse self = new UpdateDubbridgeAccountCustomResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgeAccountCustomResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDubbridgeAccountCustomResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDubbridgeAccountCustomResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDubbridgeAccountCustomResponse setData(UpdateCustomerRelationResponseData data) {
        this.data = data;
        return this;
    }
    public UpdateCustomerRelationResponseData getData() {
        return this.data;
    }

}
