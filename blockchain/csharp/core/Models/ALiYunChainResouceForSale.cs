// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云区块链售卖资源信息
    public class ALiYunChainResouceForSale : TeaModel {
        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // type_list
        [NameInMap("type_list")]
        [Validation(Required=false)]
        public List<string> TypeList { get; set; }

    }

}
