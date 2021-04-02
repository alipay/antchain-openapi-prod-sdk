// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ImportPeripheralResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 链上外围设备Id
    // 
    // 
    @NameInMap("chain_peripheral_id")
    public String chainPeripheralId;

    public static ImportPeripheralResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportPeripheralResponse self = new ImportPeripheralResponse();
        return TeaModel.build(map, self);
    }

    public ImportPeripheralResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportPeripheralResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportPeripheralResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportPeripheralResponse setChainPeripheralId(String chainPeripheralId) {
        this.chainPeripheralId = chainPeripheralId;
        return this;
    }
    public String getChainPeripheralId() {
        return this.chainPeripheralId;
    }

}
