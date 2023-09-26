// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上资产流转信息
    public class ChainInsightAssetOperation : TeaModel {
        // 合约地址
        [NameInMap("contract_addr")]
        [Validation(Required=true)]
        public string ContractAddr { get; set; }

        // 流转交易哈希
        [NameInMap("tx_id")]
        [Validation(Required=true)]
        public string TxId { get; set; }

        // 转让执行者地址，ERC1155资产会有
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 资产转出地址
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 资产转入地址
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 数字权证链的1155资产的分片ID
        [NameInMap("shard_id")]
        [Validation(Required=false)]
        public string ShardId { get; set; }

        // 资产转让数量
        [NameInMap("asset_value")]
        [Validation(Required=true)]
        public long? AssetValue { get; set; }

        // 资产流转交易所在区块的创建时间，单位：毫秒
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 流转交易所在块高
        [NameInMap("block_height")]
        [Validation(Required=true)]
        public long? BlockHeight { get; set; }

    }

}
