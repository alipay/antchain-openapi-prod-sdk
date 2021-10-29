// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baas_midway.models;

import com.aliyun.tea.*;

public class QueryBlockchainResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 区块链信息列表
    @NameInMap("blockchain_info_list")
    public java.util.List<BlockchainInfo> blockchainInfoList;

    public static QueryBlockchainResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainResponse self = new QueryBlockchainResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainResponse setBlockchainInfoList(java.util.List<BlockchainInfo> blockchainInfoList) {
        this.blockchainInfoList = blockchainInfoList;
        return this;
    }
    public java.util.List<BlockchainInfo> getBlockchainInfoList() {
        return this.blockchainInfoList;
    }

}
