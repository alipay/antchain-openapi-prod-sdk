// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryBlockanalysisNextblockResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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

    // 下一个需要检查的高度
    @NameInMap("next_block_number")
    public Long nextBlockNumber;

    public static QueryBlockanalysisNextblockResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockanalysisNextblockResponse self = new QueryBlockanalysisNextblockResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockanalysisNextblockResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockanalysisNextblockResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockanalysisNextblockResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockanalysisNextblockResponse setBlock(Block block) {
        this.block = block;
        return this;
    }
    public Block getBlock() {
        return this.block;
    }

    public QueryBlockanalysisNextblockResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryBlockanalysisNextblockResponse setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public QueryBlockanalysisNextblockResponse setFilteredTxCount(Long filteredTxCount) {
        this.filteredTxCount = filteredTxCount;
        return this;
    }
    public Long getFilteredTxCount() {
        return this.filteredTxCount;
    }

    public QueryBlockanalysisNextblockResponse setTotalTxCount(Long totalTxCount) {
        this.totalTxCount = totalTxCount;
        return this;
    }
    public Long getTotalTxCount() {
        return this.totalTxCount;
    }

    public QueryBlockanalysisNextblockResponse setNextBlockNumber(Long nextBlockNumber) {
        this.nextBlockNumber = nextBlockNumber;
        return this;
    }
    public Long getNextBlockNumber() {
        return this.nextBlockNumber;
    }

}
