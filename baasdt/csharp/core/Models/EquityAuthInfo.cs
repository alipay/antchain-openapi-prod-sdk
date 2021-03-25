// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商品授权信息（一客一价信息）
    public class EquityAuthInfo : TeaModel {
        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 商品ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 授权租户
        [NameInMap("open_to_tenant_id")]
        [Validation(Required=true)]
        public string OpenToTenantId { get; set; }

        // 租户价格（自定义价格）
        [NameInMap("tenant_price")]
        [Validation(Required=true)]
        public string TenantPrice { get; set; }

        // 区块高度
        [NameInMap("block_number")]
        [Validation(Required=true)]
        public string BlockNumber { get; set; }

        // 交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 区块时间戳
        [NameInMap("block_time")]
        [Validation(Required=true)]
        public long? BlockTime { get; set; }

    }

}
