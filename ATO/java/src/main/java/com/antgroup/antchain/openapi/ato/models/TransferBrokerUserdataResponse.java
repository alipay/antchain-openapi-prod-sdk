// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TransferBrokerUserdataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据id
    @NameInMap("data_id")
    public String dataId;

    public static TransferBrokerUserdataResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferBrokerUserdataResponse self = new TransferBrokerUserdataResponse();
        return TeaModel.build(map, self);
    }

    public TransferBrokerUserdataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public TransferBrokerUserdataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public TransferBrokerUserdataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public TransferBrokerUserdataResponse setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
