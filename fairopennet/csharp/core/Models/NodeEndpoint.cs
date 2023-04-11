// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FAIROPENNET.Models
{
    // 描述cube节点
    public class NodeEndpoint : TeaModel {
        //  
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        //  
        [NameInMap("port")]
        [Validation(Required=true)]
        public string Port { get; set; }

    }

}
