// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 消费卡服务OpenAPI基础返回值
    public class BaseResponseData : TeaModel {
        // 区块链交易执行的区块高度
        [NameInMap("block_number")]
        [Validation(Required=true)]
        public long? BlockNumber { get; set; }

        // 交易的业务幂等Id,与交易发起时外部传入的一致
        [NameInMap("out_biz_id")]
        [Validation(Required=true)]
        public string OutBizId { get; set; }

        // 区块链交易执行的哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
