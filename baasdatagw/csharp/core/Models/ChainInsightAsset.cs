// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上资产信息
    public class ChainInsightAsset : TeaModel {
        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 链名称
        [NameInMap("biz_id_name")]
        [Validation(Required=false)]
        public string BizIdName { get; set; }

        // 资产合约地址
        [NameInMap("contract_addr")]
        [Validation(Required=true)]
        public string ContractAddr { get; set; }

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 数字权证链上的1155资产分片ID
        [NameInMap("shard_id")]
        [Validation(Required=false)]
        public string ShardId { get; set; }

        // 资产类型：ERC721 / ERC1155
        [NameInMap("erc_type")]
        [Validation(Required=true)]
        public string ErcType { get; set; }

        // 创建时间，取值为创建时交易所在区块创建的时间，单位：毫秒
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 持有者数量
        [NameInMap("owner_count")]
        [Validation(Required=false)]
        public long? OwnerCount { get; set; }

        // 资产元信息
        [NameInMap("meta_data")]
        [Validation(Required=false)]
        public string MetaData { get; set; }

        // 资产元信息链接
        [NameInMap("uri")]
        [Validation(Required=false)]
        public string Uri { get; set; }

        // 账户名下该资产的余额 / 合约下该资产的总供应量
        [NameInMap("balance")]
        [Validation(Required=false)]
        public long? Balance { get; set; }

        // 该资产最近一笔交易的哈希
        [NameInMap("latest_tx_hash")]
        [Validation(Required=true)]
        public string LatestTxHash { get; set; }

        // 该资产最近一笔交易所在区块的创建时间
        [NameInMap("latest_tx_time")]
        [Validation(Required=true)]
        public long? LatestTxTime { get; set; }

    }

}
