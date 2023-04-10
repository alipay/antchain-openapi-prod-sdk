// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 普通节点身份信息，作为加入协作网络提供的材料
    public class NormalNodeIdentityInfo : TeaModel {
        //  
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        //  
        [NameInMap("identity_info")]
        [Validation(Required=true)]
        public string IdentityInfo { get; set; }

    }

}
