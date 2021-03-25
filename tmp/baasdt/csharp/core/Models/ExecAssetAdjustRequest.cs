// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecAssetAdjustRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 风控调整数量
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 风控调整信息
        [NameInMap("info")]
        [Validation(Required=false)]
        public string Info { get; set; }

        // 外部交易ID，每个租户保证唯一
        [NameInMap("out_tx_id")]
        [Validation(Required=true)]
        public string OutTxId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

    }

}
