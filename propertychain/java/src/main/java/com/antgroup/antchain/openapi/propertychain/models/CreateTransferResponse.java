// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateTransferResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求id
    @NameInMap("request_id")
    public String requestId;

    // long类型时间戳
    @NameInMap("date")
    public Long date;

    // 实体类中包含两个变量
    @NameInMap("blockchain_info")
    public BlockchainInfo blockchainInfo;

    public static CreateTransferResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransferResponse self = new CreateTransferResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransferResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateTransferResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateTransferResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateTransferResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTransferResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public CreateTransferResponse setBlockchainInfo(BlockchainInfo blockchainInfo) {
        this.blockchainInfo = blockchainInfo;
        return this;
    }
    public BlockchainInfo getBlockchainInfo() {
        return this.blockchainInfo;
    }

}
