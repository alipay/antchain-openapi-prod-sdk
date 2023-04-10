// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 协作网络治理节点批准普通节点加入后返回给普通节点的信息
    public class NetworkEntranceInfo : TeaModel {
        //  
        [NameInMap("network_id")]
        [Validation(Required=true)]
        public string NetworkId { get; set; }

        //  
        [NameInMap("entrance_info")]
        [Validation(Required=true)]
        public string EntranceInfo { get; set; }

    }

}
