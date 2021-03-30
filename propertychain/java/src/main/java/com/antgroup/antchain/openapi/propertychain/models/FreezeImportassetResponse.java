// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class FreezeImportassetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链信息
    @NameInMap("blockchain_info")
    public BlockchainInfo blockchainInfo;

    // 时间
    @NameInMap("date")
    public Long date;

    // 请求标识
    @NameInMap("request_id")
    public String requestId;

    public static FreezeImportassetResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeImportassetResponse self = new FreezeImportassetResponse();
        return TeaModel.build(map, self);
    }

    public FreezeImportassetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public FreezeImportassetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public FreezeImportassetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FreezeImportassetResponse setBlockchainInfo(BlockchainInfo blockchainInfo) {
        this.blockchainInfo = blockchainInfo;
        return this;
    }
    public BlockchainInfo getBlockchainInfo() {
        return this.blockchainInfo;
    }

    public FreezeImportassetResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public FreezeImportassetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
