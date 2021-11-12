// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 集群pod信息
    public class ClusterInfo : TeaModel {
        // 产品信息
        [NameInMap("prod_infos")]
        [Validation(Required=true)]
        public List<ProdInfo> ProdInfos { get; set; }

    }

}
