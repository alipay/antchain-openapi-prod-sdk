// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardBlockResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 区块信息
    @NameInMap("block")
    public Block block;

    // 区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 链ID
    @NameInMap("chain_id")
    public String chainId;

    // 过滤后的交易数量
    @NameInMap("filtered_tx_count")
    public Long filteredTxCount;

    // 区块中交易总数
    @NameInMap("total_tx_count")
    public Long totalTxCount;

    public static QueryConsumecardBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardBlockResponse self = new QueryConsumecardBlockResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardBlockResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardBlockResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardBlockResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardBlockResponse setBlock(Block block) {
        this.block = block;
        return this;
    }
    public Block getBlock() {
        return this.block;
    }

    public QueryConsumecardBlockResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryConsumecardBlockResponse setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryConsumecardBlockResponse setFilteredTxCount(Long filteredTxCount) {
        this.filteredTxCount = filteredTxCount;
        return this;
    }
    public Long getFilteredTxCount() {
        return this.filteredTxCount;
    }

    public QueryConsumecardBlockResponse setTotalTxCount(Long totalTxCount) {
        this.totalTxCount = totalTxCount;
        return this;
    }
    public Long getTotalTxCount() {
        return this.totalTxCount;
    }

}
