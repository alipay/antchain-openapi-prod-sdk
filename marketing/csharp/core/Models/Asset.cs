// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // 情报资产详情
    public class Asset : TeaModel {
        // 资产标识，作为幂等单号
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // VALID - 生效；INVALID - 作废
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 资产详情，自定义展示
        [NameInMap("asset_info")]
        [Validation(Required=true)]
        public string AssetInfo { get; set; }

    }

}
