// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上资产持有者信息
    public class ChainInsightAssetOwner : TeaModel {
        // 持有者地址
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 合约地址
        [NameInMap("contract_addr")]
        [Validation(Required=true)]
        public string ContractAddr { get; set; }

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 数字权证链1155合约特有的分片ID
        [NameInMap("shard_id")]
        [Validation(Required=false)]
        public string ShardId { get; set; }

        // 资产类型：ERC721 / ERC1155
        [NameInMap("erc_type")]
        [Validation(Required=true)]
        public string ErcType { get; set; }

        // 数字资产余额
        [NameInMap("balance")]
        [Validation(Required=true)]
        public long? Balance { get; set; }

        // 该账户对该资产最近一次转让交易的哈希
        [NameInMap("update_tx_hash")]
        [Validation(Required=true)]
        public string UpdateTxHash { get; set; }

        // 该账户对该资产最近一次转让交易所在区块高度
        [NameInMap("update_block_height")]
        [Validation(Required=true)]
        public long? UpdateBlockHeight { get; set; }

        // 该账户对该资产最近一次转让交易所在区块的创建时间，单位：毫秒
        [NameInMap("update_block_time")]
        [Validation(Required=true)]
        public long? UpdateBlockTime { get; set; }

    }

}
