// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models
{
    // 上链数据结果集
    public class ChainModelResult : TeaModel {
        // 所属业务
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 资产类型
        [NameInMap("data_scene")]
        [Validation(Required=true)]
        public string DataScene { get; set; }

        // 资产id
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 资产数据内容json
        [NameInMap("asset_data")]
        [Validation(Required=true)]
        public string AssetData { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 上链时间
        [NameInMap("tx_time")]
        [Validation(Required=true)]
        public string TxTime { get; set; }

        // 业务ID
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 上链id
        [NameInMap("antchain_id")]
        [Validation(Required=true)]
        public string AntchainId { get; set; }

    }

}
