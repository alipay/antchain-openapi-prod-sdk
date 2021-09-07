// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class UpdateGoodsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链交易信息
    @NameInMap("blockchain_info")
    public BlockchainInfoDTO blockchainInfo;

    public static UpdateGoodsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGoodsResponse self = new UpdateGoodsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGoodsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateGoodsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateGoodsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateGoodsResponse setBlockchainInfo(BlockchainInfoDTO blockchainInfo) {
        this.blockchainInfo = blockchainInfo;
        return this;
    }
    public BlockchainInfoDTO getBlockchainInfo() {
        return this.blockchainInfo;
    }

}
