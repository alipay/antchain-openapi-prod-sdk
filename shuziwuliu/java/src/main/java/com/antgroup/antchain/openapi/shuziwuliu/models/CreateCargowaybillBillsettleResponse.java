// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateCargowaybillBillsettleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上凭证
    @NameInMap("tx_code")
    public String txCode;

    public static CreateCargowaybillBillsettleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCargowaybillBillsettleResponse self = new CreateCargowaybillBillsettleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCargowaybillBillsettleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateCargowaybillBillsettleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateCargowaybillBillsettleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateCargowaybillBillsettleResponse setTxCode(String txCode) {
        this.txCode = txCode;
        return this;
    }
    public String getTxCode() {
        return this.txCode;
    }

}
