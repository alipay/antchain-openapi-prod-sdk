// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BaseResponseData extends TeaModel {
    // 区块链交易执行的区块高度
    @NameInMap("block_number")
    @Validation(required = true)
    public Long blockNumber;

    // 交易的业务幂等Id,与交易发起时外部传入的一致
    @NameInMap("out_biz_id")
    @Validation(required = true)
    public String outBizId;

    // 区块链交易执行的哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    public static BaseResponseData build(java.util.Map<String, ?> map) throws Exception {
        BaseResponseData self = new BaseResponseData();
        return TeaModel.build(map, self);
    }

    public BaseResponseData setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public BaseResponseData setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public BaseResponseData setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
