// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 物权信息
    public class AssetInfo : TeaModel {
        // 资产Id
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 数据字典Id
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 资产内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 链信息
        [NameInMap("blockchain_info")]
        [Validation(Required=false)]
        public BlockchainInfo BlockchainInfo { get; set; }

        // 短码
        [NameInMap("qr_code")]
        [Validation(Required=false)]
        public string QrCode { get; set; }

    }

}
