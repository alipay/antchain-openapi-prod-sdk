// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 资产合约信息
    public class ChainInsightAssetContractInfo : TeaModel {
        // 资产类型：ERC721 / ERC1155
        [NameInMap("erc_type")]
        [Validation(Required=false)]
        public string ErcType { get; set; }

        // 资产总量
        [NameInMap("asset_count")]
        [Validation(Required=false)]
        public long? AssetCount { get; set; }

        // 持有者总量
        [NameInMap("owner_count")]
        [Validation(Required=false)]
        public long? OwnerCount { get; set; }

    }

}
