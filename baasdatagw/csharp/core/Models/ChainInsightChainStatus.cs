// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链状态信息
    public class ChainInsightChainStatus : TeaModel {
        // 节点信息
        [NameInMap("node_infos")]
        [Validation(Required=false)]
        public List<ChainInsightNodeInfo> NodeInfos { get; set; }

        // 链状态
        [NameInMap("chain_statuses")]
        [Validation(Required=false)]
        public List<ChainStatus> ChainStatuses { get; set; }

    }

}
